package TD3;

public interface FigureInterface {
    String nom="" ;
    String getPerimeter();
     String getAir();
     String tostring();
}
class DisqueI implements FigureInterface{
    private double center;
    private  double rayon;

     public DisqueI(){}
    public DisqueI(double center , double rayon ){
        this.center=center;
        this.rayon=rayon;
    }
    public DisqueI(double center , double rayon ,  String nom){
        this.center=center;
        this.rayon=rayon;
    }

    public double getCenter() {
        return center;
    }

    public void setCenter(double center) {
        this.center = center;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public String getPerimeter(){
        return "le perimetre du disque est "+2*Math.PI*getRayon();
    }
    public String getAir(){
        return "l'aire du disque est "+Math.PI*getRayon()*getRayon();
    }

    @Override
    public String tostring() {
        return "DisqueI{" +
                "center=" + center +
                ", rayon=" + rayon +
                '}';
    }

}
class RectangleI implements FigureInterface{
    double longueur;
    double largeur;
    public void Rectangle(){}
    public RectangleI(double longueur, double largeur) {
        this.largeur=largeur;
        this.longueur=longueur;
    }
    public void RectangleI(String nom,double longueur,double largeur){
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

    @Override
    public String tostring() {
        return "Rectangle{" +
                "longeur=" + getLongueur() +
                ", largeur=" + getLargeur() +
                '}';
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
