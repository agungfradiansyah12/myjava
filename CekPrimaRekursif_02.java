import java.util.Scanner;

public class CekPrimaRekursif_02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int n = sc02.nextInt();

        if (cekPrimaRekursif(n, 2)) {
            System.out.println(n + " Merupakan bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }

        sc02.close();
    }

    static boolean cekPrimaRekursif(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (i == n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }

        return cekPrimaRekursif(n, i + 1);
    }
}
