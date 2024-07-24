package session_6_java_core_apis.challenge;

//Stringbuilder palindrome

public class Challenge2 {//modifier static not allowed here. why?
    public static String isPalindrome(String string) {
        var sb = new StringBuilder(string);
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
}

}

