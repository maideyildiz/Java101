import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz? : ");
        x=sc.nextInt();
        int[] nums=new int[x];
        for(int i=0;i<x;i++){
            System.out.print((i+1)+". sayıyı giriniz: ");
            nums[i]=sc.nextInt();
        }
        int big=nums[0], sml=nums[0];
        for(int j=0;j<x;j++){
            if(big<nums[j]){
                big=nums[j];
            }
            if(sml>nums[j]) {
                sml=nums[j];
            }
        }
        System.out.println("Büyük sayı: "+ big);
        System.out.println("Küçük sayı: "+sml);
    }
}
