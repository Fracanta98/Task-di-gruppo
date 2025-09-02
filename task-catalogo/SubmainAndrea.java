import java.util.ArrayList;
import java.util.Scanner;

public class SubmainAndrea {
    public static void main(String[] args) {
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
        

        

        System.out.println("Premi 1 per aggiungere prodotto alimentare");
        System.out.println("Premi 2 per aggiungere prodotto elettronico");
        System.out.println("Premi 3 per aggiungere libro");
        System.out.println("Premi 0 per uscire");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        switch (a) {
            case 1:
                System.out.println("Scegli un prodotto da aggiungere al carrello:");
                System.out.println("Premi 1 per aggiungere pane");
                System.out.println("Premi 2 per aggiungere pasta");
                int scelta = scanner.nextInt();          
                
                do{
                    // creo un sottomenù dei prodottti alimentari 
                    switch(scelta){
                        case 1:
                            // aggiungo il prodotto al carrello
                            Carrello.add(pa1);
                            pa1.calcolaPrezzoFinale();// stampo il prezzo del prodotto
                                                    
                        break;
                        case 2:
                            Carrello.add(pa2);
                            pa2.calcolaPrezzoFinale();
                        break;
                        default:
                            System.out.println("Prodotto inserito non valido");
                        break;
                        }
                        break;

                }while (scelta !=0);
                scanner.close();

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
