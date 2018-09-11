import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int k =s.nextInt();
        int cnt=0;
        while(k>0){
            cnt+=k%2;
            k/=2;
        }
        if(cnt==1){
            System.out.print("YES");
        }else System.out.print("NO");
    }
}