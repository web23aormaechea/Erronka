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
        int zenbaki1, zenbaki2;
        Scanner eskanerra = new Scanner(System.in);
        System.out.println("===================================================================================");
        System.out.println("=========================             ERROKETA            =========================");
        System.out.println("===================================================================================");
        System.out.println("Sartu lehen zenbakia");
        zenbaki1 = eskanerra.nextInt();
        System.out.println("Sartu bigarren zenbakia");
        zenbaki2 = eskanerra.nextInt();
        System.out.println("Sartutako zenbakien erroketa " +Math.pow(zenbaki1, (double)1/zenbaki2)+ " da!");
        System.out.println("===================================================================================");
    }

    private static void berreketa() {
        int zenbaki1, zenbaki2;
        Scanner eskanerra = new Scanner(System.in);
        System.out.println("===================================================================================");
        System.out.println("=========================            BERREKETA            =========================");
        System.out.println("===================================================================================");
        System.out.println("Sartu lehen zenbakia");
        zenbaki1 = eskanerra.nextInt();
        System.out.println("Sartu bigarren zenbakia");
        zenbaki2 = eskanerra.nextInt();
        System.out.println("Sartutako zenbakien berreketa " +Math.pow(zenbaki1, zenbaki2)+ " da!");
        System.out.println("===================================================================================");
    }

    private static void zatiketa() {
        int zenbaki1, zenbaki2;
        Scanner eskanerra = new Scanner(System.in);
        System.out.println("===================================================================================");
        System.out.println("=========================             ZATIKETA            =========================");
        System.out.println("===================================================================================");
        System.out.println("Sartu lehen zenbakia");
        zenbaki1 = eskanerra.nextInt();
        System.out.println("Sartu bigarren zenbakia");
        zenbaki2 = eskanerra.nextInt();
        System.out.println("Sartutako zenbakien zatiketa " +(double)zenbaki1/zenbaki2+ " da!");
        System.out.println("===================================================================================");
    }

    private static void biderketa() {
        int zenbaki1, zenbaki2, emaitza;
        Scanner eskanerra = new Scanner(System.in);
        System.out.println("===================================================================================");
        System.out.println("=========================            BIDERKETA            =========================");
        System.out.println("===================================================================================");
        System.out.println("Sartu lehen zenbakia");
        zenbaki1 = eskanerra.nextInt();
        System.out.println("Sartu bigarren zenbakia");
        zenbaki2 = eskanerra.nextInt();
        emaitza = zenbaki1 * zenbaki2;
        System.out.println("Sartutako zenbakien biderketa " +emaitza+ " da!");
        System.out.println("===================================================================================");
    }

    private static void kenketa() {
        int zenbaki1, zenbaki2, emaitza;
        Scanner eskanerra = new Scanner(System.in);

        System.out.println("===================================================================================");
        System.out.println("=========================             KENKETA             =========================");
        System.out.println("===================================================================================");
        System.out.println("Sartu lehen zenbakia");
        zenbaki1 = eskanerra.nextInt();
        System.out.println("Sartu bigarren zenbakia");
        zenbaki2 = eskanerra.nextInt();
        emaitza = zenbaki1 - zenbaki2;
        System.out.println("Sartutako zenbakien kenketa " +emaitza+ " da!");
        System.out.println("===================================================================================");
    }

    private static void batuketa() {
        int zenbaki1, zenbaki2, emaitza;
        Scanner eskanerra = new Scanner(System.in);
        System.out.println("===================================================================================");
        System.out.println("=========================            BATUKETA             =========================");
        System.out.println("===================================================================================");
        System.out.println("Sartu lehen zenbakia");
        zenbaki1 = eskanerra.nextInt();
        System.out.println("Sartu bigarren zenbakia");
        zenbaki2 = eskanerra.nextInt();
        emaitza = zenbaki1 + zenbaki2;
        System.out.println("Sartutako zenbakien batura " +emaitza+ " da!");
        System.out.println("===================================================================================");

    }

    private static void menu() {
        System.out.println("===================================================================================");
        System.out.println("==================             MALTUNA KALKULAGAILUA              =================");
        System.out.println("===================================================================================");
        System.out.println("===== Ondorengo eragiketak egin ditzaket, sakatu zenbakia eta lagunduko dizut! ====");
        System.out.println("== 1. BATUKETA                                                                   ==");
        System.out.println("== 2. KENKETA                                                                    ==");
        System.out.println("== 3. BIDERKETA                                                                  ==");
        System.out.println("== 4. ZATIKETA                                                                   ==");
        System.out.println("== 5. BERREKETA                                                                  ==");
        System.out.println("== 6. ERROKETA                                                                   ==");
        System.out.println("== 7. BUKATU PROGRAMA                                                            ==");
        System.out.println("===================================================================================");
    }
}