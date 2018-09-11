import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        double b=s.nextDouble();
        String c=s.next();
        System.out.print(c+"\n");
        System.out.print(b+"\n");
        System.out.print(a);
    }
}