import java.util.Scanner;

public class lingkaran02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double keliling, luas;
        double phi = 3.14;

        System.out.println("Masukkan jari-jari Lingkaran");
        System.out.print("r = ");
        r = input.nextInt();

        keliling = 2*phi*r;
        luas = phi*r*r;
        
        System.out.println("Keliling Lingkaran adalah "+ keliling );
        System.out.println("Luas Lingkaran adalah "+ luas);
    }
}
