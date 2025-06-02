package funcional.exercio_fixacao.entities;

import java.util.StringJoiner;

public class Employee {
    private String name;
    private String email;
    private Double salary;

    public Employee(String nome, String email, Double salary) {
        this.name = nome;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("nome='" + name + "'")
                .add("email='" + email + "'")
                .add("salary=" + salary)
                .toString();
    }
}
