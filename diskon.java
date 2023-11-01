import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jenis buku: ");
        String jenisBuku = input.nextLine().toLowerCase();
        System.out.print("Jumlah buku: ");
        int jumlahBuku = input.nextInt();

        int totalDiskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            totalDiskon = 10;
            if (jumlahBuku > 2) {
                totalDiskon += 2;
            } 
        }
        else if (jenisBuku.equalsIgnoreCase("novel")) {
            totalDiskon = 7;
            if (jumlahBuku > 3) {
                totalDiskon += 2;
            } 
        }
        else {
            if (jumlahBuku > 3) {
                totalDiskon += 5;
            }
        }

        System.out.println("Total diskon yang diterima: " + totalDiskon + "%");

        input.close();
    }
}
