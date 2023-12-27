package TD3;

public class testfigure {
    public static void main(String[] args) {
        Disque d = new Disque(2, 6);
        Rectangle r = new Rectangle(2.1,4.2);
        System.out.println(d.getPerimeter());
        System.out.println(d.getAir());
        System.out.println(r.getPerimeter());
        System.out.println(r.getAir());
    }

}
