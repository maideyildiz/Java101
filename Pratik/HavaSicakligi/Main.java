import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner sc=new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        sicaklik= sc.nextInt();
        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if(sicaklik<=10){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if(sicaklik>10 && sicaklik<=15){
            System.out.println("Sinemaya gidebilir veya Piknik yapabilirsiniz.");
        }
        else if(sicaklik<=25) {
            System.out.println("Piknik yapabilirsiniz");
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
