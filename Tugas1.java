import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        double x, x1, x2;

        System.out.print("Masukkan nilai a : ");
        double a = input08.nextDouble();
        System.out.print("Masukkan nilai b : ");
        double b = input08.nextDouble();
        System.out.print("Masukkan nilai c : ");
        double c = input08.nextDouble();

        double D = b*b-4*a*c;

        if (D < 0) {
            System.out.println("imajiner");
        } else if (D > 0) {
            x1 = (-b + Math.sqrt(D))/2*a;
            x2 = (-b - Math.sqrt(D))/2*a;
            System.out.println("x1 = " + x1 + " v x2 = " + x2);
        } else {
            x = -b/2*a;
            System.out.println("x = " + x);
        }
        input08.close();
    }
}