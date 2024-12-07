package palindrome_validation.controllers;

public class PalindromeController {



    public boolean verifyPalindrome(String word){
        int i=0,j;
        j=word.length()-1;
        while (i<j){
            if (word.charAt(i)!=word.charAt(j)){
                return  false;
            }
            i++;
            j--;
        }
    return true;
    }



}
