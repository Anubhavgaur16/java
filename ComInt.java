import java.util.Scanner;

public class ComInt {
    public static void main(String[] args) {
        //compound interest calculator
        Scanner scanner = new Scanner(System.in);

        double p;
        double r;
        double n;
        double t;

        
        System.out.print("Enter Principal: ");
        p = scanner.nextDouble();

        System.out.print("Enter rate: ");
        r = scanner.nextDouble() / 100.00;

        System.out.print("Enter how many times it is compounded annaully: ");
        n = scanner.nextDouble(); 
        
        System.out.print("Enter for how much time you want to invest: ");
        t = scanner.nextDouble();

        double amount = p * Math.pow((1 + (r / n)), n*t);

        System.out.printf("Compound Interest after investing it for %.2f years with rate of interest of %.2f is %.2f ", t, r, amount);

        scanner.close();
    }
    
}
