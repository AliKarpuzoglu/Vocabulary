
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO_Class {
    String         Filename;
    BufferedReader br;
    BufferedWriter bw;
    
    
    public IO_Class(String filename) {
        
        Filename = filename;
    }
    public void initializeReader() {
        try {
            this.br = new BufferedReader(new FileReader(Filename));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
    public void initializeWriter(){
        FileWriter filewr;
        File file = new File(Filename);
        
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            filewr = new FileWriter(Filename);
            this.bw = new BufferedWriter(filewr);
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    }
        
        
    public void finalize(){
        try{
        this.br.close();
            }catch(IOException e){
                System.out.println( "Warning exception in finalize");
            }
        }
    public void finalizeWriter(){
        try{
        this.bw.close();
            }catch(IOException e){
                System.out.println( "Warning exception in finalize");
            }
        }
}
