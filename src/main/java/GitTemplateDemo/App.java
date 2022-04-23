/*
 * Application entry point.
 */
package GitTemplateDemo;

public class App {
    public String getGreeting() {
        return "Hello world! s";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
