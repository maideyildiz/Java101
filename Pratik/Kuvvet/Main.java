import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        x=sc.nextInt();
        for(i=1;i<=x;i*=4){
            System.out.print(i+" ");
        }
        System.out.println();
        for(j=1;j<=x;j*=5){
            System.out.print(j+" ");
        }

    }
}