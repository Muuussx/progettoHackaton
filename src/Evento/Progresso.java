package Evento;

import Giudizio.CommentoProgresso;
import User.Team;

import java.time.LocalDateTime;
import java.util.List;

    public class Progresso {
        private Long id;
        private Team team;
        private String urlDocumento;
        private LocalDateTime dataPubblicazione;
        private String commento;

        public Progresso(Long id, Team team, String urlDocumento,
                         LocalDateTime dataPubblicazione, String commento,
                         List<CommentoProgresso> commentiGiudici) {
            this.id = id;
            this.team = team;
            this.urlDocumento = urlDocumento;
            this.dataPubblicazione = dataPubblicazione;
            this.commento = commento;
        }

    public void setID(Long id) {
            this.id = id;
    }
    public void setTeam(Team team) {
            this.team = team;
    }
    public void setUrlDocumento(String urlDocumento) {
            this.urlDocumento = urlDocumento;
    }
    public void setDataPubblicazione(LocalDateTime dataPubblicazione) {
            this.dataPubblicazione = dataPubblicazione;
    }
    public void setCommento(String commento) {
            this.commento = commento;
    }
    public Long getID() {
            return id;
    }
    public Team getTeam() {
            return team;
    }
    public String getUrlDocumento() {
            return urlDocumento;
    }
    public LocalDateTime getDataPubblicazione() {
            return dataPubblicazione;
    }
    public String getCommento() {
            return commento;
    }
    public String toString(){
            return "Team:"+team+"%nUrl:"+urlDocumento+"%nData:"+dataPubblicazione+"%nCommento:"+commento+"%n";
    }


    }

