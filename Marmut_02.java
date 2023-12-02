import java.util.Scanner;

public class Marmut_02 {

    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan bulan: ");
        int jumlahBulan = sc02.nextInt();

        System.out.println("====================================================================================");
        System.out.println("|  Bulan  |  Pasangan Produktif   |  Pasangan Belum produktif  |  Total Pasangan   |");
        System.out.println("|---------|-----------------------|----------------------------|-------------------|");

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            int totalPasangan = hitungPasMarmut(bulan);
            int jumlahPasangan = hitungPasMarmut(bulan - 1);
            int blmProduktif = hitungPasMarmut(bulan - 2);

            System.out.printf("|  %-6d |  %-20d |  %-24d  |  %-16d |\n", bulan, blmProduktif, jumlahPasangan, totalPasangan);

            if (bulan == jumlahBulan) {
                System.out.println("\nJumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah " + totalPasangan);
            }
        }
    }

    public static int hitungPasMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else if (bulan < 1) {
            return 0;
        } else {
            return hitungPasMarmut(bulan - 2) + hitungPasMarmut(bulan - 1);
        }
    }
}
