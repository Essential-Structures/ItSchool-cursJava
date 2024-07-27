package session_6_java_core_apis.challenge;

//remove vowels
class Challege4 {//protected not allowed here. Why?

    public static String devowler(String toDevowel) {
        StringBuilder devowelResult = new StringBuilder(toDevowel);
        StringbuilderIterator:
        for (int i = 0; i < toDevowel.length(); i++)
            switch (toDevowel.charAt(i)) {
                case 'a':
                    devowelResult.deleteCharAt(i);
                    continue StringbuilderIterator;
                case 'e':
                    devowelResult.deleteCharAt(i);
                    continue StringbuilderIterator;
                case 'i':
                    devowelResult.deleteCharAt(i);
                    continue StringbuilderIterator;
                case 'o':
                    devowelResult.deleteCharAt(i);
                    continue StringbuilderIterator;
                case 'u':
                    devowelResult.deleteCharAt(i);
            }
        return devowelResult.toString();
    }
}
