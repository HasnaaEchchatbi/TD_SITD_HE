package TD3;

 public class PointEx1 {
   private int x;
   private int y;
   public void PointEx1(int x,int y){
       this.x=x;
       this.y=y;
   }
   public void deplace(int dx,int dy){
       x+=dx;
       y+=dy;
   }
    public int getX() {
        return x;}
    public int getY() {
        return y;
    }
}
 class PointA extends PointEx1{
   void affiche(){
         System.out.println("les coordonnes du point "
                 +getX()+" et "+getY());
   }
    public static void main(String[] args) {

        PointA pa = new PointA();
        pa.PointEx1(2,7);
        pa.affiche();
        pa.deplace(3,6);
        pa.affiche();
   }
    }
