import java.util.Scanner;

public class Main {
    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int x= sc.nextInt();
        System.out.println(fibonacci(x));
    }
}

