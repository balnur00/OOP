import java.util.Scanner;
import java.lang.Math;
 
 
public class Lab1b {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        //c = input.nextInt();
        //d = input.nextInt();
 
        for(int i = a; i <= b; i++){
            double k = Math.floor(Math.sqrt(i));
            int f = (int)Math.round(k);
            if(i * i == f){
                System.out.println(i);
                //System.out.println("hello");
 
            }
        }
    }
}
 