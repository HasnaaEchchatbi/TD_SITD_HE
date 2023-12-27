package TD1.loop;
import java.util.Scanner;
public class EX9 {

        public static void main(String[] args) {
            int n;
            int s=0,q;
            Scanner sc=new Scanner(System.in);
            System.out.println("donnez n positif contient plus de 2 chiffres");
            n= sc.nextInt();
            q=n;
            while(q>0){
                s=s+(q%10);
                q=q/10;
            }
            System.out.println("la somme des chiffres de votre nombre est" + s);

            sc.close();

        }
    }
