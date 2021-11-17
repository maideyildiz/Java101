import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y,ebob=1,ekok=1,i=1,k=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        x=sc.nextInt();
        System.out.print("Diğer sayıyı giriniz: ");
        y= sc.nextInt();
        if(x<y){
            while (i<=x) {
                if (x % i == 0 && y % i == 0) {
                    ebob = i;
                }
                i++;
            }
        }
        else{
            while (k<=y) {
                if (x % k == 0 && y % k == 0) {
                    ebob = k;
                }
                k++;
            }
        }
        ekok = (x * y) / ebob;
        System.out.println(x + " ve "+y+" sayılarının ebob değeri "+ebob+" sayısıdır.");
        System.out.println(x + " ve "+y+" sayılarının ekok değeri "+ekok+" sayısıdır.");
    }
}