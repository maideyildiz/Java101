import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kg_armut,kg_elma,kg_domates,kg_muz,kg_patlican,
                armut=2.14, elma=3.67, domates=1.11, muz=0.95,
                patlican=5.00, toplam=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?  : ");
        kg_armut=sc.nextDouble();

        System.out.print("Elma Kaç Kilo ?  : ");
        kg_elma=sc.nextDouble();

        System.out.print("Domates Kaç Kilo ?  : ");
        kg_domates=sc.nextDouble();

        System.out.print("Muz Kaç Kilo ?  : ");
        kg_muz=sc.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ?  : ");
        kg_patlican=sc.nextDouble();

        toplam=(kg_armut*armut)+(kg_elma*elma)+(kg_domates*domates)+(kg_muz*muz)+(kg_patlican*patlican);

        System.out.println("Toplam Tutar : "+ toplam+ "TL");
    }
}
