package TD2;



class livre {
    private String titre;
    private String auteur;
    private double prix;
    private int annee;

    livre() {
    }

    livre(String titre) {
        this.titre = titre;
    }

    livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    livre(String titre, String auteur, double prix) {
        this(titre, auteur);
        this.prix = prix;
    }

    livre(String titre, String auteur, double prix, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.prix = prix;
    }

    livre(livre liv) {
        this.titre = liv.getTitre();
        this.auteur = liv.getAuteur();
        this.annee = liv.getAnnee();
        this.prix = liv.getPrix();
    }

    public double getPrix() {
        return this.prix;
    }

    public int getAnnee() {
        return this.annee;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString() {
        return "le titre du td2.livre " + this.titre + " l'auteur est " + this.auteur + " le prix est " + this.prix + " l'annee est " + this.annee;
    }

    public static void main(String[] args) {
        livre l1 = new livre();
        livre l2 = new livre("t2");
        livre l3 = new livre("t3", "a3");
        livre l4 = new livre("t4", "a4", 12.0);
        livre l5 = new livre("t5", "a5", 13.0, 1999);
        livre l6 = new livre(l5);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
    }
}
