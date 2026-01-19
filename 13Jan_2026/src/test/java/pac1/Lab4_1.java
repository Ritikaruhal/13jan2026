package pac1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab4_1 {

    public static void main(String[] args) throws IOException {

        String file = "C:\\Users\\Ritika.Ruhal\\git\\13jan2026\\13Jan_2026\\src\\test\\java\\pac1\\sampleinput.txt";

        
        FileReader fr = new FileReader(file);
        String data = "";
        int ch;

        while ((ch = fr.read()) != -1) {
            data = data + (char) ch;
        }
        fr.close();

        
        String reversed = new StringBuilder(data).reverse().toString();

        
        FileWriter fw = new FileWriter(file);
        fw.write(reversed);
        fw.close();

        System.out.println("File reversed successfully");
    }
}
