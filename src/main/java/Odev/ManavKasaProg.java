package Odev;

import java.util.Scanner;

public class ManavKasaProg {
    public static void main(String[] args) {

        /*
        kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

           Meyveler ve KG Fiyatları

           Armut : 20,14 TL
           Elma : 23,67 TL
           Domates : 21,11 TL
           Muz: 30,95 TL
           Patlıcan : 25,00 TL

         */

        double a ,armutKg =20.14,e ,elmaKg=23.67,d, domatesKg=21.11,m, muzKg=30.95,p, patKg=25.00;
        Scanner scan= new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız?");
        a= scan.nextDouble();
        System.out.println("Kac kilo elma aldınız?");
        e = scan.nextDouble();
        System.out.println("Kac kilo Domates aldınız?");
        d= scan.nextDouble();
        System.out.println("Kac kilo muz aldınız?");
        m= scan.nextDouble();
        System.out.println("Kac kilo patlıcan aldınız?");
        p= scan.nextDouble();

        System.out.println("Armut tutarı : " + (a*armutKg));
        System.out.println("Elma tutarı : " + (e*elmaKg));
        System.out.println("Domates tutarı : " + (d*domatesKg));
        System.out.println("Muz tutarı : " + (m*muzKg));
        System.out.println("Patlıcan tutarı : " + (p*patKg));

        double toplam  = (a * armutKg) + (e * elmaKg) + (d * domatesKg) + (m * muzKg) + (p * patKg);
        System.out.println("Toplam tutar  :" + toplam);










    }

}
