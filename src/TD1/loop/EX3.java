package TD1.loop;
import java.util.Scanner;
public class EX3 {

        public static void main(String[] args) {
            // question 1 et 2
        /*for (int i = 1; i<=20 ; i++){
            System.out.println("Saisir un nombre ");
            N = s.nextInt();
            if(N> max) {
                max = N;
                //QST 2 : la position du maximum
                position = i;
            }
        }*/
        /*   int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("donnez n");
            n=sc.nextInt();
          double b=0;
            int ord = 0;
            while(n !=0){
                int r=n%2;
                double p=Math.pow(10, ord);
                b=b+r*p;
                ord=ord+1;
                n=n/2;
            }
            System.out.println(b);
        }*/
    int n,max=Integer.MIN_VALUE;
    int pos=0;
    int i=0;
    Scanner sc =new Scanner(System.in);
            do{
        System.out.println("donnez le nombre ");
        n=sc.nextInt();
        if(i==0)max=n;
        else {
            if(n>max){
                max=n;
                pos=i;
            }
        }
        i++;
       }while(n!=0);
        System.out.println("le plus grand nombre est"+max);
        System.out.println("la position de ce nombre est"+pos);


}}

