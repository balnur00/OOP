import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here]
        Scanner s=new Scanner(System.in);
        String ss=s.nextLine();
        String []parts=ss.split("");
        int cnt=0;

        for(int i = 0;i<parts.length/2;i++){
            if(parts[i].equals(parts[parts.length-1-i])){
                cnt++;
            }else{
                continue;
            }
        }
        //System.out.println(cnt);
        if(cnt==parts.length/2){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }

    }
}