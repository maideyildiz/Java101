import java.util.Scanner;

public class Main {
    public static int asalMi(int num, int i) {
        if (i==1){
            return 1;
        }else {
            if (num%i==0){
                return 0;
            }
            else return asalMi(num,i-1);
        }
    }
    public static void main(String[] args) {
        int x, y ;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Pozitif bir sayı giriniz : ");
        x= scanner.nextInt();

        y=asalMi(x,x/2);

        if (y==1){
            System.out.println(x+" sayısı asaldır");
        }else {
            System.out.println(x+" sayısı asal değildir");
        }

    }

}





