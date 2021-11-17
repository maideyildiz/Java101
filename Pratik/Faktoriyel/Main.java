import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,total=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        x=sc.nextInt();
        for(int i=1;i<=x;i++){
            total*=i;
        }
        System.out.println(x+ " sayısının faktoriyeli = "+ total);
    }
}