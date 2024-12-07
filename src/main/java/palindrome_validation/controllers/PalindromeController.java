package palindrome_validation.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeController {


    @GetMapping("/verify-palindrome/{word}")
    public String showMessage(@PathVariable String word){
        if (verifyPalindrome(word)) {
            return "La palabra "+word+" SÍ es un palíndrmo";
        }
        else {
            return "La palabra "+word+" NO es un palíndrmo";
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
