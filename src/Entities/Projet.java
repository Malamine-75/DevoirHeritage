package Entities;

public class Projet implements Comparable
{
    private int idProjet;
    private int duree;
    private double tauxHoraire;
    private String nomProjet;

    public Projet(int idProjet, int duree, double tauxHoraire, String nomProjet)
    {
        this.idProjet = idProjet;
        this.duree = duree;
        this.tauxHoraire = tauxHoraire;
        this.nomProjet = nomProjet;
    }

    public double getcalculerMontant()
    {
       return duree * tauxHoraire * 8;
    }

    public String getInfos()
    {
        return "Projet" + idProjet + "-" + "nomProjet " + duree + tauxHoraire;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
