import classes.Administrator;
import classes.Employee;
import classes.Manager;
import classes.Programmer;

import java.util.ArrayList;

public class testCode {// 2 вариант
    public static void main(String[] args){

        //создаём первый экземпляр класса
        output("проверяем работу статического счётчика");
        Programmer p1 = new Programmer("Sergey",
                "Lomov",150_000,Programmer.FULLSTACK);
        //здесь также показана публичная статическая переменная Programmer.FULLSTACK,
        // что демонстрирует возможности модификаторов доступа в ООП

        output(p1.getSalary());//35000
        output(Programmer.getCounter());//1

        Programmer p2 = new Programmer("Valery",
                "Orlov",80_000,Programmer.BACKEND);
        Programmer p3 = new Programmer("Oleg",
                "Kirov",75_000,Programmer.FRONTEND);

        output(Programmer.getCounter());//3

        //протестируем другие классы

        Administrator mainAdmin = new Administrator("Kirill","Nikolaev",
                130_000,null);
        Manager frontEndManager = new Manager("Timofey", "Bolonov",
                80_000,null);
        Manager backEndManager = new Manager("Vasiliy", "Poltanov",
                80_000,null);

        output("проверяем работу переменных администратора менеджера, программиста");

        mainAdmin.addSubordinate(frontEndManager);//админ
        mainAdmin.addSubordinate(backEndManager);

        frontEndManager.addSubordinate(p1);//1 менеджер
        frontEndManager.addSubordinate(p3);

        backEndManager.addSubordinate(p2);//2 менеджер

        //проверяем работу:
        System.out.println();
        output("mainAdmin");
        output("summ subordinates salary:" + mainAdmin.getSubordinatesSalarySumm());
        output(mainAdmin.getSubordinates());

        System.out.println();
        output("frontEndManager");
        output("summ subordinates salary:" + frontEndManager.getSubordinatesSalarySumm());
        output(frontEndManager.getSubordinates());

        System.out.println();
        output("backEndManager");
        output("summ subordinates salary:" + backEndManager.getSubordinatesSalarySumm());
        output(backEndManager.getSubordinates());
    }

    //Несколько методов для вывода в консоль. Названия одинаковые, но параметры и код разные
    //Демонстрирует перегрузку (полиморфизм)
    public static void output(String s){
        System.out.println(s);
    }

    public static void output(int s){
        System.out.println(s);
    }
    
    public static <T extends Employee> void output(ArrayList<T> s){
        for(T o:s){
            System.out.print(o.getClass().getSimpleName() + ": ");
            System.out.print(o.getFirstName() + " ");
            System.out.print(o.getLastName() + " ");
            System.out.println(o.getSalary() + " ");
        }
    }
}