import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x=sc.nextInt();

        for(int i=1;i<=x;i++){
            if(i%2==0){
                System.out.print(i+", ");
            }
            else {
                continue;
            }
        }


    }
}