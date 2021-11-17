package SlidingWindowTechnique;

import java.util.HashSet;

public class LengthOfLongestNonRepeatingSunbstring {

    public static void main(String[] args) {

        String s = "abcabacdef";
        int pointer_1 = 0;
        int pointer_2 = 0;
        int finalMax = 0;

        HashSet<Character> hashSet = new HashSet<>();
        while(pointer_2 <s.length()){
            if(!hashSet.contains(s.charAt(pointer_2))){
                hashSet.add(s.charAt(pointer_2));
                finalMax = Math.max(hashSet.size(),finalMax);
                pointer_2++;

            }
            else{
                hashSet.remove(s.charAt(pointer_1));
                pointer_1++;
            }

        }
        System.out.println(finalMax);



    }
}
