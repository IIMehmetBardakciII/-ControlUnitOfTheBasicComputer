import java.io.BufferedReader;
import java.io.FileReader;

public class RAM {

    private String[] word = new String[16];

    public RAM() {
        readFile();
    }

    private void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("RAM.txt"));
            String line;
            int counter =0;
            while ((line = reader.readLine()) != null && counter<16) {
                word[counter]=line;
                counter++;
            }
            reader.close();
            System.out.println("RAM.txt dosyası okundu.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String[] getWord() {
        return word;
    }

   

}