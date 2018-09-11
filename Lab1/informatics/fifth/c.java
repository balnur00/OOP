import java.util.Scanner;

public class Main {

    public static int xxor(int a,int b){
        if(a!=b){
            return 1;
        }
        else return 0;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        System.out.print(xxor(a,b));
    }
}