import java.util.*;
public class O1Gangetabell {
    public static void main(String[] args) {
        int start;
        int slutt;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Start: ");
            start = in.nextInt();
            System.out.println("Slutt: ");
            slutt = in.nextInt();
            
        }
        while(start<0 || slutt<0 || start>slutt);
        

        for(int i=start;i<=slutt;i++){
            System.out.println(i + "-gangen:");
            for(int j=1;j<=10;j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
        }
        in.close();
    }
  }