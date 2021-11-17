import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fiz, turk,kimya, muzik, ortBolum=5;
        double ort=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat=sc.nextInt();
        if(!(mat>0 && mat<=100)){
            mat=0;
            ortBolum--;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fiz=sc.nextInt();
        if(!(fiz>0 && fiz<=100)){
            fiz=0;
            ortBolum--;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turk=sc.nextInt();
        if(!(turk>0 && turk<=100)){
            turk=0;
            ortBolum--;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=sc.nextInt();
        if(!(kimya>0 && kimya<=100)){
            kimya=0;
            ortBolum--;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik=sc.nextInt();
        if(!(muzik>0 && muzik<=100)){
            muzik=0;
            ortBolum--;
        }
        ort=(mat+fiz+turk+kimya+muzik)/ortBolum;

        if(ort<=55){
            System.out.println("Sınıfta kaldınız seneye tekrar görüşmek üzere!");
        }
        else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız : " + ort);
    }
}
