package Odev;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double s1,s2;
        int secim;
        Scanner input =new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        s1=input.nextInt();
        System.out.println("ikici sayıyı giriniz");
        s2=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.println("Seciniz..");
        secim=input.nextInt();
        switch (secim){
            case 1:
                System.out.println("Sayıların Toplamı" + (s1+s2));
                break;
            case 2:
                System.out.println(" Sayıların farkı  " + (s1-s2));
                break;
            case 3:
                if (s2==0){
                    System.out.println("Bir sayı 0'a bölünmez");
                }else
                System.out.println("Bölme  " + (s1/s2));
                break;
            case 4:
                System.out.println("Carpma  "+ (s1*s2));
                break;
            default:
                System.out.println("Hatalı giris yaptınız");
        }
    }
}
