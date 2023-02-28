package eseo.exercices.triangle;

public class Triangle {
    int A;
    int B;
    int C;

    public Triangle(int A, int B, int C) {
        setCotes(A, B, C);
    }

    public int[] getCotes(){
        int[] cotes = {this.A, this.B, this.C};
        return cotes;
    }

    public void setCotes(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    TriangleType getType() {
        if (this.A != this.B && this.C != this.B && this.A > 0 && this.B > 0 && this.C > 0) {
            return TriangleType.SCALENE;
        } else if (this.A == this.B && this.B == this.C) {
            return TriangleType.EQUILATERAL;
        } else if (this.A == this.B || this.B == this.C || this.A == this.C) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.INVALID;
        }
    }
}
