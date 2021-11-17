import java.util.Scanner;

public class Main {

    static int recursiveDesen(int num) {
        System.out.print(num + " ");
        if(num <= 0) {
            return num;
        }
        int temp = recursiveDesen(num-5)+5;
        System.out.print(temp + " ");
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int x = sc.nextInt();
        recursiveDesen(x);

    }

}





