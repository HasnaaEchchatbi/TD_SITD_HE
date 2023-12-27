package TD1.loop;
import java.util.Scanner;
public class EX1 {
        public static void main(String[] args) {
            int n,f=1,s=0;
            Scanner sc=new Scanner (System.in);
            System.out.println("donnez n >0");
            n=sc.nextInt();
            for (int i=1;i<=n;i++){
                f*=i;
                if(i%2 !=0){
                    s+=i;
                }

            }
            System.out.println("la somme est "+s);
            System.out.println("le factoriel de n est "+f);
            sc.close();
        }
    }