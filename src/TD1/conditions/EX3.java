package TD1.conditions;
import java.util.Scanner;
public class EX3 {
        public static void main(String[] args) {
            int a,b;
            int choix;
            Scanner sc = new Scanner(System.in);
            System.out.println("donnez a et b");
            a=sc.nextInt();
            b=sc.nextInt();

            System.out.println("pour savoir si la somme a+b est paire entrez 1");
            System.out.println("pour savoir si le produit  ab est paire entrez 2");
            System.out.println("pour connaitre le signe de  la somme a+b  entrez 3");
            System.out.println("pour connaitre le signe du produit a+b  entrez 4");
            System.out.println("donnez votre choix");
            choix=sc.nextInt();
            switch(choix){
                case 1:
                    if((a+b)%2==0)
                        System.out.println("la somme est paire");
                    else System.out.println("la somme est impair");
                    break;
                case 2:
                    if((a*b)%2==0)
                        System.out.println("le produit est pair");
                    else System.out.println("le produit est impair");
                    break;
                case 3:
                    if((a+b)>=0) System.out.println("la somme est positive");
                    else System.out.println("la somme est negative");
                    break;
                case 4:
                    if((a*b)>=0) System.out.println("le produit est positif");
                    else System.out.println("le produit est negatif");
                    break;
                default:
                    break;
            }
            sc.close();
        }
    }

