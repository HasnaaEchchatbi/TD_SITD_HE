package TD1.tables;
import java.util.Scanner;
public class EX4 {

        public static void main(String[] args) {
            int A[][]=new int [3][3];
            int B[][]=new int[3][3];
            Scanner sc=new Scanner(System.in);
            System.out.println("donnez les valeurs de A");
            for( int i=0;i<A.length;i++){
                for( int j=0;j<A.length;j++){
                    A[i][j]=sc.nextInt();
                }
            }
            System.out.println("donnez les valeurs de B");
            for( int i=0;i<B.length;i++){
                for( int j=0;j<B.length;j++){
                    B[i][j]=sc.nextInt();
                }
            }
            int S[][]=new int [3][3];
            for( int i=0;i<S.length;i++){
                for( int j=0;j<S.length;j++){
                    S[i][j]=A[i][j]+B[i][j];
                }
            }
            System.out.println("la somme est");
            for( int i=0;i<S.length;i++){
                for( int j=0;j<S.length;j++){
                    System.out.print(S[i][j] + "  ");
                }
                System.out.println();
            }}}
