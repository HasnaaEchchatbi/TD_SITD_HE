package TD1.loop;
import java.util.Scanner;
public class EX4 {
        public static void main(String[] args) {
            int a,b,r,p;
            Scanner sc =new Scanner(System.in );
            System.out.println("donnez a et b");
            a=sc.nextInt();
            b=sc.nextInt();
            //   r=a%b;
            //   while(r!=0){
            //     a=b;
            //     b=r;
            //     r=a%b;
            //   }
            for(int i=1;i<Math.min(a,b);i++)
            {
                if((a%i)==0 &&   (b%i)==0)
                    p=i;
            }
            System.out.println("le pgcd est "+b);
            sc.close();
        }
    }
