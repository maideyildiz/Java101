import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,n1=0,n2=1,n3;
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        x= sc.nextInt();
        System.out.print("0 1");
        for(int i=2;i<=x;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
