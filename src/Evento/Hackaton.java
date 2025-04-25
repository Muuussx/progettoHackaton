package Evento;
import User.Team;
import User.Utente;


import java.time.LocalDateTime;
import java.util.List;


    public class Hackaton {
        private Long id;
        private String nomeEdizione;
        private String sede;
        private LocalDateTime dataInizioEvento, dataFineEvento;
        private boolean dispRegistrazione;
        private Utente organizzatore;
        private int nMaxPartecipanti, nMaxMembriTeam;
        private String obiettivoEvento;
        private List<Utente> giudici;
        private List<Team> teamsIscritti;

        public Hackathon(Long id,
                         String nomeEdizione,
                         String sede,
                         LocalDateTime dataInizioEvento,
                         LocalDateTime dataFineEvento,
                         Utente organizzatore,
                         int nMaxPartecipanti,
                         int nMaxMembriTeam,
                         String obiettivoEvento,
                         List<Utente> tuttiGliUtenti,
                         List<Team> teamsIscritti) {

            this.id                    = id;
            this.nomeEdizione          = nomeEdizione;
            this.sede                  = sede;
            this.dataInizioEvento      = dataInizioEvento;
            this.dataFineEvento        = dataFineEvento;
            this.dispRegistrazione     = true;               // di default aperte
            this.organizzatore         = organizzatore;
            this.nMaxPartecipanti      = nMaxPartecipanti;
            this.nMaxMembriTeam        = nMaxMembriTeam;
            this.obiettivoEvento       = obiettivoEvento;


        }


