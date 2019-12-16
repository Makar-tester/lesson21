import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) throws IOException {
        PrintWriter pw;
        FileInputStream fis = new FileInputStream("input.txt");
        Scanner sc = new Scanner(fis);

        int arrSize = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>(arrSize);
        ArrayList<Integer> twice = new ArrayList<>();
        ArrayList<Integer> notTwice = new ArrayList<>();
        for (int j = 0; j < arrSize; j++) {
            int first = sc.nextInt();
            if (first % 2 == 0) {
                twice.add(first);
            }
            if (first % 2 == 1) {
                notTwice.add(first);
            }
        }
        pw = new PrintWriter("output.txt");
        if (twice.size() >= notTwice.size()) {
            pw.println(notTwice);
            pw.println(twice);
            pw.println("YES");
        } else {
            pw.println(notTwice);
            pw.println(twice);
            pw.println("NO");
        }
        pw.close();


    }


}
