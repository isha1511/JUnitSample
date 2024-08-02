package org.example;

public class StringDemo {

    public String reverse(String input){

        if(input == null){

            throw new IllegalArgumentException("Input cannot be null");
        }

        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input){

        if(input == null){

            throw new IllegalArgumentException("Input cannot be null");
        }

        String reversed= reverse(input);

        return reversed.equals(input);
    }
}
