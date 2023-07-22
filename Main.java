import java.util.Scanner;
public class Main {
        public static void main(String[] args){
            int sayac = 0;
            for(int sayi=2;sayi<=100;sayi++)
            {
                int kontrol = 0;
                for (int i = 2; i < sayi; i++)
                {
                    if (sayi % i == 0)
                    {
                        kontrol = 1;
                        break;
                    }
                }

                if(kontrol==0)
                {
                    System.out.print(sayi+"\n");
                    sayac++;
                }
            }
        }
}

    /*public static void main(String[] args) {
        System.out.print("1.dik kenarı gir");
        System.out.print("2.dik kenarı gir");
        System.out.print(" kenarı gir");
        DikUcgen dikUcgen = new DikUcgen();




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

    }*/