package eseo.exercices.complexe.cartesien;

public class ComplexeEssai {
    public static void main(String[] args){
        Complexe c1 = new Complexe(2, 3);
        Complexe c2 = new Complexe(1, 2);


        c1.afficher();
        c2.afficher();

        Complexe c3 = c1.additionner(c2);

        c3.afficher();

        Complexe c4 = new Complexe(true, 5, 12);
        c4.afficher();
    }
}
