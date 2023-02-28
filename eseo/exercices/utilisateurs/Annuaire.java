package eseo.exercices.utilisateurs;

public class Annuaire {
    private Personne[] personnes;

    public Annuaire() {
        this.personnes = new Personne[0];
    }

    public void ajouterPersonne(Personne personne) {
        Personne[] personnes = new Personne[this.personnes.length + 1];

        for (int i = 0; i < this.personnes.length; i++) {
            personnes[i] = this.personnes[i];
        }

        personnes[personnes.length - 1] = personne;

        this.personnes = personnes;
    }

    public void rechercherPersonne(String nom) {
        int cpt = 0;
        for (Personne personne : this.personnes) {
            if (personne.getNom().equals(nom)) {
                personne.afficher();
                cpt++;
            }
        }
        if (cpt == 0) {
            System.out.println("Aucune personne ne correspond a ce nom");
        }
    }

    public void afficherAnnuaire() {
        for (Personne personne : this.personnes) {
            personne.afficher();
        }
    }

    public void supprimerPersonne(String nom) {

        int cpt = 0;
        for (Personne personne : this.personnes) {
            if (personne.getNom().equals(nom)) {
                cpt++;
            }
        }


        Personne[] personnes = new Personne[this.personnes.length - cpt];

        int index = 0;
        for (Personne personne : this.personnes) {
            if (!personne.getNom().equals(nom)) {
                personnes[index] = personne;
                index++;
            }
        }

        this.personnes = personnes;
    }
}
