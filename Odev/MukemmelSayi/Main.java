import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,total=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        x= sc.nextInt();
        for(int i=1;i<x;i++){
            if(x%i==0){
                total+=i;
            }
        }
        if(total==x){
            System.out.println(x+" mükemmel sayıdır.");
        }
        else {
            System.out.println(x+" mükemmel sayı değildir.");
        }
    }
}
