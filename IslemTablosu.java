import java.util.Scanner;

public class IslemTablosu {


    static void mod(int sayi1, int sayi2){
        if(sayi2 == 0){
            System.out.println("Bölen sayı 0 olamaz!");
        }else{
            int sonuc = sayi1%sayi2;
            System.out.println(sayi1+" mod "+sayi2 +" = "+sonuc);
        }
    }

    static void dikdortgenAlan (int kenar1, int kenar2){
        if(kenar1 == 0 || kenar2 == 0){
            System.out.println("kenar boyutu 0 olamaz");
        }else{
            int alan = kenar1*kenar2;
            System.out.println("alan : "+alan);
        }
    }

    static void dikdortgenCevre(int kenar1,int kenar2){
        if(kenar1 == 0 || kenar2 ==0){
            System.out.println("kenar boyutu 0 olamaz!");
        }else {
            int cevre = (kenar1*2) + (kenar2*2);
            System.out.println("cevre : "+cevre);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        mod(sayi1,sayi2);

        System.out.println("dikdörtgenin uzun kenar uzunluğunu giriniz :");
        int uzun = input.nextInt();

        System.out.println("dikdörtgenin kısa kenar uzunluğunu giriniz :");
        int kisa = input.nextInt();

        dikdortgenAlan(uzun,kisa);
        dikdortgenCevre(uzun,kisa);
    }

}
