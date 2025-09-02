import java.util.ArrayList;
import java.util.Scanner;

public class SubMainFrancesco {

     public static void main(String[] args){

        ArrayList <Prodotto> Prodotti = new ArrayList<>();
        ArrayList Carrello = new ArrayList<Double>();


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
                    System.out.println("Premi 0 per uscire");
                    int e = scanner.nextInt();

                   
                do {
                 
                    
                    
                    switch (e) {
                        case 1:
                             
                             
                        
                            System.out.println("Vuoi applicare la garanzia? premi y minuscolo per accettare");
                            String scelta1 = scanner.nextLine();
                            if(scelta1 == "y"){
                                pe1.switchGaranzia();
                                pe1.calcolaPrezzoFinale();
                                double prezzoFinale = pe1.setPrezzoFinale(e);
                                Carrello.add(prezzoFinale);


                                
                            }else{
                                pe1.calcolaPrezzoFinale();
                                Carrello.add(pe1);
                            }
                            
                            break;

                        case 2:
                            
                            System.out.println("Vuoi applicare la garanzia? y/n");
                            String scelta2 = scanner.nextLine();
                            if(scelta2 == "y"){
                                pe2.switchGaranzia();
                                pe2.calcolaPrezzoFinale();
                                Carrello.add(pe2);


                                
                            }else{
                                pe2.calcolaPrezzoFinale();
                                Carrello.add(pe2);
                            }
                            
                            break;

                        case 0:
                            break;
                    
                        default:
                            System.out.println("Errore, Roberto mangia la frittatina di pasta!");
                            break;
                    }
                    
                  } while (e != 0);

                

              

                break;


            case 3:


                break;


        
            default :
                break;
        }


        double  saldoFinale = 0;

        for(int i = 0; i < Carrello.size(); i++){
                saldoFinale += Carrello[i];
            
        }






    }
    
}
