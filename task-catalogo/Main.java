import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList <Prodotto> Prodotti = new ArrayList<>();
        ArrayList <Prodotto> Carrello = new ArrayList<>();


        ProdottoElettronico pe1 = new ProdottoElettronico("tv", 300, false);
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
        
        do{
            switch (a) {
            case 1:
                
                System.out.println("Scegli il prodotto da aggiungere al carrello");
                String scelta = scanner.nextLine();
                scanner.close();
                switch(scelta){
                    case "pane":

                        pa1.calcolaPrezzoFinale();
                    break;
                    case "pasta":
                        pa2.calcolaPrezzoFinale();
                    break;
                    default:
                        System.out.println("Prodotto inserito non valido");
                    break;
                }
                break;
            

            case 2:
                    System.out.println("Scegli un prodotto da aggiungere al carrello:");
                    System.out.println("Premi 1 per aggiungere tv 300$");
                    System.out.println("Premi 2 per aggiungere PC 500$");
                    int e = scanner.nextInt();
                    scanner.close();
                do {
                 
                    
                    
                    switch (e) {
                        case 1:
                             
                             Carrello.add(pe1);

                            
                            break;
                    
                        default:
                            break;
                    }
                    
                  } while (e != 0);

                

              

                break;


            case 3:


                break;


        
            default :
                break;
        }

        }while (a != 0);




    }
    
}
