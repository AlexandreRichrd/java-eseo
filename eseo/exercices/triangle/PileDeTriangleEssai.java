package eseo.exercices.triangle;

public class PileDeTriangleEssai {
    
    public static void main(String[] args){
        PileDeTriangles pile = new PileDeTriangles();
        Triangle triangle1 = new Triangle(4, 4, 5);
        Triangle triangle2 = new Triangle(4, 4, 4);
        Triangle triangle3 = new Triangle(4, 5, 6);
        pile.empiler(triangle1);
        pile.empiler(triangle2);
        pile.empiler(triangle3);
        System.out.println(pile.estVide() ? "La pile est vide" : "La pile n'est pas vide");
        pile.depiler();
        pile.depiler();
        pile.depiler();
        System.out.println(pile.estVide() ? "La pile est vide" : "La pile n'est pas vide");
    }
    
}
