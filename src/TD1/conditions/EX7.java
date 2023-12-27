package TD1.conditions;
import java.util.Scanner;
public class EX7 {
        public static void main(String[] args) {
            int n;
            int c,d,u;
            Scanner sc=new Scanner(System.in);
            System.out.println("donnez n de 3 chiffres non null");
            n=sc.nextInt();
            c=n/100;
            d=(n % 100)/10;
            u=n%10;
            System.out.println("les combinaisons sont :");
            System.out.println(u*100+c*10+d);
            System.out.println(u*100+d*10+c);
            System.out.println(d*100+c*10+u);
            System.out.println(d*100+u*10+c);
            System.out.println(c*100+u*10+d);
            sc.close();
        }
    }
