import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;
        boolean hata = false;
        String burc = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Doğum ayınız :");;
        ay = sc.nextInt();


        if ( ay >= 1 && ay <= 12) {

            System.out.print("Doğum gününüz :");;
            gun = sc.nextInt();

            if (ay == 1) {
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22)
                        burc = "Oğlak";
                    else
                        burc = "Kova";
                } else
                    hata = true;
            } else if (ay == 2) {
                if (gun >= 1 && gun <= 28) {
                    if (gun > 20)
                        burc = "Aquarius";
                    else
                        burc = "Balık";
                } else
                    hata = true;
            } else if (ay == 3) {
                if (gun >= 1 &&gun <= 31) {
                    if (gun < 21)
                        burc = "Balık";
                    else
                        burc = "Koç";
                } else
                    hata = true;
            } else if (ay == 4) {
                if (gun >= 1 && gun <= 30) {
                    if (gun < 21)
                        burc = "Koç";
                    else
                        burc = "Boğa";
                } else
                    hata = true;
            } else if (ay == 5) {
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22)
                        burc = "Boğa";
                    else
                        burc = "İkizler";
                } else
                    hata = true;
            } else if (ay == 6) {
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23)
                        burc = "İkizler";
                    else
                        burc = "Yengeç";
                } else
                    hata = true;
            } else if (ay == 7) {
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23)
                        burc = "Yengeç";
                    else
                        burc = "Aslan";
                } else
                    hata = true;
            } else if (ay == 8) {
                if (gun >= 1 && gun <= 31) {
                    if (gun< 23)
                        burc = "Aslan";
                    else
                        burc = "Başak";
                } else
                    hata = true;
            } else if (ay == 9) {
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23)
                        burc = "Başak";
                    else burc = "Terazi";
                } else
                    hata = true;
            } else if (ay == 10) {
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23)
                        burc = "Terazi";
                    else
                        burc = "Akrep";
                } else
                    hata = true;
            } else if (ay == 11) {
                if (gun >= 1 && gun <= 30) {
                    if (gun < 22)
                        burc = "Akrep";
                    else
                        burc = "Yay";
                } else
                    hata = true;
            } else if (ay == 12) {
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22)
                        burc = "Yay";
                    else
                        burc = "Oğlak";
                } else
                    hata = true;
            }

        }else
            System.out.println("Yanlış değer girdiniz. ");

        if (hata)
            System.out.println("Yanlış değer");
        else
            System.out.println("Burcunuz : " + burc);

    }
}