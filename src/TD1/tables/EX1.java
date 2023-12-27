package TD1.tables;
import java.util.Scanner;
public class EX1 {


        public static void main(String[] args) {
            int T[]=new int[10];
            Scanner sc=new Scanner(System.in);

            System.out.println("entrez les valeurs");
            for(int i=0;i<T.length;i++){
                T[i]=sc.nextInt();
            }
            int max=T[0];
            int min=T[0];
            for(int i=1;i<T.length;i++){
                if(T[i]<min)
                    min=T[i];
                if(T[i]>max)
                    max=T[i];
            }
            System.out.println("le max est"+max);
            System.out.println("le min est"+min);

        }
    }
