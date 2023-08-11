package Odev;
import java.util.Scanner;
public class ScannerOdev {
    public static void main(String[] args) {
        int math, fizik, kimya, turkce,tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Matematik notunuzu giriniz");
        math=inp.nextInt();

        System.out.println("Lütfen Fizik notunuzu giriniz");
        fizik=inp.nextInt();

        System.out.println("Lütfen Kimya notunuzu giriniz");
        kimya=inp.nextInt();

        System.out.println("Lütfen Türkce notunuzu giriniz");
        turkce=inp.nextInt();

        System.out.println("Lütfen Tarih notunuzu giriniz");
        tarih=inp.nextInt();

        System.out.println("Lütfen Muzik notunuzu giriniz");
        muzik=inp.nextInt();

        double top = (math+fizik+kimya+turkce+tarih+muzik);
        double ortalama = top/6.0;
        System.out.println("Ortalama   " +   ortalama);

        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}
