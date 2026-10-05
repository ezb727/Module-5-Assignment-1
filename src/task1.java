// ezb727
public class task1 {
    public static void main(String[] args) {
        printHelloWorld(3);
    }

    // Prints "Hello World" n times using recursion.
    public static void printHelloWorld(int n) {
        // Stop when there are no more repetitions.
        if (n <= 0) {
            return;
        }

        System.out.println("Hello World");
        // Print the remaining repetitions.
        printHelloWorld(n - 1);
    }
}