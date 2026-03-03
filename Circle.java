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

            System.out.println("Circumference of circle is: " + circumference);
            System.out.println("Area of circle is: " + area);

        }
        else{
            double volume = (4.0/3.0) * Math.PI * Math.pow(r, 3);

            System.out.println("Volume of sphere is: " + volume);
        }

        scanner.close();
    }
}
