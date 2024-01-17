import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class FileReader {
    public static void main(String[] args) throws Exception {
        File myFile = new File("C:\\Users\\roman\\Desktop\\3 семестр\\IT_lab\\lab4\\read.txt");
        File anotherFile = new File("C:\\Users\\roman\\Desktop\\3 семестр\\IT_lab\\lab4\\write.txt");
        try {
            FileInputStream input = new FileInputStream(myFile);//начинаем чтение
            FileOutputStream output = new FileOutputStream(anotherFile);
            byte[] buffer = new byte[100];
            for (int index = 0; index < buffer.length; index++) {
                buffer[index] = ' ';
            }
            input.read(buffer);
            output.write(buffer);
            input.close();
            output.close();
            output.write(buffer);

        }
         catch (FileNotFoundException e) {
            System.out.println(e);
            throw new CustomFileNotFoundException("ошибка");//бросаем ошибку если файла для чтения нет
        }
        catch (Exception e) {
            System.out.println("Ошибка ввода или вывода в файл " + e);
        } 
        
    }
}