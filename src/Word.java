import java.util.Arrays;

public class Word implements Comparable<Word> {
    static final int WORDLIST_LENGTH = 1000000;
    static Word[] Wordlist = new Word[WORDLIST_LENGTH];
    static int pointer = 0;

    private String name;
    public int counter;

    private Word(String name) {
        this.name = name;
        this.counter = 1;

    }

    public static void main(String[] args) {
        add("Ali");
        add("fritz");
        for(int i=0;i<100;i++){
            add("Andre");
        }
        for (int i = 0; i < pointer; i++) {
            System.out.println(Wordlist[i]);
        }

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
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "[word= " + name + " counter= " + counter + "]";
    }
}
