import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Kalkulagailua {
    public static void main(String[] args) {
        batuketa();
    }
    private static void batuketa (){
        int zenbaki1, zenbaki2, emaitza;
        Scanner eskanerra = new Scanner(System.in);

        System.out.println("===================================================== BATUKETA =========================================================");
        System.out.println("Sartu lehen zenbakia");
        zenbaki1 = eskanerra.nextInt();
        System.out.println("Sartu bigarren zenbakia");
        zenbaki2 = eskanerra.nextInt();
        emaitza = zenbaki1 + zenbaki2;
        System.out.println("Sartutako zenbakien batura " +emaitza+ " da!");
        System.out.println("========================================================================================================================");
    }
}