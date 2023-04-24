package Entities;

public class ProjetWeb extends Projet
{
    private int nbPages;
    private boolean responsive;

    public ProjetWeb(int idProjet, int duree, double tauxHoraire, String nomProjet,int nbPages, boolean responsive) {
        super(idProjet, duree, tauxHoraire, nomProjet);
        this.nbPages = nbPages;
        this.responsive = responsive;



    }
}
