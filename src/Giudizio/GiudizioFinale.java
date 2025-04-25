package Giudizio;

import User.Team;
import User.Utente;
import java.time.LocalDateTime;

public class GiudizioFinale extends Valutazione {
        private int voto;   // 0–10

        public GiudizioFinale(Long id, Utente giudice, Team team, LocalDateTime dataValutazione,
                              int voto) {
            super(id, giudice, team, dataValutazione);
            this.voto = voto;
        }
        public int getVoto() {
            return voto;
        }
        public void setVoto(int voto) {
            this.voto = voto;
        }
        public String toString() {
            return "%n "+this.getValutazione()+"%nVoto: "+voto;
        }

    }

