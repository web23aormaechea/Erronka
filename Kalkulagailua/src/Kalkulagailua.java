import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Kalkulagailua {
    public static void main(String[] args) {
        int zen;
        menu();
        Scanner sc = new Scanner(System.in);
        zen = sc.nextInt();
        while (zen!=7){
            switch (zen){
                case 1:
                    batuketa();
                    break;
                case 2:
                    kenketa();
                    break;
                case 3:
                    biderketa();
                    break;
                case 4:
                    zatiketa();
                    break;
                case 5:
                    berreketa();
                    break;
                case 6:
                    erroketa();
                    break;
                default:
                    System.out.println("Sartutako zenbakia ez dago aukeren artean");
            }
            menu();
            zen = sc.nextInt();
        }
    }

    private static void erroketa() {
    }

    private static void berreketa() {
    }

    private static void zatiketa() {
    }

    private static void biderketa() {
    }

    private static void kenketa() {
    }

    private static void batuketa() {
    }

    private static void menu() {
    }
}