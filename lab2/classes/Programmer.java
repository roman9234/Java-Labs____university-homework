package classes;

public class Programmer extends Employee{

    public static int programmersCount; //модификаторы доступа ООП
    private int competence; //компетенция
    public Programmer (String firstName, String lastName, int salary, int competence){
        super(firstName, lastName, salary);
        if((competence !=BACKEND)&&(competence !=FULLSTACK)&&(competence !=FRONTEND)){
            this.competence = Programmer.NONE;
        } else {
            this.competence = competence;
        }
        programmersCount++;
    }
    @Override
    public int getCompetence() {
        return this.competence;
    }//пример переопределения в ООП

    public void setCompetence(int competence) {
        this.competence = competence;
    }

    public static int getCounter(){
        return programmersCount;
    }
}

