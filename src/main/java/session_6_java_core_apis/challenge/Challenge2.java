package session_6_java_core_apis.challenge;

//Stringbuilder palindrome

import java.util.Locale;

public class Challenge2 {//modifier static not allowed here. why?


    protected static boolean isPalindrome(String string) {
        boolean isPalindrome = true;
        StringBuilder reversed = new StringBuilder(string).reverse();

        for (int i = 0; i < reversed.length(); i++) {
            if (string.charAt(i) != reversed.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }   //??? unde gresesc de imi da mereu true? Nu vreau sa fac cu for descendent

        return isPalindrome;
    }
}
/*vreau sa iterez prin sirul de caractere, folosind charAt(), simultan prin .this si this.reverse().
        if (sb.equals(sb.reverse())) return "E palindrom";
        else return ("Nu e: " + sb.reverse());
    }

    @Override
    public boolean equals(Object obj) {
        boolean checker = true;
        var sbCompare = new StringBuilder(String.valueOf(obj));
        MIRRORCHECKER:
        for (int i = 0; i < sbCompare.length(); i++)
            if (sbCompare.charAt(i) != (StringBuilder)this.charAt(i)) {
            checker = false;
            break;
        }
            return checker;
} */



