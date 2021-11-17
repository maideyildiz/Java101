import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double mat,fizik,kimya,turkce,tarih,muzik;

        Scanner sc=new Scanner(System.in);
        System.out.println("Matematik notunuz: ");
        mat=sc.nextDouble();

        System.out.println("Fizik notunuz: ");
        fizik=sc.nextDouble();

        System.out.println("Kimya notunuz: ");
        kimya=sc.nextDouble();

        System.out.println("Türkçe notunuz: ");
        turkce=sc.nextDouble();

        System.out.println("Tarih notunuz: ");
        tarih=sc.nextDouble();

        System.out.println("Müzik notunuz: ");
        muzik=sc.nextDouble();

        double toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double ort=toplam/6;

        System.out.println("Ortalamanız: "+ort);

        System.out.println("Durumunuz: "+ ((ort>60) ? "Sınıfı Geçti": "Sınıfta Kaldı"));

    }
}
