package txt_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String[] lines = new String[]{"guilherme", "jorge" , "henrique", "santos"};
        String path = "G:\\in.txt";

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            for(String line: lines){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
