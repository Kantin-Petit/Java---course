package PartieB;

public class Personne
{
  private String nom;
  private String prenom;
  
  public Personne(String nom, String prenom)
  {
    this.nom = nom; this.prenom = prenom;
  }
  
  public String toString()
  {
    return nom + " " + prenom;
  }
}
