package palindrome_validation.controllers;

public class PalindromeController {


    public String showMessage(String word){
        if (verifyPalindrome(word)) {
            return "La palabra "+word+"SÍ es un palíndrmo";
        }
        else {
            return "La palabra "+word+"NO es un palíndrmo";
        }
    }

    private boolean verifyPalindrome(String word){
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
