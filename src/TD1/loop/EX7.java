package TD1.loop;
import java.util.Scanner;
public class EX7 {

        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("donnez n");
            n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println("\n");
            }

            sc.close();
        }
    }
