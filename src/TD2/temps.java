package TD2;




class temps {
    private int heures;
    private int minutes;
    private int secondes;

    public temps() {
    }

    public temps(int heures) {
        this();
        this.heures = heures;
    }

    public temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
    }

    public temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    public temps(temps tmp) {
        this(tmp.getHeures(), tmp.getMinutes(), tmp.getSecondes());
        this.heures = tmp.heures;
        this.minutes = tmp.minutes;
        this.secondes = tmp.secondes;
    }

    public int getHeures() {
        return this.heures;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSecondes() {
        return this.secondes;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    public void ajouterheures(int heures) {
        /*this.heures += heures;*/
        this.setHeures(this.getHeures() + heures);
    }

    public void ajouterminutes(int minutes) {
      /*  this.minutes += minutes;*/
        minutes += this.getMinutes();
        this.ajouterheures(minutes / 60);
        this.setMinutes(minutes % 60);
    }

    public void ajoutersecondes(int secondes) {
       /* this.secondes += secondes;*/
        secondes += this.getSecondes();
        this.ajouterheures(secondes / 60);
        this.setMinutes(secondes % 60);
    }

    public String toString() {
        return this.heures + ":" + this.minutes + ":" + this.secondes;
    }

    public static void main(String[] args) {
        temps t1 = new temps();
        temps t2 = new temps(22);
        temps t3 = new temps(22, 4);
        temps t4 = new temps(22, 4, 1);
        temps t5 = new temps(t4);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        t4.ajouterheures(2);
        t4.ajouterminutes(10);
        t4.ajoutersecondes(50);
        System.out.println(t4);
    }
}