import java.util.Scanner;

public class Pemilihan2Percobaan1_02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        int tahun;
        
        System.out.print("Masukkan tahun: ");
        tahun = input02.nextInt();


        if((tahun % 4 ) == 0){
            if((tahun%100)!=0){
                System.out.println("tahun kabisat");
            }else if(tahun % 400 == 0){
                System.out.println("tahun kabisat");
            }else{
                System.out.println("bukan tahun kabisat");
            }
        }else{
           System.out.println("Bukan tahunnn kabisat"); 
        }

    }         
}
