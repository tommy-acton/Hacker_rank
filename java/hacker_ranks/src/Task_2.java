import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Task_2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        boolean withinrange = false;
        String answer = "Weird";

        if (N > 0 || N <=100){
            withinrange = true;
        }

        if (withinrange){
            if (N % 2 != 0){
                System.out.println(answer);
            }
            else if ((N % 2 == 0) && (N >= 2 && N <= 5)){
                System.out.println("Not " + answer);
            }
            else if ((N % 2 == 0) && ((N >= 6) && (N <= 20))){
                System.out.println(answer);
            }
            else if ((N % 2 == 0) && (N > 20)){
                System.out.println("Not " + answer);
            }
        }

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    }
}
