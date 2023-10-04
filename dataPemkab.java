import java.util.Scanner;

public class dataPemkab {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        long penghasilan;

        System.out.print("Masukkan jumlah penghasilan : ");
        penghasilan = data.nextLong();

        if(penghasilan>10000000){
            System.out.println("Keluarga tersebut kaya");
        }else{
            System.out.println("keluarga tersebut kurang mampu");
        }
    }
}
