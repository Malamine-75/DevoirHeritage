package Entities;

public class ProjetMobile extends Projet
{
    private int nbEcrans;

    public ProjetMobile(int idProjet, int duree, double tauxHoraire, String nomProjet, int nbEcrans) {
        super(idProjet, duree, tauxHoraire, nomProjet);
        this.nbEcrans = nbEcrans;

    }
}
