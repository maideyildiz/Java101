import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x,y,islem=0,sonuc=0;
        String ifade;
        Scanner sc=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:  ");
        x=sc.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        y= sc.nextInt();
        System.out.print("Toplama için 1, çıkartma için 2, çarpma için 3 bölme için 4'e basınız.: ");
        islem= sc.nextInt();
        switch (islem){
            case 1:
                sonuc=x+y;
                break;
            case 2:
                sonuc=x-y;
                break;
            case 3:
                sonuc=x*y;
                break;
            case 4:
                if(y==0){
                    System.out.println("Bir sayı sıfıra bölünemez!");
                    break;
                }
                sonuc=x/y;
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız lütfen 1,2,3 veya 4 giriniz!");
                break;
        }
        System.out.println("Sonuç = "+ sonuc);
    }
}
