package giris;

import java.util.Random;
import java.util.Scanner;

public class Tahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number);

        Scanner input = new Scanner(System.in);
        int right =0;
        int selected = 0;
        boolean isWin= false;
        boolean isFault =false;

        while(right<5){
            System.out.println("Lutfen Tahmininizi Giriniz: ");
            selected = input.nextInt();

            if(selected<0 || selected>99){
                System.out.println("Lutfen 0 ile 100 Arasinda Bir Sayi Giriniz");
                if(!isFault){
                    isFault = true;
                    System.out.println("Bir Sonraki Hatali Girisinizde Hakkiniz Eksilecektir.");
                }else{
                    right++;
                    System.out.println("Cok Fazla Hatali Giris Yaptiniz...Kalan Hakkiniz: "+ (5-right));
                }
                continue;
            }

            if(selected == number){
                System.out.println("Tebrikler Dogru Bildiniz.");
                isWin = true;
                break;
            }else{
                right++;
                System.out.println("Yanlis Tahmin :( Kalan Hakkiniz: "+(5-right));
                if(selected<number){
                    System.out.println("Girdiginiz Sayi Gizli Sayidan Kucuktur.");
                }else{
                    System.out.println("Girdiginiz Sayi Gizli Sayidan Buykutur.");
                }
            }


        }

        if(!isWin){
            System.out.println("Kaybettiniz...");
        }


    }
}
