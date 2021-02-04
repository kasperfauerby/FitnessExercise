package demo;

public class Instructor extends Employee{


    public Instructor(String name, String cpr, int hours) {
        super(name, cpr);
        this.hours = hours;
    }

    public int getVacation() {
        return 0;
    }

    @Override
    public int getHours(){
        return hours;
    }

    @Override
    public int getSalary() {
        return 199*hours;
    }

    @Override
    public String toString() {
        return  name + "\t\t" + cpr + "\t\t" + hours + "\t\t" + getSalary() + " kr.";
    }

}
