package TD3;

public class testbatiment {
    public static void main(String[] args) {
        Batiment b =new Batiment();
        Maison m=new Maison("casa",2);
        Immeuble i=new Immeuble("settat",24);
        System.out.println(i.toString());
        System.out.println( m.toStrinng());
        b.setAdresse("rabat");
        System.out.println(b.tostring());
        m.setAdresse("agadir");
        System.out.println(m.toStrinng());
        i.setAdresse("kech");
        System.out.println(i.toString());

    }
}
