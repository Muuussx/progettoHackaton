package Evento;

import User.Team;

import java.util.ArrayList;
import java.util.List;

public class Classifica {
    private Hackaton hackaton;
    private ArrayList<Team> graduatoria;  // già ordinata dal migliore al peggiore

    public Classifica(Hackaton hackaton, ArrayList<Team> graduatoria) {
        this.hackaton = hackaton;
        this.graduatoria = new ArrayList<Team>();
    }

}

