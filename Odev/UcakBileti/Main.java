import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km,age,type;
        double payment_per_mile=0.10,total=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance: ");
        km=sc.nextInt();

        System.out.print("Enter your age: ");
        age=sc.nextInt();

        System.out.print("Enter the trip type 1 for one direction, 2 for two direction:");
        type=sc.nextInt();

        if(km<0 || age<0){
            System.out.println("Wrong input");
        }
        if(type!=1 && type!=2){
            System.out.println("Wrong input");
        }
        else{
            total=km*payment_per_mile;
            if(age<12){
                total-=(total*0.50);
            }
            else if(age>=12 && age<=24){
                total-=(total*0.10);
            }
            else if(age>65){
                total-=(total*0.30);
            }
            if(type==2){
                total-=(total*0.20);
                total*=2;
            }
        }
        System.out.println("Total: "+total+"TL");
    }
}