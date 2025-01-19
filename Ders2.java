package Ankara;
import java.util.Scanner;
public class Ders2 {
    public static void main(String[] args) {
        int fiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat Yazınız: ");
        fiyat = input.nextInt();

        double kdv;
        if (fiyat >= 0 && fiyat <= 1000) {
            kdv = 0.18;
            double kvdoran = fiyat * kdv;
            double kdvfiyat = fiyat + kvdoran;
            System.out.println("KDV'siz Fiyat: " + fiyat + "TL");
            System.out.println("KDV'li Fiyat: " + kdvfiyat + "TL");
            System.out.println("Kvdoran: " + kvdoran + "TL");
        }
        if (fiyat > 1000) {
            kdv = 0.08;
            double kvdoran = fiyat * kdv;
            double kdvfiyat = fiyat + kvdoran;
            System.out.println("KDV'siz Fiyat: " + fiyat + "TL");
            System.out.println("KDV'li Fiyat: " + kdvfiyat + "TL");
            System.out.println("Kvdoran: " + kvdoran + "TL");
        }
    }
}