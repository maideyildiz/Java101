import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double para,kdv=0,kdvli=0, oran=0.18, oran_kucuk=0.8;
        Scanner sc=new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        para=sc.nextDouble();
        if(para<=1000 && para>0){
            kdv=para*oran;
            kdvli=para+kdv;
        }
        else if(para>1000){
            kdv=para*oran_kucuk;
            kdvli=para+kdv;
        }
        System.out.println("KDV'siz Fiyat = "+ para);
        System.out.println("KDV'li Fiyat = "+kdvli);
        System.out.println("KDV Tutarı = "+kdv);
    }
}
