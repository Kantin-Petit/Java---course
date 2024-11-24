package PartieD;

import java.util.ArrayList;

public class SuiviEtu 
{
    private ArrayList<SuiviUE> suivi;

    public SuiviEtu(int num)
    {
        this.suivi = new ArrayList<>();
    }

    public void addUE(String idUE, double coeff)
    {
        suivi.add(new SuiviUE(idUE, coeff));
    }

    public double moyenne() throws Defaillance     // ligne A
    {
        double sum = 0.0; double sumCoeffs = 0.0;
        for(SuiviUE sue : suivi)
        {
            sum += sue.moyenne() * sue.coeff;
            sumCoeffs += sue.coeff;
        }
        return sum / sumCoeffs;
    }

    public double moyenne_bis()     // ligne A
    {
        double sum = 0.0; double sumCoeffs = 0.0;
        for(SuiviUE sue : suivi)
        {
            try
            {
                sum += sue.moyenne() * sue.coeff;
            }
            catch(Defaillance d)
            {
                System.out.println("L'élève n'a pas de note dans l'UE " + d.getID());
                return 0.0;
            }
            sumCoeffs += sue.coeff;
        }
        return sum / sumCoeffs;
    }

    public void addNote(String idUE, double note) throws BadUE
    {
        for(SuiviUE sue : suivi)
        {
            if(sue.idUE.equals(idUE))
            {
                sue.add(note); return;
            }
        }
        throw new BadUE(idUE);
    }
    // À compléter
}