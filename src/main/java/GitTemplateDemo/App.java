/*
 * Application entry point.
 */
package GitTemplateDemo;

public class App {

    String test;
    /**
     * Returns a greeting message.
     * 
     * @return A string containing the greeting message "Hello world."
     */
    public String getGreeting() {
        return "Hello world!";
    }

    String test;

    public boolean isNameEmpty(String givenName, String familyName) {
        if (givenName != null && familyName != null) {
            return givenName.isEmpty() && familyName.isEmpty();
        }
        return familyName.isEmpty(); // Noncompliant; familyName may be null
    }

    /**
     * Adds two integers and returns the result.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public int addNumbers(int a, int b) {
        return a + b;
    }

    /**
     * The main method serves as the entry point of the application.
     * It prints the greeting message to the console.
     * 
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
