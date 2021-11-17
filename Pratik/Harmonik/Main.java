import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        double total=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı: ");
        x=sc.nextInt();
        for(double i=1;i<=x;i++){
            total+=1/i;
        }
        System.out.println("Harmonik ortalama: " + total);

    }
}