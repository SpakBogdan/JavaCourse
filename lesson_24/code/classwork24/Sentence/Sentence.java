package classwork24.Sentence;

public class Sentence {

    // count words
    public int countWords(String str){
        String[] words = toString().split(" ");
        return words.length;
    }

    // count symbols
    public int countSymbols(String str) {
        String[] letters = str.split("");
        return letters.length;
    }
}
