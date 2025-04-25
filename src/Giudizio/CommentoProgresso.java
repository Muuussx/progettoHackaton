package Giudizio;

import Evento.Progresso;
import User.Team;
import User.Utente;

import java.time.LocalDateTime;

public class CommentoProgresso extends Valutazione {
        private Progresso progresso;
        private String commentoGiudice;

        public CommentoProgresso(Long id, Utente giudice, Team team, LocalDateTime dataValutazione,
                                 Progresso progresso, String commentoGiudice) {
            super(id, giudice, team, dataValutazione);
            this.progresso = progresso;
            this.commentoGiudice = commentoGiudice;
        }
        public Progresso getProgresso() {
            return progresso;
        }
        public String getCommentoGiudice() {
            return commentoGiudice;
        }
        public void setCommentoGiudice(String commentoGiudice) {
            this.commentoGiudice = commentoGiudice;
        }
        public void setProgresso(Progresso progresso) {
            this.progresso = progresso;
        }


        public String toString() {
            return this.getValutazione()+"%n"+progresso+"%n"+commentoGiudice;
        }

    }


