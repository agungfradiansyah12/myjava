import java.util.Scanner;

public class PemilihanPercobaan1_02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        int angka;
        String x;

        System.out.print("Masukkan Angka: ");
        angka = input02.nextInt();

        x = (angka % 2 == 0) ? "adalah angka genap" : "adalah angka ganjil ";
        System.out.print(x);

    }
}
