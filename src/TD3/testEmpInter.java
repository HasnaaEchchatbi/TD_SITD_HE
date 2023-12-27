package TD3;

public class testEmpInter {
    public static void main(String[] args) {
        PatronI p=new PatronI("Ali","Bennani",10000);
        System.out.println(p.toString());
        p.gains();
        TravailleurCommissionI tc=new TravailleurCommissionI(
                "Taha","benchkroun",10,20000,1000);
        System.out.println(tc.toString());
        tc.gains();
        TravailleurHoraireI th=new TravailleurHoraireI("A","B",2000,36);
        System.out.println(th.toString());
        th.gains();
    }
}
