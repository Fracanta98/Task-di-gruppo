import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList <Prodotto> Prodotti = new ArrayList<>();

        

        

        System.out.println("Premi 1 per aggiungere prodotto alimentare");
        System.out.println("Premi 2 per aggiungere prodotto elettronico");
        System.out.println("Premi 3 per aggiungere libro");
        System.out.println("Premi 0 per uscire");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Selezionato prodotto alimentare");
                break;


            case 2:
                System.out.println("Selezionato prodotto elettronico");

                break;


            case 3:


                break;


        
            default 0:
                break;
        }




    }
    
}
