import java.util.Scanner;

public class tugasSegitigaBintang_02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan nilai (minimal 5): ");
        int n = sc02.nextInt();

        if (n < 5) {
            System.out.println("Nilai harus minimal 5");
            return;
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc02.close();
    }
}
