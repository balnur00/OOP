import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();

        for(int i=0;i<n;i++){
            if(n==1){
                System.out.print(1);
            }
            else if(Math.pow(2,i)>n){
                System.out.print(i);
                break;
            }
        }
    }
}