import java.util.Scanner;

public class DoWhileCuti02{
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = input02.nextInt();

        do{
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input02.next();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah hari: ");
                jumlahHari = input02.nextInt();

                while(jumlahHari > jatahCuti){
                    System.out.println("Sisa jatah cuti anda tidak mencukupi. Silahkan coba lagi.");
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                    System.out.print("Jumlah hari: ");
                    jumlahHari = input02.nextInt();
                }
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti: " + jatahCuti);
            }else if(konfirmasi.equalsIgnoreCase("t")){
                break;
            }
        }while(jatahCuti > 0);

    }
}