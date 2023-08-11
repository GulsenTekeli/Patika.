package Odev;

import java.util.Scanner;

public class DaireAlaniVeCevresi {
    public static void main(String[] args) {

        double r, pi=3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz");
        r=input.nextDouble();
        double alan= pi*r*r;
        double cevre= 2*pi*r;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Cevresi: " + cevre);


    }

}
