import java.util.ArrayList;
import java.util.Scanner;

public class SubmainRoberto {
    public static void main(String[] args){

        ArrayList <Prodotto> Prodotti = new ArrayList<>();
        ArrayList <Prodotto> Carrello = new ArrayList<>();


        ProdottoElettronico pe1 = new ProdottoElettronico("tv", 300, true);
        Prodotti.add(pe1);
        ProdottoElettronico pe2 = new ProdottoElettronico("pc", 500, false);
        Prodotti.add(pe2);

        ProdottoAlimentare pa1 = new ProdottoAlimentare("pane", 20.5, 2);
        Prodotti.add(pa1);
        ProdottoAlimentare pa2 = new ProdottoAlimentare("pasta",10, 10);
        Prodotti.add(pa2);

        ProdottoLibro pl1 = new ProdottoLibro("Hunger Games Trilogy", 29.99, true);
        Prodotti.add(pl1);
        ProdottoLibro pl2 = new ProdottoLibro("Clair Obscur Expedition 33", 49.99, false);
        Prodotti.add(pl2);
        

        

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

                break;
            
            int libro = scanner.nextInt();
            case 3:
                switch(libro){
                    case 1:
                        System.out.println("Premi 1 per scegliere Hunger Games Trilogy");
                    break;
                    case 2:
                        System.out.println("Premi 2 per scegliere Clair obscure Expedition 33 (dovresti)");
                    break;
                    default:
                        System.out.println("Premi 3 per annullare l'operazione");
                }
                break;


        
            default :
                System.out.println("Uscita");
                break;
        }




    }
    
}
