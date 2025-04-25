package Giudizio;

import User.Team;
 import User.Utente;

 import java.time.LocalDateTime;

    public abstract class Valutazione {
        private Long id;
        private Utente giudice;
        private Team team;
        private LocalDateTime dataValutazione;

        public Valutazione(Long id, Utente giudice, Team team, LocalDateTime dataValutazione) {
            this.id = id;
            this.giudice = giudice;
            this.team = team;
            this.dataValutazione = dataValutazione.now();
        }

        public Long getID() {
            return id;
        }
        public Utente getGiudice() {
            return giudice;
        }
        public Team getTeam() {
            return team;
        }
        public LocalDateTime getDataValutazione() {
            return dataValutazione;
        }
        public void setID(Long id) {
            this.id = id;
        }
        public void setGiudice(Utente giudice) {
            this.giudice = giudice;
        }
        public void setTeam(Team team) {
            this.team = team;
        }
        public void setDataValutazione(LocalDateTime dataValutazione) {
            this.dataValutazione = dataValutazione;
        }
        public String getValutazione() {
            return "Giudice:"+giudice+"%nTeam:"+team+"%nData:"+dataValutazione;
        }

    }


