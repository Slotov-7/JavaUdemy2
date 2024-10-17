package aquives_txt;

import java.io.*;

public class Reader {
    public static void main(String[] args) {
        String path = "G:\\in.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e){
            System.out.println("error: "+ e.getMessage());
        }
    }
}
