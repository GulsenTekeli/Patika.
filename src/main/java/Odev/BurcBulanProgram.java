package Odev;
import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gun = 0;
        int ay = 0;

        while (true) {
            System.out.print("Doğum tarihinizin gününü giriniz: ");
            if (scanner.hasNextInt()) {
                gun = scanner.nextInt();
                if (gun < 1 || gun > 31) {
                    System.out.println("Hatalı giriş yaptınız. Gün 1 ile 31 arasında olmalıdır.");
                    continue; // Hata durumunda döngüyü tekrar başlat
                }
            } else {
                System.out.println("Hatalı giriş yaptınız. Gün geçerli bir tamsayı olmalıdır.");
                scanner.next(); // Hatalı girişi temizle
                continue; // Hata durumunda döngüyü tekrar başlat
            }

            System.out.print("Doğum tarihinizin ayını giriniz (örneğin, Ocak için 'Ocak' veya '1' giriniz): ");
            // Küçük harfe çevir
            String ayStr = scanner.next().toLowerCase();
            ay = ayStrToSayi(ayStr);

            if (ay == -1) {
                System.out.println("Hatalı giriş yaptınız. Ay geçerli bir değer olmalıdır.Lütfen Doğum tarihinizin ayını giriniz (örneğin, Ocak için 'Ocak' veya '1' giriniz)");
                scanner.next();
                continue;
            } else if (ay < 1 || ay > 12) {
                System.out.println("Hatalı giriş yaptınız. Ay geçerli bir değer olmalıdır.");
                scanner.next();
                continue;
            } else {
                break; // Geçerli değerler girildi, döngüyü sonlandır
            }
        }

        String burc = bulBurc(gun, ay);
        System.out.println("Burcunuz: " + burc);

        scanner.close();
    }

    public static int ayStrToSayi(String ayStr) {
        if (ayStr.equals("ocak") || ayStr.equals("1")) {
            return 1;
        } else if (ayStr.equals("şubat") || ayStr.equals("2")) {
            return 2;
        } else if (ayStr.equals("mart") || ayStr.equals("3")) {
            return 3;
        } else if (ayStr.equals("nisan") || ayStr.equals("4")) {
            return 4;
        } else if (ayStr.equals("mayıs") || ayStr.equals("5")) {
            return 5;
        } else if (ayStr.equals("haziran") || ayStr.equals("6")) {
            return 6;
        } else if (ayStr.equals("temmuz") || ayStr.equals("7")) {
            return 7;
        } else if (ayStr.equals("ağustos") || ayStr.equals("8")) {
            return 8;
        } else if (ayStr.equals("eylül") || ayStr.equals("9")) {
            return 9;
        } else if (ayStr.equals("ekim") || ayStr.equals("10")) {
            return 10;
        } else if (ayStr.equals("kasım") || ayStr.equals("11")) {
            return 11;
        } else if (ayStr.equals("aralık") || ayStr.equals("12")) {
            return 12;
        } else {
            return -1;
        }
    }

    public static String bulBurc(int gun, int ay) {
        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            return "Koç Burcu";
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            return "Boğa Burcu";
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            return "İkizler Burcu";
        } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
            return "Yengeç Burcu";
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            return "Aslan Burcu";
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            return "Başak Burcu";
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            return "Terazi Burcu";
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            return "Akrep Burcu";
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            return "Yay Burcu";
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) {
            return "Oğlak Burcu";
        } else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
            return "Kova Burcu";
        } else {
            return "Balık Burcu";
        }
    }
}