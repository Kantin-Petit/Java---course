package PartieC;

public class Main 
{
    public static void main(String[] args) 
    {
        //Cdec10
        Personne[] aut = {new Personne("N. Wirth")};
        Document doc = new Document("Algorithm + Data Structure = Program", aut);
        System.out.println(doc.toString());
        //Cdec11
        Livre w = new Livre(
                    "Algorithm + Data Structure = Program",
                        aut, 
                    130224189, 
                    1976
                    );
        //dec20
        Document x = new Livre(
                                "Patience dans l'azur", new Personne[]{new Personne(
                                "Hubert Reeves")},
                                2020099179,
                                1981);
        
        System.out.println("Auteurs : "+ x.nbAuteurs() +"\n isbn : " + ((Livre)x).getIsbn());
        System.out.println(((Livre)x).toString());
    }    
}
