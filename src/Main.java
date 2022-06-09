import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Yil giriniz: ");
        int yil=inp.nextInt();

        if (yil%4==0 && yil%100==0){
            if (yil%400==0) {
                System.out.println(yil+" bir artik yildir.");
            }
            else {
                System.out.println(yil+" bir artik yil degildir.");
            }
        }
        else if (yil%4==0 && yil%100!=0){
            System.out.println(yil+" bir artik yildir.");
        }
        else {
            System.out.println(yil+" bir artik yil degildir.");
        }
    }
}