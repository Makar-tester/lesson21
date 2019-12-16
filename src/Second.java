import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw;
        Scanner sc;
        sc = new Scanner("input.txt");
        int a=sc.nextInt();
        pw=new PrintWriter("output.txt");
        pw.print((0+a)*a/2);
        /*Sn = (a1+an)*n/2*/
        pw.close();
    }
}
