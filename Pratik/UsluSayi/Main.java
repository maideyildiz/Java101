import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y,total=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        x=sc.nextInt();
        System.out.print("Üs alacak sayı: ");
        y= sc.nextInt();

        for (int i=0;i<y;i++){
            total*=x;
        }
        System.out.println(x+" sayısının "+y+" üssü = "+ total);

    }
}