package strings;

import java.util.*;

public class StringPathChangerNew {

    public String changeDirectoryString(String currentDirectory, String command) {
        // Use a Deque to simulate a stack for directory levels
        Deque<String> pathStack = new ArrayDeque<>();

        // Split and normalize the current directory path
        String[] currentParts = currentDirectory.split("/");
        for (String part : currentParts) {
            if (!part.isEmpty()) {
                pathStack.addLast(part);
            }
        }

        // Process the command path
        String[] commandParts = command.split("/");
        for (String part : commandParts) {
            if (part.equals("..")) {
                if (!pathStack.isEmpty()) {
                    pathStack.removeLast(); // Go one level up
                }
            } else if (!part.equals(".") && !part.isEmpty()) {
                pathStack.addLast(part); // Go one level down
            }
            // else part is "." or empty, which we ignore
        }

        // Rebuild the path
        StringBuilder result = new StringBuilder("/");
        Iterator<String> it = pathStack.iterator();
        while (it.hasNext()) {
            result.append(it.next());
            if (it.hasNext()) {
                result.append("/");
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        StringPathChanger pathChanger = new StringPathChanger();

        // Test cases
        System.out.println(pathChanger.changeDirectoryString("/test/task/java", "cd /test/task"));
    }
}

