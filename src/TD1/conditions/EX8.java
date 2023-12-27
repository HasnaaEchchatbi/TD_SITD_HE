package TD1.conditions;
import java.util.Scanner;
public class EX8 {

        public static void main(String[] args) {
            int annee;
            int mois;
            Scanner sc =new Scanner(System.in);
            System.out.println("saisissez le numero du mois ");
            mois=sc.nextInt();
            switch (mois){
                case 1:
                    System.out.println("le nombre de jours est 31");
                    break;
                case 2:
                    System.out.println("donnez l annee comprise entre 1900 et 2100");
                    annee=sc.nextInt();
                    if((annee %4==0) && (annee%100 !=0)||(annee %400==0))
                    { System.out.println("le nombre de jours est 29");}
                    else{System.out.println("le nombre de jours est 28");};
                    break;
                case 3:
                    System.out.println("le nombre de jours est 31");
                    break;
                case 4:
                    System.out.println("le nombre de jours est 30");
                    break;
                case 5:
                    System.out.println("le nombre de jours est 31");
                    break;
                case 6:
                    System.out.println("le nombre de jours est 30");
                    break;
                case 7:
                    System.out.println("le nombre de jours est 31");
                    break;
                case 8:
                    System.out.println("le nombre de jours est 30");
                    break;
                case 9:
                    System.out.println("le nombre de jours est 31");
                    break;
                case 10:
                    System.out.println("le nombre de jours est 30");
                    break;
                case 11:
                    System.out.println("le nombre de jours est 31");
                    break;
                case 12:
                    System.out.println("le nombre de jours est 30");
                    break;

            }
            sc.close();
        }
    }

