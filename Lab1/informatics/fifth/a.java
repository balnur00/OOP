import java.util.Scanner;

public class Main {

    public static int funcmin(int a,int b,int c,int d){
        int mmin1=Math.min(a,b);
        int mmin2=Math.min(c,d);
        return Math.min(mmin1,mmin2);
    }
    public static void main(String[] args) {
	// write your code hereS
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();

        System.out.print(funcmin(a,b,c,d));
    }
}