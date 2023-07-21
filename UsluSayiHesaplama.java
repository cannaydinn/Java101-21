import java.util.Scanner;

public class UsluSayiHesaplama{
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        Scanner sc = new Scanner(System.in);
        int sayi, kuvvet;

        System.out.println("Üssü alınacak sayıyı giriniz: ");
        sayi=sc.nextInt();

        System.out.println("Kuvveti giriniz: ");
        kuvvet=sc.nextInt();

        System.out.println((int) Math.pow(sayi, kuvvet));
    }
}