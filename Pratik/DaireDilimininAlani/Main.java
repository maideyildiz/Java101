import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,aci;
        double pi=3.14,alan=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r=sc.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        aci= sc.nextInt();

        alan=(pi*(r*r)*aci)/360;

        System.out.println("Daire diliminin alanı: "+alan);


    }
}
