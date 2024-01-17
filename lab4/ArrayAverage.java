import java.io.File;
import java.util.Scanner;
public class ArrayAverage {
    public static void main(String[] args) throws Exception {
        try {
            int[] array = new int[5];
            File myFile = new File("C:\\Users\\roman\\Desktop\\3 семестр\\IT_lab\\lab4\\text.txt");
            Scanner scanner = new Scanner(myFile);
            int index = 0;
            while (scanner.hasNextLine()) {
                array[index] = Integer.parseInt(scanner.nextLine());
                index++;
            }
            
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                System.out.println(array[i]);
                
            }
            double mid = sum / array.length;
            System.out.println(mid);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("превышена длина массива");
        }
        catch (java.lang.NumberFormatException e) {
            System.out.println("неверный формат данных");
        }
    }
}
