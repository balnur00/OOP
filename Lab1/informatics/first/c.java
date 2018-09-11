import java.util.Scanner;
//import java.lang.Math;
 
public class Lab1a {
    public static void main( String args[] )
    {
        Scanner input = new Scanner(System.in);
 
        int n;
        int k;
        int res, m;
 
        n = input.nextInt();
        k = input.nextInt();
        m = k%n;
        res = (k-m)/n;
 
 
        System.out.println(res);
    }
}