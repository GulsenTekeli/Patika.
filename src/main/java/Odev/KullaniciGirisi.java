package Odev;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        /*
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */
        String password, reset, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        password = input.nextLine();

        if (password.equals("java123")) {
            System.out.println("Şifre doğru");
        } else
            System.out.print("Şifreniz yanlıs, şifrenizi sıfırlamak ister misiniz? (E/H): ");
        reset = input.nextLine();

        if (reset.equalsIgnoreCase("E")) {
            System.out.print("Yeni şifrenizi giriniz: ");
            newPassword = input.nextLine();
            {
                if (newPassword.equals(password)) {
                    System.out.println("Hatalı giriş yaptınız. Şifreniz eski şifreyle aynı olmamalıdır");
                } else {
                    System.out.println("Şifre oluşturuldu");
                    System.out.println("Giriş başarılı.");
                }
            }
        } else if (reset.equalsIgnoreCase("H")) {
            System.out.println("Şifre sıfırlanamadı");

        }
    }
}
