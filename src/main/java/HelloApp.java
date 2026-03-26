/**
 * HelloApp – UC7 – Display "Hello" with Multiple Command-Line Arguments using String.join() Method
 * or Default Message
 *
 * UC 7: Display "Hello" with Multiple Command-Line Arguments using String.join() method
 * or Default Message - The application should accept multiple names as command-line
 * arguments and display a personalized greeting for each user using the String.join()
 * method. If no names are provided, it should display "Hello, World!".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Ali Ahmad
 * @version 7.0
 * @since UC1
 */

public class HelloApp {
    public static void main(String[] args) {

        // If no arguments provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join names with comma
            String names = String.join(", ", args);

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}
