import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList <Prodotto> Prodotti = new ArrayList<>();
        ArrayList <Prodotto> Carrello = new ArrayList<>();


        ProdottoElettronico pe1 = new ProdottoElettronico("tv", 300, true);
        Prodotti.add(pe1);
        ProdottoElettronico pe2 = new ProdottoElettronico("pc", 500, false);
        Prodotti.add(pe2);

        

        System.out.println("Premi 1 per aggiungere prodotto alimentare");
        System.out.println("Premi 2 per aggiungere prodotto elettronico");
        System.out.println("Premi 3 per aggiungere libro");
        System.out.println("Premi 0 per uscire");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        switch (a) {
            case 1:
                
                break;
            

            case 2:

                System.out.println("Aggiungi il nome");

                break;


            case 3:


                break;


        
            default :
                break;
        }




    }
    
}
