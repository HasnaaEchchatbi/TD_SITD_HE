package TD1.conditions;
import java.util.Scanner;
public class EX4 {

        public static void main(String[] args) {
            int M;
            Scanner sc = new Scanner(System.in);
            System.out.println("saisissez votre moyenne:");
            M= sc.nextInt();
            if (M>=16){
                System.out.println("T.Bien");
            }


            else if (M>=14){
                System.out.println("Bien");
            }
            else if (M>=12){
                System.out.println("A.Bien");
            }
            else if (M>=10) {
                System.out.println("Passable");
            }
            else System.out.println("NV");
            sc.close();
        }

    }




