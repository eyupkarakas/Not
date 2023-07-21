import java.util.Scanner;

public class KullanciGirisi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        String a =input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        String b =input.nextLine();

        if((a.equals("eyüp")) && b.equals("eyüp123")){
            System.out.println("Giriş yaptınız");

        }
        if((a.equals("eyüp")) && !b.equals("eyüp123")){
            System.out.print("Şifreniz yanlış.Değiştirmek ister misiniz?(Evet/Hayır) ");
            String c=input.nextLine();
            if(c.equals("Evet") || c.equals("evet")){
                System.out.print("Yeni şifre :");
                String d =input.nextLine();
                if(d.equals("eyüp123")){
                    System.out.print("Eski şifreyle aynı lütfen başka şifre giriniz");
                }
            }
        }
        else {
            System.out.println("Bilgiler Yanlış");
        }


    }
}
