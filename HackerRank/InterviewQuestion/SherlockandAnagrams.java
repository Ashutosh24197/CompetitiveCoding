/* problem  https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps  */

/* solution  */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static boolean checkAnagram(String s1,String s2){
        boolean ans=true;
        HashMap<Character,Integer> m= new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            if(m.containsKey(s1.charAt(i))){
                int t= m.get(s1.charAt(i));
                m.put(s1.charAt(i),t+1);
            }else{
                m.put(s1.charAt(i),1);
            }
        }

        for(int i=0;i<s2.length();i++){
            if(m.containsKey(s2.charAt(i)) && m.get(s2.charAt(i))>=1){
                int t= m.get(s2.charAt(i));
                m.put(s2.charAt(i),t-1);
            }else{
               ans = false;
               break;
            }
        }
        return ans;
    }

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
      int count=0;
      for(int l=1;l<s.length();l++){
          for(int i=0;i<s.length()-l;i++){
              String s1=s.substring(i,i+l);
              for(int j=i+1;j<=s.length()-l;j++){
                  String s2=s.substring(j,j+l);
                  if(checkAnagram(s1,s2)){
                      count++;
                  }
              }
          }
      }

      return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
