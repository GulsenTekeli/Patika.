package Odev;
import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        int sicaklik = scanner.nextInt();
        if (sicaklik < 5) {
            System.out.println("Kayak yapmayı öneriyoruz.");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Sinema etkinliğini öneriyoruz.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Piknik etkinliğini öneriyoruz.");
        } else if (sicaklik >= 25 && sicaklik < 32) {
            System.out.println("Yüzme etkinliğini öneriyoruz.");
        } else {
            System.out.println("Saat 11 ve 16 arasında dışarı çıkmamayı öneriyoruz.");
            System.out.print("Evde yapabileceğiniz etkinlikler için 1 ile 5 arasında bir sayı giriniz: ");
            int secim = scanner.nextInt();
            if (secim < 1 || secim > 5) {
                System.out.println("Lütfen 1 ile 5 arasında bir sayı giriniz.");
            } else {
                switch (secim) {
                    case 1:
                        System.out.println("Film seyretme etkinliğini öneriyoruz.");
                        break;
                    case 2:
                        System.out.println("Uno oynama etkinliğini öneriyoruz.");
                        break;
                    case 3:
                        System.out.println("Karaoke etkinliğini öneriyoruz.");
                        break;
                    case 4:
                        System.out.println("Tavla ya da okey oynama etkinliğini öneriyoruz.");
                        break;
                    case 5:
                        System.out.println("Tabu oynama etkinliğini öneriyoruz.");
                        break;
                    default:
                        System.out.println("Geçersiz bir seçim yaptınız.");
                        break;
                }
            }
        }

    }

}


