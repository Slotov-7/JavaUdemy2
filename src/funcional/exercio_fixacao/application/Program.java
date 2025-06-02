package funcional.exercio_fixacao.application;

import funcional.exercio_fixacao.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Employee> employees = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the complete path  ");
        String path = sc.nextLine();
        System.out.println("Enter salary");
        double salary = sc.nextDouble();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path)) ){
            String line = bufferedReader.readLine();
            while(line != null){
                String[] split = line.split(",");
                employees.add(new Employee(split[0], split[1],Double.parseDouble(split[2])));
                line = bufferedReader.readLine();
            }

            List<String> emails = employees.stream().filter(employee -> employee.getSalary() > salary).map(Employee::getEmail).sorted().toList();
            System.out.println("Email of people whose salary is more than " + salary +":");
            emails.forEach(System.out::println);

            Double sum = employees.stream()
                    .filter(employee -> !employee.getName().isEmpty() && employee.getName().toUpperCase().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
