package TD1.conditions;
import java.util.Scanner;
public class Ex1 {

        public static void main(String[] args) {
            int a,b,c;
            int max;
            Scanner sc =new Scanner(System.in);
            System.out.println("donnez a et b et c:");
            a= sc.nextInt();
            b= sc.nextInt();
            c= sc.nextInt();
            max=a;
            if(a<b){
                max=b;
            }
            if(max<c){
                max=c;
            }
            System.out.println("le max est"+max);
            // max  =Math.max(a,b);
            //     max =Math.max(max,b);
          //  System.out.println("le max est"+max);
            sc.close();
        }
    }

