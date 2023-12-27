package TD1.conditions;
import java.util.Scanner;
public class EX9 {

        public static void main(String[] args) {
            int x,y;
            Scanner sc =new Scanner(System.in);
            System.out.println("donnez x et y");
            x=sc.nextInt();
            y=sc.nextInt();
            if(x>y){
                System.out.println("l ordre croissant est "+ y +" "+ x);

            }
            else {
                System.out.println("l ordre croissant est "+ x +" "+ y);
            }

            sc.close();
        }
    }
