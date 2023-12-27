package TD3;

class vehicule{
    private int nbpassager;

    public vehicule(int nbpassager) {
        this.nbpassager=nbpassager;
    }

    public String tostring(){
        return "le nombre de passagers est "+nbpassager;
    }
}
class Moto extends vehicule{
    private int nbroues;
    public Moto(int nbpassager,int nbroues){
        super(nbpassager);
        this.nbroues=nbroues;

    }
}
class avion extends vehicule{
    private  int nbmoteur;
    public  avion(int nbPassager){
      super(nbPassager);
    }
    public  avion(int nbPassager,int nbmoteur){
        super(nbPassager);
     this.nbmoteur=nbmoteur;
    }
}
class triporteur extends Moto{
    public triporteur(int nbPassager, int nbroues) {
        super(nbPassager, nbroues);
    }



}