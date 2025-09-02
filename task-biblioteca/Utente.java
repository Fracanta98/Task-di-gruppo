public class Utente {
    private String nome;
    private String id;

    public Utente(String nome, String id){
        this.nome = nome;
        this.id = id;
    }

    public String getNome(){return nome;}
    public String getId(){return id;}

    public String setNome(String nuovoNome){return this.nome = nuovoNome;}
    public String setId(String nuovoId){return this.id = nuovoId;}
    
    
}
