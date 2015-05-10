import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Tokenizer extends IO_Class {

    public Tokenizer(String filename) {
        super(filename);
    }

    public void processInputFile() {

        try {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                String[] tokenized = tokenize(sCurrentLine);
                for (String s : tokenized) {
                    Word.add(s);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String[] tokenize(String s) {
        String[] tokenized = s.split(":");
        String temp = "";
        for (int i = 2; i < tokenized.length; i++) {
            temp += tokenized[i];
        }
        return temp.split(" ");
    }
    public void writeResult(Word[] words) throws IOException{
        try{
            Word[] shortened = new Word[Word.pointer];
            for(int i=0;i<Word.pointer;i++){
                shortened[i]=words[i];
            }
            Arrays.sort(shortened);
            
        for(int i = 0; i<Word.pointer;i++){
            bw.write(shortened[i].toString());
        }
        }catch(IOException e){
            System.out.println("Error");
        }
        
    }
}
