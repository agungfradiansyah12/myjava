import java.util.Scanner;

public class fpsTernary02{
    public static void main(String[] args) {
        Scanner input02 = new Scanner( System.in);
        float jarak;
        String senjata;

        System.out.print("Masukkan Jarak(meter) : ");
        jarak = input02.nextFloat();

        senjata = (jarak <=5) ? "mele weapon" : "ranged weapon";
        
        System.out.println("Dijarak " + jarak + " meter, maka senjata yang anda gunakan sebaiknya "+ senjata);

    }
}