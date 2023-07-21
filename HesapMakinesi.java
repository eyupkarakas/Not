import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("1.sayı :");
        double a =input.nextDouble();
        System.out.print("2.sayı :");
        double b =input.nextDouble();

        System.out.println("1-Toplam\n2-Çıkarma\n3-bölme\n4-Çarpma");
        System.out.print("Yapmak istediğiniz işlem numarasını yazınız");
        int c = input.nextInt();

        switch (c){
            case 1 :
                System.out.println("Toplam :" +(a+b));
                break;
            case 2 :
                System.out.println("Çıkarma :" +(a-b));
                break;
            case 3 :
                System.out.println("Bölme : " +(a/b));
                break;
            case 4 :
                System.out.println("Çarpma : " + (a*b));

        }

    }
}
