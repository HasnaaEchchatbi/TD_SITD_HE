package TD2;





class rectangle {
    private double longueur;
    private double largeur;

    public rectangle() {
    }

    public rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public rectangle(rectangle rect) {
        this.largeur = rect.largeur;
        this.longueur = rect.longueur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public double getLongueur() {
        return this.longueur;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0.0) {
            this.largeur = largeur;
        } else {
            System.out.println("la largeur doit etre positive");
        }

    }

    public void setLongueur(double longueur) {
        if (longueur > 0.0) {
            this.longueur = longueur;
        } else {
            System.out.println("la longueur doit etre positive");
        }

    }

    public double perimetre() {
        return 2.0 * (this.longueur + this.largeur);
    }

    public double aire() {
        return this.largeur * this.longueur;
    }

    public boolean isCarre() {
        return this.largeur == this.longueur;
    }

    public String toString() {
        return "rectangle{longueur=" + this.longueur + ", largeur=" + this.largeur + "}";
    }

    public static void main(String[] args) {


        rectangle r2 = new rectangle(5.0, 2.0);
        System.out.println(r2);
        double p = r2.perimetre();
        double a = r2.aire();
        boolean c = r2.isCarre();
        System.out.println(p);
        System.out.println(a);
        System.out.println(c);
    }
}