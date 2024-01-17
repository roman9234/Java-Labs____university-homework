package classes;

import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Programmer> subordinates;
    public Manager(String firstName, String lastName, int salary, ArrayList<Programmer> subordinates) {
        super(firstName, lastName, salary);
        if (subordinates == null){
            ArrayList<Programmer> s = new ArrayList<Programmer>();
            this.subordinates = s;
        } else {
            this.subordinates = subordinates;
        }
    }

    public ArrayList<Programmer> getSubordinates() {
        return subordinates;
    }

    public int getSubordinatesCount(){
        return subordinates.size();
    }

    public void setSubordinates(ArrayList<Programmer> subordinates) {
        this.subordinates = subordinates;
    }

    public void removeSubordinate(Programmer obj) {
        subordinates.remove(obj);
    }

    public void addSubordinate(Programmer obj) {
        subordinates.add(obj);
    }

    public void clearSubordinate() {
        subordinates.clear();
    }

    public int getSubordinatesSalarySumm() {
        int summ = 0;
        for (Programmer p : subordinates) {
            summ += p.getSalary();
        }
        return summ;
    }

    public int getCompetence(){
        return MANAGER;
    }

}
