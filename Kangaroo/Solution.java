import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean answer = false;
        if (x1 == x2 && v1 == v2) {
                answer =true;
            }
            else if (x1 == x2 && v1 > v2) {
                answer =false;
            }
            else if (x1 <= x2 && v1 <= v2) {
                answer =false;
            }
            else {
            if ((x2 - x1) % (v1 - v2) == 0) {
            answer =true;
            }
            else {
            answer =false;
            }
        }
        return answer ? "YES" : "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
