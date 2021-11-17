import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km,min=20;
        double ucret=10, km_basi=2.20;
        Scanner sc=new Scanner(System.in);
        System.out.print("Kilometreyi giriniz: ");
        km=sc.nextInt();
        ucret+=(km*km_basi);
        if(ucret<min){
            System.out.println("Ödemeniz gereken ücret: "+min);
        }
        else{
            System.out.println("Ödemeniz gereken ücret: "+ucret);
        }

    }
}
