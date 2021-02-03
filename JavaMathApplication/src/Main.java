import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int sayi1,sayi2;
	String op;
        Scanner iste=new Scanner(System.in);
        System.out.println("Sayıları Giriniz: ");
        sayi1=iste.nextInt();
        sayi2=iste.nextInt();
        System.out.println("Hangi işlemi Yapmak istiyorsun ");
        op=iste.next();
        switch (op){
            case "+":
                System.out.println("Sonuç "+(sayi1+sayi2));
                break;
            case "-":
                System.out.println("Sonuç "+(sayi1-sayi2));
                break;
            case "*":
                System.out.println("Sonuç "+(sayi1*sayi2));
                break;
            case "/":
                System.out.println("Sonuç "+(double)(sayi1/sayi2));
                break;
            default:
                System.out.println("Yanlış Operatör");
        }
    }
}
