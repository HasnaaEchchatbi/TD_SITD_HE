package TD3;

 class PointEx3 {
    private int x, y;
     public PointEx3(int x, int y) {
            this.x = x;
            this.y = y;
     }

     public int getX() {
         return x;
     }

     public void setX(int x) {
         this.x = x;
     }

     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }

     public void affCoord() {
            System.out.println("Coordonnees : " + x + " " + y);
        }

    }
class Center extends PointEx3{
    private   String nom;
    public Center(int x, int y, String nom) {
        super(x,y);
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affNom(){
         System.out.println("le point "+getNom());
     }
     public void affich(){
        /* System.out.println("le point "+getNom()
                 +" et ses coordonnées"+getX()
                 +"et"+getY());*/
         System.out.println("le point "+getNom());
         affCoord();
     }
}
class Cercle extends Center{
     int rayon;
     public  Cercle(int x,int y,String nom,int rayon){
         super(x,y,nom);
         this.rayon=rayon;
     }
     public void perimeter(int rayon){
         System.out.println("perimeter is "+2*Math.PI*rayon);
     }
     public void affCercle(){
         affich();
         System.out.println("rayon :"+this.rayon);

     }

    public static void main(String[] args) {
        Center c=new Center(2,4,"A");
        c.affich();
        Cercle cl=new Cercle(1,5,"B",4);
        cl.perimeter(4);
        cl.affCercle();
    }
}
