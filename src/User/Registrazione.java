package User;

import Evento.Hackaton;

import java.time.LocalDateTime;

    public class Registrazione {
        private Utente utente;
        private Hackaton hackaton;
        private Team team;              // può essere null
        private LocalDateTime dataReg;
        private boolean statoRegistrazione; //true = registrazione avvenuta; false == errore nella registrazione

        public Registrazione(Utente utente, Hackaton hackaton,
                             Team team, LocalDateTime dataReg) {
            this.utente = utente;
            this.hackaton = hackaton;
            this.team = team;
            this.dataReg = dataReg;
            this.statoRegistrazione = false;
        }
        public Utente getUtente() {
            return utente;
        }
        public Hackaton getHackaton() {
            return hackaton;
        }
        public Team getTeam() {
            return team;
        }
        public LocalDateTime getDataReg() {
            return dataReg;
        }
        public boolean isStatoRegistrazione() {
            return statoRegistrazione;
        }
        public void setStatoRegistrazione(boolean statoRegistrazione) {
            this.statoRegistrazione = statoRegistrazione;
        }
        public void setUtente(Utente utente) {
            this.utente = utente;
        }
        public void setHackaton(Hackaton hackaton) {
            this.hackaton = hackaton;
        }
        public void setTeam(Team team) {
            this.team = team;
        }
        public void setDataReg(LocalDateTime dataReg) {
            this.dataReg = dataReg;
        }
        public String getRegistrazione() {
            return "Utente:"+utente+"%nHackaton:"+hackaton+"%nTeam:"+team+"%nData:"+dataReg;
        }
    }

