package com.genaro.LeetCode;

public class RemovePalindromicSubsequences {

    public static int removePalindromeSub(String s) {
        //check if the string is empty
        if (s.equals("")) {
            return 0; //no steps
        }

        //check if the string is already a palindrome
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        //System.out.println(sb);
        if (s.equals(sb.toString())) {
            return 1; //only takes one step to empty the string
        }

        //else just return
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(removePalindromeSub("baabb"));
    }
}
