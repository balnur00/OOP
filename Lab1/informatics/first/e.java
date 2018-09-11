import java.util.Scanner;
//import java.lang.Math;
 
public class Lab1a {
    public static void main( String args[] )
    {
        Scanner input = new Scanner(System.in);
 
        int v,t;
        int s = 109;
        v = input.nextInt();
        t = input.nextInt();
        int s2 = v*t;
 
        if(v>0) {
            if (s2 >= s) {
                s2 = s2 - s;
            }
        }else{
            s2 = s2 + s;
        }
 
        System.out.println(s2);
    }
}