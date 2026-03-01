import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        //nextLine() reads strings with spaces next() reads strings without spaces, change next() in place of nextline() to check.

        System.out.print("Enter you age: ");
        int age = scanner.nextInt();
        //nextInt() reads integer values.

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        //nextDouble() reads the decimal values.

        System.out.print("Are you a student? (true / false): ");
        boolean isStudent = scanner.nextBoolean();
        //nextBoolean() reads the boolean values.

        System.out.println("Hello " + name);
        System.out.println("you are " + age + " years old.");
        System.out.println("your GPA is: " + gpa);

        if(isStudent){
            System.out.println("you are enrolled as a student.");
        }
        else{
            System.out.println("you are NOT enrolled as a student.");
        }

        scanner.close();
    }
}
