package demo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> employees = new ArrayList<>();
        ArrayList<Person> members = new ArrayList<>();

        employees.add(new Instructor("Dennis", "123456-7890", 20));
        employees.add(new Instructor("Denise", "123456-7890", 25));
        employees.add(new Administration("Sander", "123456-7890", 5));
        employees.add(new Administration("Sandra", "123456-7890", 5));

        members.add(new Member("Simon", "123456-7890", true));
        members.add(new Member("Simone", "123456-7890", true));
        members.add(new Member("Jannick", "123456-7890", false));
        members.add(new Member("Jane", "123456-7890", false));

        getEmployees(employees);
        getMembers(members);

        System.out.println("\nMEDARBEJDERE & MEDLEMMER");
        System.out.println("Navn \t\tCPR-Nr ");
        System.out.println("********************************************************");
        for (Person p: employees) {
            System.out.println(p.getName() + "\t\t" + p.getCpr());
        }
        for (Person p: members) {
            System.out.println(p.getName() + "\t\t" + p.getCpr());
        }

    }

        public static void getEmployees(ArrayList<Person> employees){
            System.out.println("\nMEDARBEJDERE");
            System.out.println("Navn \t\tCPR-Nr \t\t\tTimer \tLøn \t\tFerie");
            System.out.println("********************************************************");
            for (Person p: employees) {
                System.out.println(p);
            }
        }

    public static void getMembers(ArrayList<Person> members){
        System.out.println("\nMEDLEMMER");
        System.out.println("Navn \t\tCPR-Nr \t\t\tMembership \tFee");
        System.out.println("********************************************************");
        for (Person p: members) {
            System.out.println(p);
        }
    }





}
