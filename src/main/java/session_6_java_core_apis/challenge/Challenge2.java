package main.java.session_6_java_core_apis.challenge;

//Stringbuilder palindrome

public class Challenge2 {//modifier static not allowed here. why?
    static boolean isPalindrome = true;

    public static boolean isPalindrome(String string) {
        StringBuilder sb = new StringBuilder(string);
        StringBuilder reverse = sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != reverse.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }               //??? unde gresesc de imi da mereu true?

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



