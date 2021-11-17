import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,total=0,numberCounter=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        x=sc.nextInt();
        while(x != 0)
        {
            total=(x%10)+total;
            x /= 10;
            ++numberCounter;
        }

        System.out.println("Basamak Toplamı: " + total);

    }
}