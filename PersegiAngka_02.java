import java.util.Scanner;

public class PersegiAngka_02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan nilai (minimal 3): ");
        int n = sc02.nextInt();

        if (n < 3) {
            System.out.println("Nilai harus minimal 3");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(" " + n + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        sc02.close();
    }
}
