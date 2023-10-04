import java.util.Scanner;

public class cobagaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, TotGaji ;
        int gaji = 40000, potGaji = 25000;

        System.out.println("Masukkan jumlah Masuk");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah tidak masuk");
        jmlTdkMasuk = input.nextInt();

        
        TotGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);

        System.out.println("Total Gaji yang anda terima adalah " + TotGaji);
    }
}
