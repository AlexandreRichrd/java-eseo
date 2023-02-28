package eseo.exercices.utilisateurs;

public class Personne {
    
    static int nbPersonnes = 0;
    static final String NATIONALITE_PAR_DEFAULT = "Francaise";

    private String nom;
    private String prenom;
    private int anneeDeNaissance;
    private String nationalite;

    public Personne() {
        setNom("Dupont");
        setPrenom("Jean");
        setAnneeDeNaissance(2000);
        setNationalite(NATIONALITE_PAR_DEFAULT);

        incrementerNbPersonnes();
    }

    public Personne(String nom, String prenom, int anneeDeNaissance, String nationalite) {
        setNom(nom);
        setPrenom(prenom);
        setAnneeDeNaissance(anneeDeNaissance);
        setNationalite(nationalite);

        incrementerNbPersonnes();
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getAnneeDeNaissance() {
        return this.anneeDeNaissance;
    }

    public String getNationalite() {
        return this.nationalite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnneeDeNaissance(int anneeDeNaissance) {
        this.anneeDeNaissance = anneeDeNaissance;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getAge() {
        return 2023 - this.anneeDeNaissance;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    private void incrementerNbPersonnes() {
        nbPersonnes++;
    }

    public void afficher() {
        System.out.println("\nNom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("Annee de naissance: " + this.anneeDeNaissance);
        System.out.println("Nationalite: " + this.nationalite);
    }


    
}
