import java.io.*;
import java.util.Scanner;

public class Main{
    
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("How many Files do you want to read?");
        int size = scanner.nextInt();
//        File[] files = new File[size];
        Tokenizer[] files = new Tokenizer[size];
      
             
        for(int i = 0; i<size;i++){
            System.out.println("Enter the path to your file:\nF:\\JavaProjekte\\abc\\src\\text.txt");
            String temp = scanner2.nextLine();
            files[i] = new Tokenizer(temp);
        }
        for(Tokenizer t: files){
            t.initializeReader();
            t.processInputFile();
            t.finalize();
        }
        
        System.out.println("Enter the path to your output file:\nF:\\JavaProjekte\\abc\\src\\text2.txt");
        String temp = scanner2.nextLine();
//        File output = new File(temp);
          Tokenizer output = new Tokenizer(temp);
          output.initializeWriter();
          output.writeResult(Word.Wordlist);
        
      
    }


}
