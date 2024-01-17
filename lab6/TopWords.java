import java.io.File;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        // указываем путь к файлу
        String filePath = "C:\\Users\\roman\\Desktop\\3 семестр\\IT_lab\\lab6\\words.txt";
        // создаем объект File
        File file = new File(filePath);
        // создаем объект Scanner для чтения файла
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // создаем объект Map для хранения слов и их количества
        Map<String, Integer> word_count_map = new HashMap<>();
        // читаем файл по словам и добавляем их в Map
        try{
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                if (word_count_map.containsKey(word)) {
                    word_count_map.put(word, word_count_map.get(word) + 1);
                } else {
                    //если такого слова в списке ещё нет, добавляем
                    word_count_map.put(word, 1);
                }
            }
            // закрываем Scanner
            scanner.close();
        }catch(Exception e){
            //обработка ошибки
            System.out.println(e);
            return;
        }
        // создаем список из элементов Map. Используем метод entrySet 
        // entrySet() возвращает набор ключей и значений
        List<Map.Entry<String, Integer>> wordCountList = new ArrayList<>(word_count_map.entrySet());
        // сортируем список по убыванию количества повторений используя метод sort для сортировки коллекций
        Collections.sort(wordCountList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // здесь используется метод compareTo который возвращает -1 если o1<02 и 1 если o1>o2 либо 0 если они равны
                // при желании можно изменить метод compare чтобы гибко настроить сортировку
                return o2.getValue().compareTo(o1.getValue());
                // return o1.getValue().compareTo(o2.getValue()); // сорртировка списка по возрастанию как пример изменения этого метода
            }
        });
        // выводим топ-10 слов
        int count = 0;
        for (Map.Entry<String, Integer> entry : wordCountList) { 
            // проходимсяя по wordCountList используя entry встроенные в него при создании
            if (count < 10) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                count++;
            } else {
                break;
            }
        }
    }
}