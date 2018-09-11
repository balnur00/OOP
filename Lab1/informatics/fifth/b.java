import java.util.Scanner;

public class Main {
    public static  double  funcpow(double a,int b){
        double powres=1;
        if(b==0){
            return 1;
        }else if(b<0) {
            for(int i=0;i<b;i++){
                powres/=a;
            }
            return powres;
        }
        else {
            for (int i = 0; i < b; i++) {
                powres *= a;
            }
            return powres;
        }
    }
    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        double  a=s.nextInt();
        int b=s.nextInt();

        System.out.print(funcpow(a,b));

    }
}