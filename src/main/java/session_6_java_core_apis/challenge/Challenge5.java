package session_6_java_core_apis.challenge;

import java.util.Locale;

//word capitalizer
public class Challenge5 {
    protected static String wordCapitalizer (String wordsToCapitalize){
       StringBuilder toCapitalize=new StringBuilder(wordsToCapitalize);
       for(short i=1; i< toCapitalize.length();i++)
          if (toCapitalize.charAt(i-1)==' ') toCapitalize.substring(i,i+1).toUpperCase();

       return toCapitalize.toString();

    }
}
