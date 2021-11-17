import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kenar_bir, kenar_iki, kenar_uc,cevre,alan=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Üçgenin ilk kenarını giriniz: ");
        kenar_bir=sc.nextDouble();
        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        kenar_iki=sc.nextDouble();
        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        kenar_uc=sc.nextDouble();

        cevre=(kenar_bir+kenar_iki+kenar_uc)/2;
        alan=Math.sqrt((cevre*(cevre-kenar_bir)*(cevre-kenar_iki)*(cevre-kenar_uc)));

        System.out.println("Üçgenin Alanı"+alan);
    }
}