import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static String hackerrankInString(String s) {
        String target = "hackerrank";
        return isHackerrank(s, target, 0) ? "YES" : "NO";
    }

    private static boolean isHackerrank(String s, String target, int index) {
        if (index == target.length()) {
            return true;
        }
    
        if (s.length() == 0) {
            return false;
        }
        
        if (s.charAt(0) == target.charAt(index)) {
            // If they match, continue checking the next character in 'target'
            return isHackerrank(s.substring(1), target, index + 1);
        } else {
            // If they don't match, continue checking the next character in 's'
            return isHackerrank(s.substring(1), target, index);
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
