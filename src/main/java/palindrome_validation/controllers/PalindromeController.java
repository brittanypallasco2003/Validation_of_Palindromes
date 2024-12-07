package palindrome_validation.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to verify palindromes
 */
@RestController
public class PalindromeController {

    /**
     * Endpoint to verify whether a word is a palindrome or not
     * @param word - The word to verify
     * @return A message indicating whether a word is a palindrome or not
     */
    @GetMapping("/verify-palindrome/{word}")
    public String showMessage(@PathVariable String word) {
        if (verifyPalindrome(word)) {
            return "La palabra " + word + " SÍ es un palíndrmo";
        } else {
            return "La palabra " + word + " NO es un palíndrmo";
        }
    }

    /**
     * Method to verify whether a word is a palindrome or not
     * @param word
     * @return true if the word is a palindrome, false otherwise
     */
    private boolean verifyPalindrome(String word) {
        int i = 0, j;
        j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
