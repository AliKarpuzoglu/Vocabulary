import java.io.*;
import java.util.Scanner;

public class VocabularyTokenizer extends IO_Class {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("How many Files do you want to read?");
        int size = scanner.nextInt();
//        String[] paths = new String[size];
        File[] files = new File[size];

      
             
        for(int i = 0; i<size;i++){
            System.out.println("Enter the path to your file:\nF:\\JavaProjekte\\abc\\src\\text.txt");
            String temp = scanner2.nextLine();
            files[i] = new File(temp);
        }
        
        System.out.println("Enter the path to your output file:\nF:\\JavaProjekte\\abc\\src\\text2.txt");
        String temp = scanner2.nextLine();
        File output = new File(temp);
        
        
        for(int j = 0; j<size;j++){
        try { 
            
            Scanner sc = new Scanner(files[j]);
     
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                // TOKENIZE
            } 
            sc.close();
        }  
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        } 
        
    }
    
//        String[] result = "Ali Ali".split("\\s");
//        for (int x=0; x<result.length; x++)
//            System.out.println(result[x]);
//    }

}
