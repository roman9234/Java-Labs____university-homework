
public class Lab3{ //Вариант 9
    public static void main(String[] args){



        HashTable<String, Car> carsTable= new HashTable<String, Car>();

        Car c1 = new Car("BMW", "X5",1998);
        Car c2 = new Car("BMW", "M3",2005);
        Car c3 = new Car("Toyota", "Camry",2009);
        Car c4 = new Car("Toyota", "RAV4",2012);
        Car c5 = new Car("Ford", "Mustang",1993);
        Car c6 = new Car("Ford", "Explorer",2016);
        Car c7 = new Car("Honda", "Civic",2008);
        Car c8 = new Car("Honda", "CR-V",2019);

        carsTable.put("А001АА",c1);
        output(carsTable.get("А001АА"));
        carsTable.remove("А001АА");
        output(carsTable.get("А001АА"));
        carsTable.put("А001АА",c2);
        output(carsTable.get("А001АА"));

    }

    public static void output(String s){
        System.out.println(s);
    }
    public static void output(int s){
        System.out.println(s);
    }

    public static void output(Car s){
        if(s == null){
            System.out.println("null");
        } else {
            System.out.println(s.getManufacturer() + " " + s.getModel() + " " + s.getYear_of_production());
        }
    }
}