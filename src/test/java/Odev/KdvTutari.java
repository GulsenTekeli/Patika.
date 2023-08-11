package Odev;

import java.util.Scanner;

public class KdvTutari {

    public static void main(String[] args) {

        double kitapTutari,kdvOran =0.18, kdv, kdvliTutar;
        Scanner scan =new Scanner(System.in);
        System.out.println("Kitap fiyatını giriniz");
        kitapTutari=scan.nextDouble();
        kdv =kitapTutari*kdvOran;
        kdvliTutar=kitapTutari+kdv;
        System.out.println("KDV'siz tutar : " + kitapTutari);
        System.out.println("Kdvli Tutar :" + kdvliTutar);
        System.out.println("Kdv Oranı :" + kdvOran);
        System.out.println("KDV: " + kdv + "TL");

    }
}
