import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int h=s.nextInt();

        if(b>0 && h>0){
            System.out.print(h*b);
        }else{
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }
}