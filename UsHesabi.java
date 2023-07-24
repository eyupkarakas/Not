
import java.util.Scanner;
public class UsHesabi {
    static void UsHesabi(){
        Scanner input = new Scanner(System.in);
        System.out.print("Üs değeri giriniz :");
        int us=input.nextInt();
        System.out.print("Taban değeri giriniz :");
        int taban = input.nextInt();
        int result =1;

        for(int i=1;i<=us;i++){
            result*=taban;
        }
        System.out.println("Sonuç :" +result);
    }

    public static void main(String[] args){
        UsHesabi();
    }
}
