package TD3;

public  abstract class Employee {
   private String nom,prenom;
   public Employee(){}
   public Employee(String nom,String prenom){
       this.nom=nom;
       this.prenom=prenom;
   }
   public String toString(){
       return "l'employee "+nom+" "+prenom;
   }
   public abstract void gains();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
class Patron extends Employee{
     private double salaire;
     public Patron(){
         super();
     }
     public Patron(String nom,String prenom,double salaire){
         super(nom,prenom);
         this.salaire=salaire;
     }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Patron{" +getNom()+" "+getPrenom()+
                "salaire=" + salaire +
                '}';
    }

    @Override
    public void gains() {
        System.out.println(this.salaire);
    }
}
class  TravailleurCommission extends Employee{
    private double salaire;
    private double commission;
    private int quantite;
    public TravailleurCommission(){
    }
    public TravailleurCommission(String nom,String prenom,double salaire,double commission){
        super(nom,prenom);
        this.salaire=salaire;
        this.commission=commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "TravailleurCommission{" +getPrenom()+" "
                +getNom()+
                "salaire=" + salaire +
                ", commission=" + commission +
                ", quantite=" + quantite +
                '}';
    }

    public void gains(){
        System.out.println("le salaire est"+getSalaire()
        +getCommission());
    }
}
 class  TravailleurHoraire extends Employee{
    private int retribution,heures;
    public TravailleurHoraire(){}
    public TravailleurHoraire(String nom,String  prenom,int retribution){
        super(nom,prenom);
        this.retribution=retribution;
    }

    public int getRetribution() {
        return retribution;
    }

    public void setRetribution(int retribution) {
        this.retribution = retribution;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" +getNom()+" "
                +getPrenom()+
                "retribution=" + retribution +
                ", heures=" + heures +
                '}';
    }

    @Override
    public void gains() {
        System.out.println("Mr."+getNom()+" "
                +getPrenom()+ " travvaille  "
                +getHeures()+" heures " +
                "et son salaire est "
                +getRetribution());

    }
}
