package TD1.tables;

import java.util.Scanner;


public class EX3 {

        public static void main(String[] args) {
            int T[]=new int[10];
            int n,cmp=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("donnez les moyennes des etudiants");
            for( int i=0;i<T.length;i++){
                T[i]=sc.nextInt();
            }
            System.out.println("donnez le sueil n");
            n=sc.nextInt();
            for(int i=0;i<T.length;i++){
                if(T[i]>=n)
                    cmp++;
            }
            System.out.println("le nb d'etudiant " +cmp);
        }
    }