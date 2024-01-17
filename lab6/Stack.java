
/*
 * Стек - тип данных, при котором удаление и добавление 
 * элементов происходит только в самую вершину стека.
 * имеет операции:
 * 
 * push - добавление элемента в вешину стека
 * pop - удаление элемента из вершины стека
 * peek - получение элемента из вершины стека без удаления
 * size - получение размера стека
 * 
 * есть 2 подвида: Stack и Queue. Queue - по принципу "очереди" - добавляем в конец очереди, удаляем из начала
 * Stack - удаление и добавление в вершину стека.
 */


public class Stack<T>{

    private T[] data;
    private int size;

    
    //конструктор
    public Stack(int capacity) {
        /*
         * массив data - пустой массив объектов типа Object заданного размера
         * происходит приведение типов (T[])
         * чтобы привести массив data к типу T[]
         */
        data = (T[]) new Object[capacity];
        size = 0;
    }
    
    public void push(T element) {
        if (size == data.length) {
            throw new StackOverflowError();
        }
        data[size++] = element;
    }
    
    public T pop() throws Exception {
        if (this.size()== 0) {
            throw new Exception("Stack is empty");
        }
        T element = data[size-1];
        size--;
        return element;
    }
    
    public T peek() throws Exception {
        if (this.size() == 0) {
            throw new Exception("Stack is empty");
        }
        return data[size-1];
    }

    public int size(){
        return this.size;
    }
}
