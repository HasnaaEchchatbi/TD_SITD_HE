package TD3;

public class PointEx2 {
    private int x,y;
    public void PointEx2(int x ,int y){
        this.x=x;
        this.y=y;
    }
    public void deplace(int dx , int dy){
        x+=dx;
        y+=dy;
    }
    public void afficoord(){
        System.out.println("les coordonnées "+x+" et "+y);
    }
}
class PointNom extends PointEx2{
    private char nom;
  public void setPointNom(int x,int y,char nom){
      PointEx2(x,y);
      this.nom=nom;
  }
  public void setNom(char nom){
      this.nom=nom;
  }
  public void afficoordNom(){
      System.out.println("point "+this.nom);
      afficoord();
  }

    public static void main(String[] args) {

        PointNom pn1 =new PointNom();
        pn1.setPointNom(3,4,'A');
        pn1.afficoordNom();
        pn1.deplace(2,2);
        pn1.afficoordNom();
        pn1.afficoord();
    }
}