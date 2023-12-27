package TD2;

class point {
    double abscisse;
    double ordonne;
    String nom;

    public point(double x, double y, String n) {
        this.nom = n;
        this.abscisse = x;
        this.ordonne = y;
    }

    public void afficher() {
        System.out.println("le nom du td2.point est " + this.nom + " et l'abscisse: " + this.abscisse +
                " et l'ordonne: " + this.ordonne);
    }

    public void translate(double dx, double dy) {
        this.abscisse += dx;
        this.ordonne += dy;
    }
    public static void main(String[] args) {
        point p1 = new point(1.0, 3.0, "A");
        p1.afficher();
        p1.translate(1.0, 1.0);
        p1.afficher();
    }
}