package Odev;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ağırlığınızı (kg) girin: ");
        double kilo = input.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) girin: ");
        double boy = input.nextDouble();
        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle Endeksiniz: " + vki);

    }
}
