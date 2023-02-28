package eseo.exercices.triangle;

public class PileDeTriangles {
    private Triangle[] pile;

    public PileDeTriangles() {
        this.pile = new Triangle[0];
    }

    public boolean estVide() {
        return this.pile.length == 0 ? true : false;
    }

    public void empiler(Triangle triangle) {
        Triangle[] newPile = new Triangle[this.pile.length + 1];
        for(int i = 0; i < this.pile.length; i++) {
            newPile[i] = this.pile[i];
        }
        newPile[this.pile.length] = triangle;
        this.pile = newPile;
    }

    public void depiler() {
        if(!this.estVide()) {
            Triangle[] newPile = new Triangle[this.pile.length - 1];
            for(int i = 0; i < newPile.length; i++) {
                newPile[i] = this.pile[i];
            }
            this.pile = newPile;
        }
    }
}
