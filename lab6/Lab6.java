public class Lab6{
    public static void main(String[] args){

        //обобщенный класс Stack<T>, который реализует стек на основе массива

        Stack<Integer> stack = new Stack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        try{
            output(stack.pop()); 
            output(stack.peek());
            stack.push(4);
            output(stack.pop());
        }catch(Exception e){
            e.printStackTrace();
        }


        //разработать программу для учета продаж в магазине. 
        // Программа должна позволять добавлять проданные товары в коллекцию, 
        // выводить список проданных товаров, а также считать общую сумму
        // продаж и наиболее популярный товар
        

        SalesTracker tracker = new SalesTracker();
        tracker.addSale("Товар 1", 5);
        tracker.addSale("Товар 2", 3);
        tracker.addSale("Товар 10", 15);
        tracker.addSale("Товар 1", 2);
        tracker.addSale("Товар 3", 7);

        output("Список продаж:");
        tracker.printSales();

        output("Общая сумма продаж: " + tracker.getTotalSales());

        output("Самый популярный товар: " + tracker.getMostPopularProduct());

        newline();

        tracker.addSale("Товар 2", 15);

        tracker.printSales();

        output("Общая сумма продаж: " + tracker.getTotalSales());

        output("Самый популярный товар: " + tracker.getMostPopularProduct());

    }

    public static void newline(){
        System.out.println();
    }
    
    public static void output(String s){
        System.out.println(s);
    }
    public static void output(int s){
        System.out.println(s);
    }
}