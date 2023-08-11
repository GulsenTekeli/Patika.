package Odev;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        double km;
        double perKm= 2.20, total, startPrice =10;
        Scanner input =new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz");
        km =input.nextDouble();
        total= startPrice+ (km*perKm);
        total=(total<20)?20 :total;
        System.out.println("Toplam Tutar :" + total);

    }
}
