package TD1.tables;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        String T[]= new String[8];
        String ech;
        Scanner sc =new Scanner(System.in);
        System.out.println("remplir le tableau");
        for(int i=0;i<8;i++) {
            T[i]=sc.nextLine();
        }
        System.out.println("le nov tabl est");
        for (int i=0; i<8; i++) {
            ech=T[0];
            T[0]=T[7];
            T[7]=ech;
            System.out.println(T[i]);
        }
    }
}
