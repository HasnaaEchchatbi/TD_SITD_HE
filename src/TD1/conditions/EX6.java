package TD1.conditions;
import java.util.Scanner;
public class EX6 {

        public static void main(String[] args) {
            int A,B;
            Scanner sc=new Scanner(System.in);
            System.out.println("donnez A et B");
            A=sc.nextInt();
            B=sc.nextInt();
            if((A>0 && B>0) || (A<0 && B<0))
                System.out.println("le produit est positif");
            else System.out.println("le produit est negatif");
            sc.close();
        }
    }
