package TD1.loop;
import java.util.Scanner;
public class EX10 {


        public static void main(String[] args) {
            int n;
            int c,d,u;
            Scanner sc=new Scanner(System.in);
            System.out.println("donnez n de 3 chiffres non null");
            n=sc.nextInt();
            c=n/100;
            d=(n%100)/10;
            u=n%10;
            if (((c*c*c)+(d*d*d)+(u*u*u))==n);
            System.out.println("le nombre "+ n+ " est cubique");
            sc.close();
        }
    }
