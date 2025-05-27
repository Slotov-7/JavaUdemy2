package map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramExercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        Map<String, Integer> votes = new LinkedHashMap<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                if (votes.containsKey(fields[0])) {
                    int antValue = votes.get(fields[0]);
                    int value = Integer.parseInt(fields[1]);
                    votes.put(fields[0], value + antValue);
                }else{
                    votes.put(fields[0], Integer.parseInt(fields[1]));
                }

                line = bufferedReader.readLine();
            }

        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        for(String candidato : votes.keySet()) {
            int votos = votes.get(candidato);
            System.out.println(candidato + ": " + votos);
        }
        sc.close();
    }
}
