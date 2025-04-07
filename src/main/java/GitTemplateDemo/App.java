/*
 * Application entry point.
 */
package GitTemplateDemo;

public class App {
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

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
