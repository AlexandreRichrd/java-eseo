package eseo.exercices.utilisateurs;

public class PersonneEssai {
    public static void main(String[] args){
        Personne p1 = new Personne();
        Personne p2 = new Personne("Chaput", "Romain", 1998, "Francaise");

        p1.afficher();

        p1.setNom("Dupond");
        p1.setPrenom("Jacques");
        p1.setAnneeDeNaissance(2012);
        p1.setNationalite("Turque");

        p1.afficher();

        p2.afficher();
    }
}
