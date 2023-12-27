package TD1.tables;
import java.util.Scanner;
public class EX2 {



        public static void main(String[] args) {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("donnez n");
            n=sc.nextInt();
            double b=0;
            double O=0;
            while(n !=0){
                int r=n%2;
                double p=Math.pow(10,O);
                b=b+r*p;
                O=O+1;
                n=n/2;
            }
            System.out.println(b);
        }}
