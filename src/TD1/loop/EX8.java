package TD1.loop;
import java.util.Scanner;
public class EX8 {



        public static void main(String[] args) {
            int n;
            Scanner sc =new Scanner(System.in);
            System.out.println("donnez n");
            n=sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("\n");

            }
            for(int i=n-1;i>0;i--){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println("\n");

            }
        }
    }