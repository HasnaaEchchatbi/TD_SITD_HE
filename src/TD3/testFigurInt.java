package TD3;

public class testFigurInt {
    public static void main(String[] args) {
        DisqueI d=new DisqueI(3,5,"A");
        System.out.println(d.getPerimeter());
        System.out.println(d.getAir());
        System.out.println(d.tostring());
        RectangleI r = new RectangleI(4,5);
        System.out.println(r.getPerimeter());
        System.out.println(r.getAir());
        System.out.println(r.tostring());
    }
}
