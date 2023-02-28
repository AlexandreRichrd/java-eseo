package eseo.exercices.utilisateurs;

public class AnnuaireEssai {
    public static void main(String[] args){
        Personne p1 = new Personne();
        Personne p2 = new Personne("Chaput", "Romain", 1998, "Francaise");
        Personne p3 = new Personne("Gaborit", "Antonin", 2002, "Goulag");
        Personne p4 = new Personne("Le Baron", "Valentin", 2002, "Juif");
        Personne p5 = new Personne("Guitet", "Arthur", 2002, "Animal");

        Annuaire annuaire = new Annuaire();

        annuaire.ajouterPersonne(p1);
        annuaire.ajouterPersonne(p2);
        annuaire.ajouterPersonne(p3);
        annuaire.ajouterPersonne(p4);
        annuaire.ajouterPersonne(p5);

        annuaire.afficherAnnuaire();

        annuaire.rechercherPersonne("Gaborit");

        System.out.println("Suppression de Gaborit : ");

        annuaire.supprimerPersonne("Gaborit");

        annuaire.rechercherPersonne("Gaborit");


        System.out.println("\n\nAffichage de l'annuaire : ");

        annuaire.afficherAnnuaire();
        
    }
}
