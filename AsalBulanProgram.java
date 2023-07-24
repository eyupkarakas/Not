import java.util.Scanner;

public class AsalBulanProgram {
    static int asal(){
        Scanner input =new Scanner(System.in);
        int number= input.nextInt();
        int sayac=0;
        for(int i=2;i<number;i++){
            if(number%i ==0){
                sayac++;
            }

        }
        if(sayac==0){
            System.out.println("Tebrikler Asal sayı");
        }else{
            System.out.println(" Asal sayı değil");
        }
        return asal();
    }
    public static void main(String[ ] args){
        asal();
    }
}
