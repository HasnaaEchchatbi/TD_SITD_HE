package TD1.conditions;
import java.util.Scanner;
public class EX5 {

        public static void main(String[] args) {
            int h ;
           String langue;
            Scanner sc=new Scanner(System.in);

            System.out.println("donnez l heure entre 1 et 24");
            h=sc.nextInt();
            System.out.println("F:pour afficher le message en francais entrez ");
            System.out.println("A: pour afficher le message en anglais entrez ");

            langue=sc.nextLine();
            switch (langue){
                case "F":
                    if ((0<h)&&(h<18)){
                        System.out.println("bonjour");
                    }
                    else  if((18<=h)&&(h<=22)){
                        System.out.println("bonsoir");
                    }
                    else
                        System.out.println("bonne nuit");

                    break;
                case "A":
                    if ((0<h)&&(h<18)){
                        System.out.println("G.M");
                    }
                    else if((18<=h)&&(h<=22)){
                        System.out.println("G.E");
                    }
                    else
                        System.out.println("G.N");

            }

        }
    }


