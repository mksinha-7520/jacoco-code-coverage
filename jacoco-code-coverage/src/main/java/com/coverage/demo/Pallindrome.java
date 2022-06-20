package com.coverage.demo;

public class Pallindrome {

    public boolean isPalindrome(String inputString) {

        String reverseStr = "";

        int strLength = inputString.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + inputString.charAt(i);
        }

        if (inputString.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(inputString + " is a Palindrome String.");
            return true;
        }
        else {
            System.out.println(inputString + " is not a Palindrome String.");
            return false;
        }



    }


}
