import java.util.Scanner;

public class Cramersrule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        System.out.print("Enter value of d: ");
        double d = sc.nextDouble();

        System.out.print("Enter value of e: ");
        double e = sc.nextDouble();

        System.out.print("Enter value of f: ");
        double f = sc.nextDouble();

        // Calculate determinants
        double D = a * d - b * c;
        double Dx = e * d - b * f;
        double Dy = a * f - e * c;

        // Check if solution exists
        if (D == 0) {
            System.out.println("the solution not exists (denominator is zero).");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.println("Solution:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        sc.close();
    }
}
