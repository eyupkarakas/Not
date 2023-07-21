import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("1.kenar");
        int a =input.nextInt();
        System.out.print("2.kenar");
        int b = input.nextInt();
        System.out.print("3.kenar");
        int c = input.nextInt();

        int u2 = a+b+c;
        double u = (a+b+c)/2;
        double alanKare = u*(u-a)*(u-b)*(u-c);
        System.out.println(" alan kare" + alanKare);
    }


}
