import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String kAdi,sifre,y_sifre;
        int secenek=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("KULLANICI GİRİŞİ");

        System.out.print("Kullanıcı adınızı giriniz: ");
        kAdi=sc.nextLine();

        if(!kAdi.equals("kullanici")){
            System.out.println("Kullanıcı adınız yanlış!");
        }
        else {
            System.out.print("Şifrenizi giriniz: ");
            sifre=sc.nextLine();

            if(sifre.equals("123sifre")){
                System.out.println("Başarılı giriş!");
            }
            else {
                System.out.println("Şifreniz yanlış, yeni şifre oluşturmak ister misiniz?");
                System.out.print("Evet için 1, Hayır için 2'ye basınız: ");
                secenek=sc.nextInt();
                if(secenek==1){
                    System.out.print("Yeni şifrenizi giriniz: ");
                    Scanner sc2=new Scanner(System.in);
                    y_sifre=sc2.nextLine();
                    if(y_sifre.equals("123sifre")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else {
                        sifre=y_sifre;
                        System.out.println("Şifre oluşturuldu.");
                    }
                }
                else if(secenek==2){
                    System.out.println("Çıkış yapılıyor.");
                }
                else {
                    System.out.println("Lütfen Evet için 1, Hayır için 2'ye basınız!");
                }
            }
        }
    }
}
