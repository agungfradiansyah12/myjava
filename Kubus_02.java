import java.util.Scanner;

public class Kubus_02 {
    private double sisi;

    public Kubus_02(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        double volume = Math.pow(sisi, 3);
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisiKubus = sc02.nextDouble();

        Kubus_02 kubus = new Kubus_02(sisiKubus);
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

        sc02.close();
    }
}
