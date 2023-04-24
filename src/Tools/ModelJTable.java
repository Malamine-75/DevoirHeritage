package Tools;

import Entities.Projet;
import Entities.ProjetMobile;
import Entities.ProjetWeb;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] colonnes;
    private Object[][] lignes;
    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    public void loadDatasProjets(ArrayList<Projet> uneListe) {

        colonnes = new String[]{"Id","Nom","Durée","Taux Horaire"};
        lignes = new Object[uneListe.size()][4];
        int i = 0;

        for(Projet projet : uneListe)
        {
            lignes[i][0] =
            lignes[i][1] =
            lignes[i][2] =
            lignes[i][3] =
            i++;
        }
        fireTableChanged(null);
    }

    public void loadDatasProjetsMobile(ArrayList<ProjetMobile> uneListe)
    {
        colonnes = new String[]{""};
        lignes = new Object[][5];
        int i = 0;

        for (ProjetMobile mobile : uneListe)
        {
            lignes[][] =
            lignes[][] =
            lignes[][] =
            lignes[][] =
            lignes[][] =
            i++;
        }
        fireTableChanged(null);
        }


    }
}