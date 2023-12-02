import java.util.Scanner;

public class PenjumlahanRekursif_02 {

    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(n + " + ");
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai f: ");
        int f = scanner.nextInt();

        scanner.close();

        int hasil = penjumlahanRekursif(f);

        System.out.println(" = " + hasil);
    }
}
