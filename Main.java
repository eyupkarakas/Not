import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kdv =0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz fiyatı giriniz : ");
        int a= input.nextInt();
        if(a>1000){
            kdv=0.08;
        }
         double kdvli = a*kdv+a;
         double kdvTutarı =a*kdv;
         System.out.println("KDV'li fiyat : "+kdvli);
         System.out.println("KDV tutarı :" +kdvTutarı);
         
        }
    }
