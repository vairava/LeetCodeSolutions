import java.util.HashSet;
import java.util.Set;


/**
 * This is the simplest solution and easy to understand
 */

public class LongestSubstringInAString {

    public static void main(String[] args) {

        String str = "abcdacefghijkl";
        char[] strAray = str.toCharArray();

        Set<Character> charSet = new HashSet<>();

        String totalMaxString = getLongestNonRepeatingSubstring(strAray, charSet);

        System.out.println(totalMaxString);


    }

    private static String getLongestNonRepeatingSubstring(char[] strAray, Set<Character> charSet) {
        String currentMaxString ="";
        String totalMaxString = "";

        for(int i=0;i<strAray.length;i++){

            if(charSet.contains(strAray[i])){

                currentMaxString = "";
                charSet.clear();
            }

            charSet.add(strAray[i]);
            currentMaxString+= strAray[i];

            if(currentMaxString.length() > totalMaxString.length()){
                totalMaxString = currentMaxString;
            }

        }
        return totalMaxString;
    }
}
