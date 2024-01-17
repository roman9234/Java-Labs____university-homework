package classes;

public abstract class Employee { //сотрудник. Абстрактный класс

    public static final int BACKEND = 0;
    public static final int FULLSTACK = 1;
    public static final int FRONTEND = 2;
    public static final int ADMINISTRATOR = 3;
    public static final int MANAGER = 4;
    public static final int NONE = -1;

    private int salary;//указана зарплата, имя, фамилия
    private String firstName;
    private String lastName;
    public Employee(String firstName, String lastName, int salary){
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract int getCompetence();//пример переопределения в ООП

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
