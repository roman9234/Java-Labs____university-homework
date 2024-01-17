import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class block3 {

    public static void main(String[] args) {
        // int taskNum = 10; //выбор выполняемого задания
        // switch (taskNum) {

        //     case(1):
                System.out.println(replaceVovels("apple"));
                System.out.println(replaceVovels("Even if you did this task not by yourself, you have to understand every single line of code."));
                System.out.println(replaceVovels("Yeah you are kinda right"));
                System.out.println(replaceVovels("Hello"));
            //     break;
            // case(2):
                System.out.println(stringTransform("hello"));
                System.out.println(stringTransform("bookkeeper"));
                System.out.println(stringTransform("HHoeoeoeoeoHH"));
                System.out.println(stringTransform("eHHoeoeoeoeoHHe"));
                // break;
            // case(3):
                System.out.println(doesBlockFit(1, 3, 5, 4, 5));//true
                System.out.println(doesBlockFit(1, 8, 1, 1, 1));//true
                System.out.println(doesBlockFit(1, 2, 2, 1, 1));//false
                // break;
            // case(4):
                System.out.println(numCheck(243));// ➞ true
                // 243 нечетное, как и 29 (2^2 = 4, 4^2 = 16, 3^2 = 9, 4+16+9 = 29)
                System.out.println(numCheck(52));// ➞ false
                // 52 четное, но 29 – нет (5^2=25, 2^2=4, 25 + 4 = 29)
                System.out.println(numCheck(12));// ➞ false
                // 12 четное, но 5 – нет
            //     break;
            // case(5):
            
                int[] arr1 = {1, -3, 2};
                System.out.println(arr1[0]+"x^2 + "+arr1[1]+"x + "+arr1[2]);
                System.out.println(countRoots(arr1));
                int[] arr2 = {2, 5, 2};
                System.out.println(arr2[0]+"x^2 + "+arr2[1]+"x + "+arr2[2]);
                System.out.println(countRoots(arr2)); //здесь 
                int[] arr3 = {1, -6, 9};
                System.out.println(arr3[0]+"x^2 + "+arr3[1]+"x + "+arr3[2]);
                System.out.println(countRoots(arr3));
            
            //     break;
            // case(6):

                String[][] salesData1 = {
                    {"Apple", "Shop1", "Shop2", "Shop3", "Shop4"},
                    {"Banana", "Shop2", "Shop3", "Shop4"},
                    {"Orange", "Shop1", "Shop3", "Shop4"},
                    {"Pear", "Shop2", "Shop4"}
                };
    
                List<String> soldItems1 = getSoldItems(salesData1);
                System.out.println(soldItems1); // ["Apple"]
    
                String[][] salesData2 = {
                    {"Fridge", "Shop2", "Shop3"},
                    {"Microwave", "Shop1", "Shop2", "Shop3", "Shop4"},
                    {"Laptop", "Shop3", "Shop4"},
                    {"Phone", "Shop1", "Shop2", "Shop3", "Shop4"}
                };
    
                List<String> soldItems2 = getSoldItems(salesData2);
                System.out.println(soldItems2); // ["Microwave", "Phone"]

            //     break;
            // case(7):
                System.out.println(validSplit("apple eagle egg goat"));// ➞ true
                System.out.println(validSplit("cat dog goose fish"));// ➞ false
                System.out.println(validSplit("eoeoeoe eeeee ooooe"));// ➞ false
                System.out.println(validSplit("eoeoeoe eeeeh hoooe eh h h h"));// ➞ true
            //     break;
            // case(8):
                int[] arr4 = {3, 1, 4, 2, 7, 5};
                int[] arr5 = {1, 2, 3, 4, 5};
                int[] arr6 = {1, 2, -6, 10, 3};

                System.out.println(waveForm(arr4));// ➞ true последовательность начинается с убывания (3, 1), сменяющегося на возрастание (1, 4) и т.д.
                System.out.println(waveForm(arr5));// ➞ false
                System.out.println(waveForm(arr6));// ➞ true
            
            //     break;
            // case(9):
                System.out.println(commonVowel("Hello world"));// ➞ "o"
                System.out.println(commonVowel("Actions speak louder than words."));// ➞ "a"
                System.out.println(commonVowel("EEEEEEEEOFNRIKRKOKEPK"));// ➞ "e"
                System.out.println(commonVowel("QQQQQQQQU"));// ➞ "u"
            //     break;
            // case(10):
                int[][] input1 = {
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 29, 10},//2 заменено на 29 по условию
                    {5, 5, 5, 5, 35},//3 заменено на 35 по условию
                    {7, 4, 3, 14, 2},
                    {1, 0, 11, 10, 1}};
                int[][] input2 = {
                    {6, 4, 19, 0, 0},
                    {81, 25, 3, 1, 17},
                    {48, 12, 60, 32, 14},
                    {91, 47, 16, 65, 217},
                    {5, 73, 0, 4, 21}};
    
                int[][] output1 = dataScience(input1);
                int[][] output2 = dataScience(input2);
    
                // Вывод результата
                for (int i = 0; i < output1.length; i++) {
                    for (int j = 0; j < output1[i].length; j++) {
                        System.out.print(output1[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
    
                for (int i = 0; i < output2.length; i++) {
                    for (int j = 0; j < output2[i].length; j++) {
                        System.out.print(output2[i][j] + " ");
                    }
                    System.out.println();
                }
                    // break;

                System.out.println(highLow("1 2 3 4 5 6"));
                System.out.println(highLow("13"));
                System.out.println(highLow("6 4 -3"));
        }
    

    public static String highLow(String str_1){
        int maxV = -10000;
        int minV = 10000;
        String temp = "";
        int q;
        for(int i=0; i<str_1.length(); i++){

            if(!(str_1.charAt(i) == ' ')){
                temp += str_1.charAt(i);
            } else {
                q = Integer.valueOf(temp);
                maxV = q > maxV ? q : maxV;
                minV = q < minV ? q : minV;
                temp = "";
            }
        }
        return maxV + " " + minV;
    }
    

    //1
    public static String replaceVovels(String inputString){//замена гласных

        char[] vovelStrings = {'a','e','i','o','u','y'};//все гласные
        StringBuilder finalString = new StringBuilder(); //великий StringBuilder
        char currentChar;
        for(int i = 0; i < inputString.length(); i++){
            currentChar = inputString.charAt(i); //текущий символ
            boolean isVowel = false;
            /*
                ниже используем примитивный метод поиска в массиве так как 
                Arrays.asList(vowelStrings).contains(currentChar) не подходит для работы с char так как это простий тип
            */
            for (char checkedCahr : vovelStrings) {
                if (Character.toLowerCase(currentChar) == checkedCahr) {//проверка по массиву (символ переводим в нижний регистр)
                    isVowel = true;
                    break;}}

            if (isVowel) {currentChar = '*';}

            finalString.append(currentChar);
        }
        return finalString.toString();
    }
    //2
    public static String stringTransform(String inputString){//замена на Double

        StringBuilder finalString = new StringBuilder(); //StringBuilder
        char ch1, ch2;
        for(int i = 1; i < inputString.length(); i++){
            ch1 = inputString.charAt(i-1);
            ch2 = inputString.charAt(i); //обрабатываем 2 символа
            if(Character.toLowerCase(ch1) == Character.toLowerCase(ch2)){
                finalString.append("Double");
                finalString.append(Character.toUpperCase(ch2));
                i+=1; //подстановка Dpouble* и увеличение i для правильной обработки оставшейся строки
            } 
                else { finalString.append(ch1);}
        }

        ch1 = inputString.charAt(inputString.length()-2);
        ch2 = inputString.charAt(inputString.length()-1);

        if(Character.toLowerCase(ch1) == Character.toLowerCase(ch2)){ //проверка что последние 2 символа разные
            return finalString.toString();
        } else{
            finalString.append(ch2);
            return finalString.toString();
        }


    }
    //3
    public static boolean doesBlockFit(int a, int b, int c, int w, int h){//параллелепипед и дырка
        if( 
        /*у параллелепипеда по факту 3 стороны (6, но противоположные имеют одинаковые размеры), которые можно попытаться пропихнуть в дыру, 
        плюс по 2 варианта на каждую сторону - можно повернуть сторону на 90 градусов. В сумме 3 стороны * 2 варианта = 6 способов.
        */
            ((a<=w)&&(b<=h))||((b<=w)&&(a<=h))||
            ((b<=w)&&(c<=h))||((c<=w)&&(b<=h))||
            ((a<=w)&&(c<=h))||((c<=w)&&(a<=h))
        ){
            return true;
        } else {
            return false;
        }
    }
    //4
    public static boolean numCheck(int inputInt){//сумма квадратов и чётность
        int summ = 0;
        int curInt;
        String numberString = String.valueOf(inputInt); //преобразование в String
        for(int i = 0; i < numberString.length(); i++){
            curInt = Character.getNumericValue(numberString.charAt(i)); //получаем char, сразу преобразуем в int
            summ += curInt*curInt;
        }
        // System.out.println(summ); // можно проверить сумму
        if((inputInt % 2 == 0) == (summ % 2 == 0)){ //проверка на одинаковую чётность
            return true;
        } else {
            return false;
        }
    }
    //5
    public static int countRoots(int[] params){//целочисленные корни
        int a = params[0];
        int b = params[1];
        int c = params[2];
        double x1, x2;
        int result = 0;
        int D = b*b - 4*a*c; //дискриминант
        if (D >0){ //2 корня максимум
            double sqrt = Math.sqrt(D);
            x1 = (-b-sqrt)/(2*a);//вычисление корней
            x2 = (-b+sqrt)/(2*a);
            System.out.println(x1 + " " + x2);
            if(x1 % 1 == 0) {  //проверка на то, что корни целые
                // if(x1>0){
                result+=1; //можно добавить проверку на то что корни больше 0, чтобы соответствовать результатам в условии задачи
                // }
            }
            if(x2 % 1 == 0) {
                // if(x2>0){
                result+=1;
                // }
            }
            return result;
        } else if (D == 0){ // 1 корень максимум
            x1 = (-b)/(2*a);
            x1 = (-b)/(2*a);
            if(x1 % 1 == 0) {
                // if(x1>0){
                result+=1;
                // }
            }
            return result;
        } else {
            return 0;
        }
    }
    //6
    public static List<String> getSoldItems(String[][] sales) {//проданные товары

        List<String> soldItems = new ArrayList<>(); //массив проданных товаров
        Map<String, Boolean> itemsMap = new HashMap<>(); //словарь с проданными товарами

        for (int i = 0; i < sales.length; i++) { // Проходимся по каждому товару в массиве продаж
            String item = sales[i][0]; //берём item

            for (int j = 1; j < sales[i].length; j++) { // Помечаем товар как проданный в каждом магазине
                String shop = sales[i][j];
                itemsMap.put(shop, true); //добавляем магазины в словарь. Если ключ уже есть, ничего не изменяется. Это костыль, но работает
            }

            boolean soldInAllShops = true;
            for (int j = 0; j < sales.length; j++) { // Проверяем, был ли товар продан в каждом магазине
                for (int q = 1; q < sales[j].length; q++) {
                    String shop = sales[j][q];
                    if (!itemsMap.containsKey(shop)) {
                        soldInAllShops = false;
                        break;
                    }
                }
            }
            if (soldInAllShops) {
                soldItems.add(item);
            }
            itemsMap.clear();
        }

        return soldItems;
    }
    //7
    public static boolean validSplit(String inputString){//одинаковое начало и конец слов
        String[] words = inputString.split(" "); //разделяем на слова по пробелу
        for(int i = 1; i < words.length; i++) { //для каждого элемента массива names
            if(Character.toLowerCase(words[i-1].charAt(words[i-1].length()-1))!=Character.toLowerCase(words[i].charAt(0)))
            { //переводим буквы в нижний регистр и сравниваем
                return false;
            }
        }
        return true;//если верхнее условие (!=) не разу не выполнилось
    }
    //8
    public static boolean waveForm(int[] params){//возрастание/убывание последовательности
        boolean isIncreasing = false;
        boolean isFirst = true;
        int x1,x2;
        for(int i = 1; i < params.length; i++){
            x1 = params[i-1];
            x2 = params[i];
            if(isFirst){
                isFirst = false;
                isIncreasing = (x2>x1?true:false);//задаём возрастание/убывание первых чисел
            } else {
                if(((x2>x1)&&(isIncreasing))||((x1>x2)&&(!(isIncreasing)))){//проверяем в какую сторону изменилось число в массиве
                    return false;
                } else {
                    isIncreasing = (x2>x1?true:false);
                }
            }
        }
        return true;
    }
    //9
    public static char commonVowel(String inputString){//частая гласная
        //в этом методе везде используется String, так как есть массив и словарь
        String[] vovels = {"a","e","i","o","u","y"};
        Map<String, Integer> vovelsMap = new HashMap<>();
        String x;
        Integer old;
        for(String vov:vovels){
            vovelsMap.put(vov, 0);
        }
        for(int i=0;i<inputString.length();i++){ //проходим по каждой букве inputString
            x = String.valueOf(Character.toLowerCase(inputString.charAt(i)));
            if(Arrays.asList(vovels).contains(x)){
                old = vovelsMap.get(x);
                vovelsMap.put(x, old+1);}
            }

            int max = 0;
            String maxKey = "";

        // Проходим по каждой паре ключ-значение в HashMap
        for (Map.Entry<String, Integer> entry : vovelsMap.entrySet()) {
            //этот код нагло скопирован с интернета 
            //и позволяет разбить словарь на entry с key и value
            String key = entry.getKey();
            int value = entry.getValue();
            // Если текущее значение больше текущего максимального значения, обновляем значения переменных
            if (value > max) {
                max = value;
                maxKey = key;
            }
        }
        return maxKey.charAt(0);
        }
    //10
    public static int[][] dataScience(int[][] arrays) {//nnnnnnnnnnnnnnn

        int n = arrays.length;
        
        // Вычисляем сумму элементов каждого столбца
        int[] columnSums = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                columnSums[i] += arrays[j][i];
            }
        }
        // System.out.println(Arrays.toString(columnSums));
        int arithmeticMmean;
        // Изменяем каждый n-ый элемент n-го массива на среднее арифметическое элементов n-го столбца остальных массивов
        for (int i = 0; i < n; i++) {
                arithmeticMmean = (int)Math.round((double)(columnSums[i]-arrays[i][i])/(n-1));
                arrays[i][i] = arithmeticMmean;
        }
        return arrays;
    }
}