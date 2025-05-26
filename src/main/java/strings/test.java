package strings;

public class test {
}

/*
the class you need to create will be called SystemConfig. All required classes have been imported for you.

requirements
1.make it a spring framework java based container configuration class.
2.Create a UserRepository bean. It has no args constructor. Additionally you should make sure the method UserRepository.initialize() is called right after the construcion of bean
3. Create a LeagacyPaymentsService bean. it has a no args constructor. it should be available under the name paymentsService.
4. Enable auto-scanning for beans in the com.codility.utils package.
5. the applicaition contains another configuration class that has already been prepare: MaintaenanceConfig. However it's not being picked up by the spring context. You should make sure its beans are also created by configuring the SystemConfig class appropriately
6. Ensure that properties defined in the production.properties file are available in the spring context.

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = "com.codility.utils") // Requirement 4
@Import(MaintaenanceConfig.class) // Requirement 5
@PropertySource("classpath:production.properties") // Requirement 6
public class SystemConfig {

    @Bean(initMethod = "initialize") // Requirement 2
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean(name = "paymentsService") // Requirement 3
    public LeagacyPaymentsService paymentsService() {
        return new LeagacyPaymentsService();
    }
}

 */

/*
Implement the following function inside the StringPathChanger class

public String changeDirectoryString(String currentDirectory, String command)
{ }

Requirements
The function should imitate the behaviour of cd (a command-line shell command used to change the current working directory in various operating systems).

An important thing to note is that the task is purely about string manipulation. you will only be scored for returning the right path( the path to the directory where you would be positioned, if you have actually executed the cd command given as argument). there is no need to change the current working direcotgry on your operating system.
The function takes the string representing current working directory as the first parameter(currentDirectory) and a string representing the shell command to change s tring path of the directory as the second parameter(command)
The first argument of the function always represents an absolute path.
The function should only return the path(in the form of string) to the directory where you would be positioned if you would actually execute the cd command.
The result should always have the leading slash, but the slash at the end(trailing slash) should be omitted.



import java.util.*;

public class StringPathChanger {

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
}

 */


