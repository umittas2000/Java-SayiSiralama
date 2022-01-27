import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("|-------------------------------------------|");
        System.out.println("|  VERILEN 3 SAYIYI KUCUKTEN BUYUGE SIRALA  |");
        System.out.println("|-------------------------------------------|");

        System.out.print("1. Sayiyi giriniz: ");
        a = input.nextInt();

        System.out.print("2. Sayiyi giriniz: ");
        b = input.nextInt();

        System.out.print("3. Sayiyi giriniz: ");
        c = input.nextInt();


        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println( a +" > "+ b+" > "+c);
                } else {
                    System.out.println(a +" > "+c+" > "+b);
                }
            } else {
                System.out.println(c+" > "+a+" > "+b);
            }
        } else if(a>c) {
            if (b > c) {
                System.out.println(b+" > "+a+" > "+c);
            } else {
                System.out.println(a+" > "+c+" > "+b);
            }
        }else if(b>c){
            System.out.println(b+" > "+c+" > "+a);
        }
        else{

            System.out.println(c+" > "+b+" > "+a);
        }
    }
}

