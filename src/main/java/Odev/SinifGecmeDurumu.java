package Odev;
import java.util.Scanner;
public class SinifGecmeDurumu {
   // Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notlar[] = new int[5];
        String dersler[] = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int toplamNot = 0;
        int dersSayisi = dersler.length;
        for (int i = 0; i < dersSayisi; i++) {
            int not;
            do {
                System.out.print(dersler[i] + " notunu giriniz: ");
                not = scanner.nextInt();

                if (not < 0 || not > 100) {
                    System.out.println("Lütfen geçerli bir not giriniz.");
                }
            } while (not < 0 || not > 100);
            notlar[i] = not;
            toplamNot += notlar[i];
        }
        double ortalama = (double) toplamNot / dersSayisi;

        if (ortalama >= 55) {
            System.out.println("Ortalama: " + ortalama);
            System.out.println("Geçtiniz");
        } else {
            System.out.println("Ortalama: " + ortalama);
            System.out.println("Kaldınız");
        }

    }
}






