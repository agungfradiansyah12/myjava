public class ContohVariabel02{
    public static void main(String[] args) {
        String hoby = "Fotografi";
        boolean Pandai = true ;
        char jenisKelamin = 'L';
        byte umur = 20;
        double $ipk = 3.75, tinggi = 1.69;
        System.out.println("Hobi saya adalah " + hoby);
        System.out.println("Apakah pandai? " + Pandai);
        System.out.println("Jenis kelamin   : " + jenisKelamin);
        System.out.println("Umurku saat ini : " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}