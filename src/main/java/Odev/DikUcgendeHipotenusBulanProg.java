package Odev;

import java.util.Scanner;

public class DikUcgendeHipotenusBulanProg {
    public static void main(String[] args) {

        double a,b,c ;
        Scanner input = new Scanner(System.in);
        System.out.println("a kenarının uzunlugunu giriniz");
        a= input.nextDouble();
        System.out.println("b kenarının uzunlugunu giriniz");
        b= input.nextDouble();

        c= Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + c);

    }
}
