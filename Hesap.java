import java.util.Scanner;

public class Hesap {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        double number, result = 0;
        System.out.print("İşlem Yapmak İstediğiniz Sayı Adedi :");
        int counter=scan.nextInt();
        int i = 1;
        while (i<=counter) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            result += number;
        }
        System.out.println("Sonuç : " + result);

    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    public static void main(String[] args){
        plus();
    }

}
