package TD2;




class banque {
    String cin;
    int ncompte;
    float solde;
    float somme;

    public banque(int ncompte, float solde, String cin) {
        this.cin = cin;
        this.ncompte = ncompte;
        this.solde = solde;
    }

    public void deposer(float somme) {
        this.solde += somme;
    }

    public void retirer(float somme) {
        this.solde -= somme;
    }

    public float avoirsolde() {
        return this.solde;
    }

    public String avoirinf() {
        return "les infos sont: " + this.ncompte + "," + this.solde + "," + this.cin;
    }
    public static void main(String[] args) {
        banque banque1 = new banque(1, 5000.75F, "AB 1200");
        System.out.println(banque1.avoirinf());
        System.out.println(banque1.avoirsolde());
        banque1.deposer(500.0F);
        System.out.println(banque1.avoirinf());
        System.out.println(banque1.avoirsolde());
        banque1.retirer(200.0F);
        System.out.println(banque1.avoirinf());
        System.out.println(banque1.avoirsolde());
    }
}