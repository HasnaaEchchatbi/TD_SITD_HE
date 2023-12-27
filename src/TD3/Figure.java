package TD3;
 abstract class Figure{
    private  String nom;
    public Figure(){}
    protected Figure(String nom){
        this.nom=nom;
    }
    public abstract String getPerimeter();
    public abstract String getAir();
    public String tostring(){
        return "figure:"+nom;
    }
}
class Disque extends Figure{
   private double center;
    private  double rayon;
    public Disque(){super();}
    public  Disque(double center,double rayon){
        this.center=center;
        this.rayon=rayon;
    }
    public Disque(double center,double rayon,String nom){
        super(nom);
        this.center=center;
        this.rayon=rayon;
    }
    public String getPerimeter(){
        return "le perimetre du disque est "+2*Math.PI*getRayon();
    }
    public String getAir(){
        return "l'aire du disque est "+Math.PI*getRayon()*getRayon();
    }

    public double getCenter() {
        return this.center;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public void setCenter(double center) {
        this.center = center;
    }
}
class Rectangle extends Figure{
    double longueur;
    double largeur;
    public void Rectangle(){}
    public Rectangle(double longueur, double largeur) {
        this.largeur=largeur;
        this.longueur=longueur;
    }
    public void Rectangle(String nom,double longueur,double largeur){
        this.largeur=largeur;
        this.longueur=longueur;
    }

    @Override
    public String getPerimeter() {
        return "le perimetre de ce rectangle est "+2*(getLargeur()+getLongueur());
    }

    @Override
    public String getAir() {
        return " l'aire de ce rectangle est "+getLargeur()*getLongueur();
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
}