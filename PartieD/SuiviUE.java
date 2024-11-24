package PartieD;

import java.util.ArrayList;

public class SuiviUE 
{
    String idUE;  //Intitulé de l'UE
    double coeff; //Coefficient
    ArrayList<Double> notes;

    public SuiviUE(String nom, double coeff)
    {
        this.coeff = coeff;
        this.idUE = nom;
        this.notes = new ArrayList<>();
    }

    public void add(double note)
    {
        notes.add(note);
    }

    public String toString()
    {
        return "UE : " + idUE + " coefficient : " + coeff
                + " notes " + notes;
    }

    public double moyenne() throws Defaillance
    {
        if(notes.size() == 0)
        {
            throw new Defaillance(idUE);
        }
        double sum = 0.0;
        for(double x : notes) sum += x;
        return sum / notes.size();
    }
}
