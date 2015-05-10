import java.util.Arrays;

public class Word implements Comparable<Word> {
    static final int WORDLIST_LENGTH = 1000000;
    static Word[] Wordlist = new Word[WORDLIST_LENGTH];
    public static int pointer = 0;

    private String name;
    private int counter;

    private Word(String name) {
        this.name = name;
        this.counter = 1;

    }


    public static void add(String otherWord) {
        if (pointer == 0) {
            Wordlist[pointer++] = new Word(otherWord.toLowerCase());
        } else {
            for (int i = 0; i < pointer; i++) { // test for bug
                if (Wordlist[i].name.equalsIgnoreCase(otherWord)) {
                    Wordlist[i].counter++;
                    return;
                } 
            }
           
                Wordlist[pointer++] = new Word(otherWord.toLowerCase());
                return;
       
           
          
            
        }
    }

    @Override
    public int compareTo(Word o) {
        return new Integer(o.counter).compareTo(this.counter);
    }

    @Override
    public String toString() {
        return "[word= " + name + " counter= " + counter + "]\n";
    }
   
}
