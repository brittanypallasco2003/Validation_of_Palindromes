package palindrome_validation.controllers;

public class PalindromeController {

    public void verifyPalindrome(){
        String word="hola";
        int i=0,j;
        boolean isPalindrome=true;
        j=word.length()-1;
        while (i==j){
            if (word.charAt(i)!=word.charAt(j)){
                isPalindrome=false;
                break;
            }
            i++;
            j--;
        }
    }

}
