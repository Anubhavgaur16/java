import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        //use pythagoreas formula and Math class to find hypotenuse of a trinagle

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter perpendicular: ");
        double perpendicular = scanner.nextDouble();

        System.out.print("Enter base: ");
        double base = scanner.nextDouble();

        double result = Math.sqrt(Math.pow(perpendicular, 2) + Math.pow(base, 2));

        System.out.println("Length of hypotenuse is: " + result);

        scanner.close();
    }
}
