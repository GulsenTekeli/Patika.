package Odev;

import java.util.Arrays;
import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        int[] sayilar = {sayi1, sayi2, sayi3};
        Arrays.sort(sayilar);

        System.out.println("Sıralama: " + sayilar[0] + " <= " + sayilar[1] + " <= " + sayilar[2]);

        scanner.close();
    }

}
