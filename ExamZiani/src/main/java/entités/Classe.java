package entités;

import Classe1.Constructeur;
import Classe1.Méthode;

import java.util.ArrayList;
import java.util.List;


public class Classe extends Entité{
    private boolean publique;
    private boolean statique;
    private boolean finale;
    private boolean abstraite;

    private List<Méthode> méthodes;
    private List<Constructeur> constructeurs;



    public Classe(String name) {
        super(name);
    }

}
