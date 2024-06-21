package kata.session_2;

public class SentenceWordsCounter {

    public static void main(String[] args) {
        String sentence = "I like to eat apples";
        //we need a sentence
        //check where the spaces are
        //check length of the sentence
        //use for enhanced and check every character - count empty space

        int numberOfWords = numberOfWords(sentence);
        System.out.println("Number of words: " + numberOfWords);
    }

    public static int numberOfWords(String sentence) {
        String[] sentenceArray = sentence.split(" ");

        return sentenceArray.length;
    }
}