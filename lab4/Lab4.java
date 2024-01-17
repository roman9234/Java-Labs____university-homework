public class Lab4 {
    public static void main(String[] args){

        try {
            output(SimpleOperations.count("1+1"));//2
            output(SimpleOperations.count("4-1"));//3
            output(SimpleOperations.count("2*2"));//4
            output(SimpleOperations.count("5/2"));//2.5
            output(SimpleOperations.count("5$2"));//e
        } catch (Exception e) {//выводим сообщение об ошибке если она есть
            output(e.toString());
        }





    }
    public static void output(String s){
        System.out.println(s);
    }
    public static void output(int s){
        System.out.println(s);
    }
    public static void output(double s){
        System.out.println(s);
    }
}
