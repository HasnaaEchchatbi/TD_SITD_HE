package TD1.loop;

public class EX6 {

        public static void main(String[] args) {
            int i,j,k;
            int total = 15;
            for(i=1;i<=9;i++){
                for(j=1;j<=9;j++){
                    for(k=1;k<=9;k++){

                        if(i + j + k == total) {
                            System.out.println(i + " + " + j + " + " + k +" = " + total);
                        }

                    }
                }



            }
        }
    }
