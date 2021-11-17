import java.util.Scanner;

public class Main {
    public static int us(int taban,int usdeger)
    {
        if (usdeger==0)
            return 1;
        else if(taban==1)
            return 1;
        else
            return taban*us(taban, usdeger-1);

    }
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Üs almak istediğiniz sayıyı giriniz: ");
        x=sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        y= sc.nextInt();
        System.out.println(us(x, y));

    }

}