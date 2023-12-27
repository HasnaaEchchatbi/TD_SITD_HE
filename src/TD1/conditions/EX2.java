package TD1.conditions;
import java.util.Scanner;
public class EX2 {
        public static void main(String[] args) {
            System.out.println(Math.class);
            float a,b,c,x1,x2;
            float D;
            Scanner sc = new Scanner(System.in);
            System.out.println("donnez a et b et c pour resoudre votre equation");
            a=sc.nextFloat();
            b=sc.nextFloat();
            c=sc.nextFloat();
            if (a==0){
                if(b==0){
                    if(c==0){System.out.println("tt x est solution ");}
                    else {System.out.println("solution ensemble vide");}}
                else {System.out.println("une seule racine reelle x:"+ (-c/b));}}
            else {  D=(b*b)-(4*a*c);
                if(D==0){
                    System.out.println("l equation a une seule racine double x1=x2:"+((-b)/(2*a)));
                }
                if (D>0){
                    System.out.println("l equation a 2 racines reelles x1:"+((-b-(Math.sqrt(D)))/(2*a))+"et x2:"+((-b+(Math.sqrt(D)))/(2*a)));
                }
                if (D<0){
                    System.out.println("l equation a 2 racines immaginaires x1:"+(-b/2*a)+"+i"+ ((Math.sqrt(Math.abs(D)))/2*a)+" et x2:"+(-b/2*a)+"-i"+ ((Math.sqrt(Math.abs(D)))/2*a));
                }

            }
            sc.close();
        }
    }

