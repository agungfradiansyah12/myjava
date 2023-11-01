import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jenis buku dan jumlah buku
        System.out.print("Jenis buku (Kamus/Novel/Lainnya): ");
        String jenisBuku = input.nextLine().toLowerCase();
        System.out.print("Jumlah buku: ");
        int jumlahBuku = input.nextInt();

        // Inisialisasi total diskon
        int totalDiskon = 0;

        // Diskon untuk jenis buku "Kamus"
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                totalDiskon += 10;
            } else if (jumlahBuku > 0) {
                totalDiskon += 0;
            }
        }
        // Diskon untuk jenis buku "Novel"
        else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                totalDiskon += 7;
            } else if (jumlahBuku > 0) {
                totalDiskon += 1;
            }
        }
        // Diskon untuk buku selain "Kamus" dan "Novel"
        else {
            if (jumlahBuku > 3) {
                totalDiskon += 5;
            } else if (jumlahBuku > 0) {
                totalDiskon += 0;
            }
        }

        // Tampilkan total diskon
        System.out.println("Total diskon yang diterima: " + totalDiskon + "%");

        input.close();
    }
}
