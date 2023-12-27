package TD2;




class point2 {
    private double abscisse;
    private double ordonne;
    private String nom;

    public point2() {
    }

    public double getAbscisse() {
        return this.abscisse;
    }

    public double getOrdonne() {
        return this.ordonne;
    }

    public String getNom() {
        return this.nom;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonne(double ordonne) {
        this.ordonne = ordonne;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double norme() {
        return Math.sqrt(this.abscisse * this.abscisse + this.ordonne * this.ordonne);
    }


    public static void main(String[] args) {
        point2 p1 = new point2();
        p1.setAbscisse(3.0);
        p1.setOrdonne(2.0);
        p1.setNom("A");
        System.out.println(p1.getAbscisse());
        System.out.println(p1.getOrdonne());
        System.out.println(p1.getNom());
        double d = p1.norme();
        System.out.println(d);
    }
}
