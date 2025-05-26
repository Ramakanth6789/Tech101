package strings;

import java.util.*;

public class StringPathChanger {

    /**
     * Changes the directory path based on the given command, mimicking the 'cd' command.
     *
     * @param currentDirectory The current absolute directory path.
     * @param command          The 'cd' command to execute.
     * @return The resulting absolute directory path.
     * @throws IllegalArgumentException if the command is invalid
     */
    public String changeDirectoryString(String currentDirectory, String command) {
        // Handle null or empty input
        if (currentDirectory == null || currentDirectory.isEmpty() || command == null || command.isEmpty()) {
            return "/"; // Or throw an exception, depending on desired behavior
        }

        // Check if the command starts with "cd "
        if (!command.startsWith("cd ")) {
            throw new IllegalArgumentException("Command must start with 'cd '");
        }

        // Remove the "cd " prefix
        command = command.substring(3);


        // Use a stack to represent the directory hierarchy
        Stack<String> stack = new Stack<>();

        // Split the current directory path into components
        String[] currentDirs = currentDirectory.split("/");
        for (String dir : currentDirs) {
            if (!dir.isEmpty()) {
                stack.push(dir);
            }
        }

        // Split the command into components
        String[] commands = command.split("/");
        if(commands.length==0){
            return "/";
        }
        for(String cmd: commands){
            if(cmd.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(stack.peek().equals(cmd)){
                stack.pop();
            }
            else if(!cmd.isEmpty()){
                stack.push(cmd);
            }
        }

        // Construct the resulting path
//        StringBuilder resultPath = new StringBuilder("/");
//        for (String dir : stack) {
//            resultPath.append(dir).append("/");
//        }
//
//        // Remove the trailing slash if the path is not just "/"
//        if (resultPath.length() > 1) {
//            resultPath.deleteCharAt(resultPath.length() - 1);
//        }
//
//        return resultPath.toString();
        List<String> normalized = new ArrayList<>(stack);
        Collections.reverse(normalized); // because we used push (LIFO)

        return "/" + String.join("/", normalized);
    }

    public static void main(String[] args) {
        StringPathChanger pathChanger = new StringPathChanger();

        // Test cases
        System.out.println(pathChanger.changeDirectoryString("/test/task/java", "cd /test/task"));
        System.out.println(pathChanger.changeDirectoryString("/home/user", "cd docs"));
        System.out.println(pathChanger.changeDirectoryString("/home/user", "cd ../"));
        System.out.println(pathChanger.changeDirectoryString("/home/user/docs", "cd ../../"));
        System.out.println(pathChanger.changeDirectoryString("/home/user", "cd /var/log"));
        System.out.println(pathChanger.changeDirectoryString("/home/user", "cd ."));
        System.out.println(pathChanger.changeDirectoryString("/home/user", "cd "));
        System.out.println(pathChanger.changeDirectoryString("/", "cd test"));
        System.out.println(pathChanger.changeDirectoryString("/","cd ../"));
        System.out.println(pathChanger.changeDirectoryString("/a/b/c", "cd ../../../.."));
        System.out.println(pathChanger.changeDirectoryString("/a/b/c", "cd /../../.."));
        System.out.println(pathChanger.changeDirectoryString("/a/b/c", "cd "));
        System.out.println(pathChanger.changeDirectoryString("/a/b/c", "cd ."));
        System.out.println(pathChanger.changeDirectoryString("/a/b/c", "cd ./d"));
        System.out.println(pathChanger.changeDirectoryString("/a/b/c", "cd d/e/f"));

//        try {
//            pathChanger.changeDirectoryString("/home/user", "docs"); //should throw exception
//        } catch (IllegalArgumentException e) {
//            System.out.println("Caught expected exception: " + e.getMessage());
//        }

    }
}

