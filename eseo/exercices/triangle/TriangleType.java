package eseo.exercices.triangle;

public enum TriangleType {
    SCALENE ("Scalene"), 
    ISOSCELES ("Isosceles"), 
    EQUILATERAL ("Equilateral"), 
    INVALID ("Invalid");

    private String type = "";

    private TriangleType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        if(this.type == "Invalid") {
            return "Triangle invalide";
        } else {
            return "Triangle " + this.type;
        }
    }
}