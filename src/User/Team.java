package User;

import Evento.Hackaton;
import Giudizio.GiudizioFinale;
import Evento.Progresso;

import java.util.List;
    public class Team {
        private Long id;
        private String nome;
        private Hackaton hackaton;
        private List<Utente> membri;
        private boolean isCompleto;
        public int votoFinale;

        public Team(Long id, String nome, Hackaton hackaton, List<Utente> membri,
                    boolean isCompleto, List<GiudizioFinale> , int votoFinale) {
            this.id = id;
            this.nome = nome;
            this.hackaton = hackaton;
            this.membri = membri;
            this.isCompleto = false;
            this.votoFinale = votoFinale;
        }

        public String getNome() {
            return nome;
        }
        public Hackaton getHackaton() {
            return hackaton;
        }
        public void getMembri(){
            for(Utente u:membri){
                System.out.println(u);
                System.out.println("---------------------------");
            }

        }
        public boolean isCompleto() {
            return isCompleto;
        }
        public void setCompleto(boolean completo) {
            isCompleto = completo;
        }
        public void setVotoFinale(int votoFinale) {
            this.votoFinale = votoFinale;
        }
        public int getVotoFinale() {
            return votoFinale;
        }
        public Long getId() {
            return id;
        }

    }

