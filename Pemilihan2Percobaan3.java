import java.util.Scanner;

public class Pemilihan2Percobaan3 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        String kategori;
        int penghasilan;
        double pajak;
        int gajiBersih;

        System.out.print("Masukkan kategori : ");
        kategori = input02.nextLine();

        System.out.print("Masukkan Penghasilan : ");
        penghasilan = input02.nextInt();

        if(kategori.equalsIgnoreCase("pekerja")){
            if(penghasilan<=2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak=0.2;

            gajiBersih = (int)(penghasilan-(penghasilan*pajak));
            System.out.println("gaji bersih : " + gajiBersih);
        }else if(kategori.equalsIgnoreCase("pebisnis")){
            if(penghasilan<=2500000)
                pajak = 0.15;
            else if(penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;

            gajiBersih = (int)(penghasilan-(penghasilan*pajak));
            System.out.println("gaji bersih : " + gajiBersih);
        }else{
        System.out.println("katagori salah");
        }
    }
}
