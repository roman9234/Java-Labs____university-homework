import java.util.HashMap;
import java.util.Random;

public class block2 {

    public static void main(String[] args) {
        // int taskNum = 1; //выбор выполняемого задания
            // switch (taskNum) {

                // case(1):
                    System.out.println("Donald");
                    System.out.println(String.valueOf(duplicateChars("Donald")));
                    System.out.println("orange");
                    System.out.println(String.valueOf(duplicateChars("orange")));
                    // break;
                // case(2):
                    System.out.println(getInitials("Ryan Gosling"));
                    System.out.println(getInitials("Barack Obama"));
                    System.out.println(getInitials("Roman Lesovoy"));
                    // break;
                // case(3):
                    int[] nums1 = {44, 32, 86, 19};
                    int[] nums2 = {22, 50, 16, 63, 31, 55};
                    System.out.println(differenceEvenOdd(nums1));
                    System.out.println(differenceEvenOdd(nums2));
                    // break;
                // case(4):

                    int[] nums3 = {1, 2, 3, 4, 5};
                    int[] nums4 = {1, 2, 3, 4, 6};
                    System.out.println(equalToAvg(nums3));
                    System.out.println(equalToAvg(nums4));
                
                    // break;
                // case(5):

                    int[] nums5 = {1, 2, 3};
                    int[] nums6 = {3, 3, -2, 408, 3, 31};

                    int[] result1 = indexMult(nums5); //получаем результат
                    for (int num : result1) {
                        System.out.print(num + " "); // Выводим результат
                    }
                    System.out.println();

                    int[] result2 = indexMult(nums6); // получаем результат
                    for (int num : result2) {
                        System.out.print(num + " "); // Выводим результат
                    }

                    // break;
                // case(6):   

                    String str1 = "Hello World";
                    String str2 = "The quick brown fox.";
            
                    System.out.println(reverse(str1));
                    System.out.println(reverse(str2));  

                    // break;
                // case(7):
                    System.out.println(tribonacci(7)); //0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274
                    System.out.println(tribonacci(11));
                    // break;
                // case(8):
                    System.out.println("\""+pseudoHash(5)+"\"");
                    System.out.println("\""+pseudoHash(10)+"\"");
                    System.out.println("\""+pseudoHash(0)+"\"");
                    // break;
                // case(9):
                    System.out.println(botHelper("Hello, I’m under the water, please help me"));
                    System.out.println(botHelper("Two pepperoni pizzas please"));
                    System.out.println(botHelper("HeLp"));
                    System.out.println(botHelper("HELP"));
                    System.out.println(botHelper("Hello"));
                    // break;
                // case(10):
                    System.out.println(isAnagram("listen", "silent"));
                    System.out.println(isAnagram("eleven plus two", "twelve plus one"));
                    System.out.println(isAnagram("hello", "world"));
                    System.out.println(isAnagram("hello", "ohell"));
                    System.out.println(isAnagram("bruh", "hubr"));
                    System.out.println(isAnagram("eoeoeooe", "hhhh"));
                    // break;

            // }

        }

    //1
    public static boolean duplicateChars(String repeatedSymbWithUpper){ //повторяются ли буквы

        String repeatedSymb = repeatedSymbWithUpper.toLowerCase();// переводим в нижний регистр
        int[] charCount = new int[256]; // используем массив для подсчета количества каждого символа из ASCII

        for (int i = 0; i < repeatedSymb.length(); i++) {
            char c = repeatedSymb.charAt(i); //возвращает символ с позиции
            charCount[c] = charCount[c] + 1; //используем номер символа (в ASCII) как позицию в массиве
            if (charCount[c] > 1) {
                return true; // если символ уже встречался ранее, возвращаем true
            }
        }
        return false; // если не было повторяющихся символов

    }
    //2
    public static String getInitials(String fullName) { //инициалы

        String[] names = fullName.split(" "); //разделяем на 2 слова по пробелу
        StringBuilder initials = new StringBuilder(); //класс в Java для изменения и сборки строк
        for (String name : names) { //для каждого элемента массива names
            initials.append(name.charAt(0)); //добавляем первую букву
        }
        return initials.toString(); //переводим stringBuilder в string и возвращаем

    }
    //3
    public static int differenceEvenOdd(int[] nums){//разность чётных и нечётных
        int evenSum = 0;
        int oddSum = 0;
        for (int num : nums) { //для каждого элемента массива
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        return Math.abs(evenSum - oddSum); //результат - разница по модулю
    }
    //4
    public static boolean equalToAvg(int[] nums){ //элемент равный среднему арифм.
        int sum = 0; //сумма
        for (int num : nums) {
            sum += num;
        }
        double average = (double) sum / nums.length; //среднее арифм.
        for (int num : nums) {
            if ((double)num == average) {
                return true; //если элемент найден
            }
        }
        return false;
    }
    //5
    public static int[] indexMult(int[] nums) {//умножение на индекс
        int[] result = new int[nums.length]; //результирующий массив
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * i; //задаём значения result[]
        }
        return result;
    }
    //6
    public static String reverse(String str) {//разворот строки
        StringBuilder result = new StringBuilder(str); //класс для работы со строками
        return result.reverse().toString(); //разворачиваем и возвращаем
    }
    //7
    public static int tribonacci(int n) {//Трибоначчи
        if (n == 0) { //первые 3 числа же заданы
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else { 
            int first = 0;
            int second = 0;
            int third = 1;
            int result = 0;
            for (int i = 4; i <= n; i++) {//начинаем с i=4 чтобы правильно считать элементы по их номеру
                result = first + second + third;
                first = second;
                second = third;
                third = result; //вычисляем все числа Трибоначчи до результата
            }
            return result;
        }
    }
    //8
    public static String pseudoHash(int length) {//псевдохэш

        final String characters = "abcdef0123456789"; //все доступные нам символы от a до f и 0-9
        StringBuilder hash = new StringBuilder(); //уже знакомый и мега простой stringBuilder
        Random random = new Random(); //чтобы создать псевдорандомнэй хэш понадобится генератор случаных чисел. Инициируем его представление.

        for (int i = 0; i < length; i++) {//длина должна быть в соответствии с заданной length
            int randomIndex = random.nextInt(characters.length()); //nextInt -> Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive)
            char randomChar = characters.charAt(randomIndex); //получаем char по рандомному номеру
            hash.append(randomChar);//добавляем char в результат
        }

        return hash.toString();
    }
    //9
    public static String botHelper(String message) {//есть ли слово help
        char h1, h2, h3, h4;
        String messageUsed = message.toLowerCase();//в нижний регистр
        for(int i = 3; i < messageUsed.length(); i++){//regex - зло, поэтому его здесь нет
            h1 = messageUsed.charAt(i-3);
            h2 = messageUsed.charAt(i-2);
            h3 = messageUsed.charAt(i-1);
            h4 = messageUsed.charAt(i);
            if((h1=='h')&&(h2=='e')&&(h3=='l')&&(h4=='p')){//такими костылями я набрал 93 балла на егэ
                return "Calling for a staff member";
            }
        }
        return "Keep waiting";
    }
    //10
    public static boolean isAnagram(String word1, String word2){//анаграмма
        if(word1.length()!=word2.length()){return false;} //проверка на то что слова имеют одинаковую длину
        String alphabet = "abcdefghijklmnopqrstuvwxyz "; //алфавит + пробел
        HashMap<String, Integer> letters1 = new HashMap<>();
        HashMap<String, Integer> letters2 = new HashMap<>(); // 2 словаря
        String h; int oldCount;
        for(int i = 0; i < alphabet.length(); i++){ // вносим в словари значения для каждого символа
            h = String.valueOf(alphabet.charAt(i));
            letters1.put(h, 0);
            letters2.put(h, 0);
        }
        for(int i = 0; i < word1.length(); i++){ //проходим по словам и вносим число букв в словари
            h = String.valueOf(word1.charAt(i));
            oldCount = letters1.get(h);
            letters1.put(h,oldCount+1);
            h = String.valueOf(word2.charAt(i));
            oldCount = letters2.get(h);
            letters2.put(h,oldCount+1);
        }
        for(int i = 0; i < alphabet.length(); i++){ //сравниваем словари
            h = String.valueOf(alphabet.charAt(i));
            if(letters1.get(h) != letters2.get(h)){
                return false;
            }
        }
        return true;
    }

}