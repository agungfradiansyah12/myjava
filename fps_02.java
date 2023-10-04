import java.util.Scanner;

public class fps_02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner( System.in);
        float jarak;

        System.out.print("Masukkan Jarak(meter) : ");
        jarak = input02.nextFloat();

        if(jarak<=5){
            System.out.print("melle weapon");
        }else{
            System.out.print("Ranged Weapon");
        }
    }
}
