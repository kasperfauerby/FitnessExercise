package demo;

public class Administration extends Employee{


    public Administration(String name, String cpr, int vacation) {
        super(name, cpr);
        this.vacation = vacation;
    }

    public int getVacation() {
        return 5;
    }

    @Override
    public int getHours(){
        return 37;
    }

    @Override
    public int getSalary(){
        return 33000;
    }

    @Override
    public String toString() {
        return name + "\t\t" + cpr + "\t\t" + getHours() + "\t\t" + getSalary() + " kr." + "\t" + getVacation();
    }
}
