package TD3;
class Batiment{
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
    private String adresse;

    public Batiment(String adresse) {
        this.adresse=adresse;
    }

    public Batiment() {}

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getAdresse() {
        return adresse;
    }
    public String tostring(){
        return "l'adresse du batiment est "
                +getAdresse();
    }

}
class Maison extends Batiment{
    int nbchambres;
    public Maison(){
        super();
    }
    public Maison(String adresse,int nbchambres) {
        super(adresse);
        this.nbchambres = nbchambres;
    }
    public int getNbchambres() {
        return nbchambres;
    }
     public void setNbchambres(int nbchambres){
        this.nbchambres=nbchambres;
    }
    public String toStrinng(){
       return "Maison nombre de chambre : "+getNbchambres()+"adresse: "+getAdresse();
    }
    
}
class Immeuble extends Batiment{
    int nbappart;
    public Immeuble(){
        super();
    }
    public Immeuble (String adresse,int nbappart){
        super(adresse);
        this.nbappart=nbappart;
    }
    public int getNbappart() {
        return nbappart;
    }

    public void setNbappart(int nbappart) {
        this.nbappart = nbappart;
    }
    public String toString() {
        return "Immeuble{" +
                "nbAppart=" + this.getNbappart() +
                " adresse : "+this.getAdresse()+
                '}';
    }}




