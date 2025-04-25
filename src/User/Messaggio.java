package User;

import java.time.LocalDateTime;

public class Messaggio {
    private String id;
    private Utente mittente;
    private Utente destinatario;
    private Team teamProposto;
    private String contenuto;
    private LocalDateTime dataInvio;
    private boolean statoMessaggio; // può essere considerato anche come enum : IN_ATTESA,ACCETTATO,RIFIUTATO.

    public Messaggio(String id, Utente mittente, Utente destinatario, Team teamProposto, String contenuto){
        this.id = id;
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.teamProposto = teamProposto;
        this.contenuto = contenuto;
        this.dataInvio = LocalDateTime.now();
        this.statoMessaggio = false;
    }

    public void setMittente(Utente mittente){
        this.mittente = mittente;
    }
    public void setDestinatario(Utente destinatario){
        this.destinatario = destinatario;
    }
    public void setTeamProposto(Team teamProposto){
        this.teamProposto = teamProposto;
    }
    public void setContenuto(String contenuto){
        this.contenuto = contenuto;
    }
    public String getId(){
        return id;
    }
    public Utente getMittente(){
        return mittente;
    }
    public Utente getDestinatario(){
        return destinatario;
    }
    public String getContenuto(){
        return contenuto;
    }
    public LocalDateTime getDataInvio(){
        return dataInvio;
    }
    public boolean getStatoMessaggio(){
        return statoMessaggio;
    }
    public Team getTeamProposto(){
        return teamProposto;
    }
}
