package TD1.loop;
import java.util.Scanner;
public class EX5 {
        public static void main(String[] args) {
            int n,UN=0,UN1=1,UN2=1;
            Scanner sc =new Scanner(System.in);
            System.out.println("the n");
            n=sc.nextInt();
            if(n==0 || n==1){
                System.out.println("1");
                return;
            }
            System.out.print("1 1");
            for(int i=2;i<=n;i++){
                UN =(UN1 + UN2);
                UN2=UN1;
                UN1=UN;
                System.out.println(UN);
            }
        }
    }
