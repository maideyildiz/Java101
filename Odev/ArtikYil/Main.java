import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year=sc.nextInt();

        if(year%4==0){
            System.out.println(year+" Artık yıldır!");
        }
        else if(year%100==0){
            if(year%400==0){
                System.out.println(year+" Artık yıldır!");
            }
            else {
                System.out.println(year+" Artık yıl değildir!");
            }
        }
        else {
            System.out.println(year+" Artık yıl değildir!");
        }


    }
}