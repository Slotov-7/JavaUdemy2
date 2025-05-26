package comparable_test.application;

import comparable_test.entities.Employee;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaComparable {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        String path = "E:\\raios do sol\\JavaUdemy2\\src\\comparable_test\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv= br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee employee : list) {
                System.out.println(employee.getName() + ", " + employee.getSalary());
            }

        }catch (IIOException e){
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
