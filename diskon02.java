import java.util.Scanner;

public class diskon02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        int diskon;
        String jenis;
        int jumlah, totdiskon;

        System.out.print("Masukkan jenis : ");
        jenis = input02.nextLine();

        System.out.print("Masukkan jumlah : ");
        jumlah = input02.nextInt();

        if(jenis.equalsIgnoreCase("kamus")||jenis.equalsIgnoreCase("buku")){
            if(jenis.equalsIgnoreCase("buku")){
                if(jumlah>2){
                   int totdiskon2 = 10+2;
                    System.out.println(totdiskon2);
                }else{
                    System.out.println("10%");
                }
            }else {
                if(jumlah>3){
                    int totdiskon3 = 7+2;
                    System.out.println(totdiskon3);
                }else{
                    int totdiskon4 = 7+1;
                    System.out.println(totdiskon4);
                }
            }
        }else if(jumlah>3){
            totdiskon = 0+5;
            System.out.println("total diskon " +totdiskon);
        }else{
            System.out.println("tidak dapat diskon");
        }
    }
}
