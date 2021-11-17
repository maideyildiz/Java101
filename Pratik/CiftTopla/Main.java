import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,total=0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter a number: ");
            x=sc.nextInt();
            if(x%2==0 || x%4==0){
                total+=x;
            }
        }
        while (x%2==0);

        System.out.println("Total = "+total);

    }
}