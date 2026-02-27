import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        //nextLine() reads strings with spaces next() reads strings without spaces, change next() in place of nextline() to check.

        System.out.print("Enter you age: ");
        int age = scanner.nextInt();
        //nextInt reads integer values.

        System.out.println("Hello " + name);
        System.out.println("you are " + age + " years old.");

        scanner.close();
    }
}
