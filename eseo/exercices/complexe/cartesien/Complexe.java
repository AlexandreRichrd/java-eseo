package eseo.exercices.complexe.cartesien;

public class Complexe {
    private double reel;
    private double imaginaire;

    public Complexe() {
        setReel(0);
        setImaginaire(0);
    }

    public Complexe(double reel, double imaginaire) {
        setReel(reel);
        setImaginaire(imaginaire);
    }

    public Complexe(boolean estPolaire, double arg1, double arg2) {
        if (estPolaire) {
            setReel(arg1 * Math.cos(arg2));
            setImaginaire(arg1 * Math.sin(arg2));
        } else {
            setReel(arg1);
            setImaginaire(arg2);
        }
    }

    public double getImaginaire() {
        return imaginaire;
    }

    public double getReel() {
        return reel;
    }

    public void setImaginaire(double imaginaire) {
        this.imaginaire = imaginaire;
    }

    public void setReel(double reel) {
        this.reel = reel;
    }

    public double getModule() {
        return Math.sqrt(Math.pow(this.reel, 2) + Math.pow(this.imaginaire, 2));
    }

    public double getArgument() {
        return Math.atan(this.imaginaire / this.reel);
    }


    public Complexe additionner(Complexe complexe) {
        return new Complexe(this.reel + complexe.getReel(), this.imaginaire + complexe.getImaginaire());
    }

    public Complexe multiplier(Complexe complexe) {
        return new Complexe(this.reel * complexe.getReel() - this.imaginaire * complexe.getImaginaire(), this.reel * complexe.getImaginaire() + this.imaginaire * complexe.getReel());
    }


    public void afficher() {
        System.out.println(this.reel + " + " + this.imaginaire + "i");
    }
}
