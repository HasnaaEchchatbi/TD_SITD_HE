package TD1.loop;
import java.util.Scanner;
public class EX2 {

        public static void main(String[] args) {
            int n;
            int s=0;
            Scanner sc =new Scanner (System.in);
            System.out.println("donnez n");
            n=sc.nextInt();
            for(int i=0;i<n;i++){
                if(i%2 !=0)
                    s +=i;
            }
            System.out.println("la somme des nb impairs inferieurs a n est "+s);

            sc.close();
        }

}
