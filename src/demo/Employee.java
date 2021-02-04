package demo;

public class Employee extends Person {

    int hours;
    int salary;
    int vacation;

    public Employee(String name, String cpr) {
        super(name, cpr);

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}