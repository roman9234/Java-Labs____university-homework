package classes;

import java.util.ArrayList;

public class Administrator extends Employee{

    private ArrayList<Manager> subordinates;

    public Administrator(String firstName, String lastName, int salary, ArrayList<Manager> subordinates){
        super(firstName, lastName, salary);
        if (subordinates == null){
            ArrayList<Manager> s = new ArrayList<Manager>();
            this.subordinates = s;
        } else {
            this.subordinates = subordinates;
        }
    }

    public ArrayList<Manager> getSubordinates() {
        return subordinates;
    }

    public int getSubordinatesCount(){
        return subordinates.size();
    }

    public void setSubordinates(ArrayList<Manager> subordinates) {
        this.subordinates = subordinates;
    }

    public void removeSubordinate(Manager obj) {
        subordinates.remove(obj);
    }

    public void addSubordinate(Manager obj) {
        subordinates.add(obj);
    }

    public void clearSubordinate() {
        subordinates.clear();
    }

    public int getSubordinatesSalarySumm() {
        int summ = 0;
        for (Manager m : subordinates) {
            summ += m.getSalary();
        }
        return summ;
    }

    public int getCompetence(){
        return ADMINISTRATOR;
    }

}
