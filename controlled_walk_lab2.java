import java.util.Scanner;
public class controlled_walk_lab2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Number of Steps: ");
        int steps= sc.nextInt();
        int[][] hurdles={{0,1},{2,2},{3,3},{4,4},{3,4}};
       int x=0;
        int y=0;
        System.out.println("press 1 for north");
        System.out.println("press 2 for south");
        System.out.println("press 3 for east");
        System.out.println("press 4 for west");
        for (int i=0;i<=steps;i++){
            int b= sc.nextInt();
            if (b==1){
                y++;
                for (int j=0;j<5;j++){
                    if (hurdles[j][0]==x && hurdles[j][1]==y){
                        y--;
                    }
                }
            }
            if (b==2) {
                y--;
                for (int j=0;j<5;j++){
                    if (hurdles[j][0]==x && hurdles[j][1]==y){
                        y++;
                    }
                }

            } if (b==3) {

                x++;
                for (int j=0;j<5;j++){
                    if (hurdles[j][0]==x && hurdles[j][1]==y){
                        x--;
                    }
                }

            }
            if( b==4){

                x--;
                for (int j=0;j<5;j++){
                    if (hurdles[j][0]==x && hurdles[j][1]==y){
                        x++;
                    }
                }
            }
            System.out.printf("Current Position:(%d,%d)\n",x,y);
           // double euclidean=Math.sqrt((x*x)+(y*y));
           // System.out.println("euclidean distance:"+euclidean);
        }
    }
}

