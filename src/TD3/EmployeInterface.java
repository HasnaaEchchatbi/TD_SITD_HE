package TD3;

public interface EmployeInterface {
    String toString();
    void gains();
}
class PatronI implements EmployeInterface{
    private double salaire;
    private String nom,prenom;
    public PatronI(){}
    public PatronI (String nom,String prenom,double salaire){
        this.nom=nom;
        this.prenom=prenom;
        this.salaire=salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

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

    public void gains(){
        System.out.println(getSalaire());
    }

    @Override
    public String toString() {
        return "Patron{" +
                "salaire=" + salaire +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
class TravailleurCommissionI implements EmployeInterface{
   private double salaire,commission;
   private int quantite;
   private String nom,prenom;
   public TravailleurCommissionI(){}
    public TravailleurCommissionI(String nom,String prenom,int quantite,double salaire,double commission){
        this.nom=nom;
        this.prenom=prenom;
        this.salaire=salaire;
        this.commission=commission;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
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

    @Override
    public void gains() {
        System.out.println("le salaire"+getSalaire());
    }

    @Override
    public String toString() {
        return "TravailleurCommissionI{" +
                "salaire=" + salaire +
                ", commission=" + commission +
                ", quantite=" + quantite +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

}
class TravailleurHoraireI implements EmployeInterface{
    private int retribution , heures;
    private String nom,prenom ;
    public TravailleurHoraireI(){}
    public TravailleurHoraireI(String nom, String prenom,int retribution,int heures){
        this.nom=nom;
        this.prenom=prenom;
        this.retribution = retribution;
        this.heures=heures;
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

    @Override
    public String toString() {
        return "TravailleurHoraireI{" +
                "retribution=" + retribution +
                ", heures=" + heures +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public void gains() {
        System.out.println("le salaire de Mr."+getNom()+" "+getPrenom()+
                " est "+getRetribution());
    }
}
