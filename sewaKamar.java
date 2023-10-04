import java.util.Scanner;

public class sewaKamar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        Integer hargaKamarstd = 25000, hargaKamarspr = 50000, hargaKamardlx = 100000, lamaMenginap, jenisKamar;
        double totalHarga;

        System.out.println("--**--Sistem Sewa Kamar Hotel Sido Makmur--**--");
        System.out.print("Nama pelanggan \t\t\t\t: ");
        nama = sc.nextLine();
        System.out.println("=========================================================");
        System.out.println("Pilihan Jenis Kamar");
        System.out.println("1. Harga kamar Standard/hari \t\t: Rp. 25000");
        System.out.println("2. Harga kamar Superior/hari  \t\t: Rp. 50000");
        System.out.println("3. Harga kamar Deluxe/hari \t\t: Rp. 100000");
        System.out.println("=========================================================");
        System.out.print("Pilih nomor opsi kamar yang anda inginkan \t: ");
        jenisKamar = sc.nextInt();
        System.out.print("Lama menginap (/hari) \t\t\t\t: ");
        lamaMenginap = sc.nextInt();
        if(jenisKamar== 1){
            totalHarga = hargaKamarstd*lamaMenginap;
            System.out.println("Harga yang harus dibayar \t\t\t: "+ totalHarga);
        }else if(jenisKamar ==2){
            totalHarga = hargaKamarspr*lamaMenginap;
            System.out.println("Harga yang harus dibayar \t\t\t: "+ totalHarga);
        }else if(jenisKamar ==3){
            totalHarga = hargaKamardlx*lamaMenginap;
            System.out.println("Harga yang harus dibayar \t\t\t: "+ totalHarga);
        }
        System.out.println("=========================================================");
        System.out.println("Silahkan melakukan pembayaran di kasir");
        System.out.println("Terima Kasih Atas Kunjungan Anda");

    }
}
