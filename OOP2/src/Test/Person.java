package Test;

public class Person{
    private String name;
    private double salary;//We should declare variables with "private", so the user can't modify them.
    public Person(String newName, double newSalary){
        this.name = newName;
        this.salary = newSalary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String toString(){
        return "Test.Person: " + this.name + "\n" + "Salary: " + this.salary;

    }
    public static void main(String[] args) {

    }
}
