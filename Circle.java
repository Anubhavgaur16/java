import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();
        
        System.out.print("Enter is circle? (true / false): ");
        boolean isCircle = scanner.nextBoolean();

        if(isCircle){
            double circumference = 2 * Math.PI * r;
            double area = Math.PI * Math.pow(r, 2);

            System.out.printf("Circumference of circle is: %.2f\n", circumference);
            System.out.printf("Area of circle is: %.2f ", area);

        }
        else{
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

            System.out.printf("Volume of sphere is: %.2f ", volume);
        }

        scanner.close();
    }
}
