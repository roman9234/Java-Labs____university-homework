import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class block4 {
    public static void main(String[] args){

        //1

        System.out.println(nonRepeatable("abracadabra"));// ➞ "abrcd"
        System.out.println(nonRepeatable("paparazzi"));// ➞ "parzi"


        System.out.println();//2


        System.out.println(generateBrackets(2));
        System.out.println(generateBrackets(3));
        System.out.println(generateBrackets(4));


        System.out.println();//3


        System.out.println(binarySystem(3));
        System.out.println(binarySystem(4));


        System.out.println();//4


        System.out.println(alphabeticRow("abcdcjuwx"));//"abcd"
        System.out.println(alphabeticRow("klmabzyxw"));// ➞ "zyxw" 
        

        System.out.println();//5


        System.out.println(sortAndCountPattern("aaabbcdd"));  // c1b2d2a3
        System.out.println(sortAndCountPattern("vvvvaajaaaaa"));  // j1a2v4a5


        System.out.println();//6


        System.out.println(convertToNum("eight")); // 8
        System.out.println(convertToNum("five hundred sixty seven")); // 567
        System.out.println(convertToNum("thirty one")); // 31
        System.out.println(convertToNum("one hundred nineteen")); // 119
        System.out.println(convertToNum("three thousand seven hundred fifty two")); // 3752


        System.out.println();//7


        System.out.println(uniqueSubstring("123412324"));  // 1234
        System.out.println(uniqueSubstring("111111"));  // 1
        System.out.println(uniqueSubstring("77897898"));  // 789


        System.out.println();//8


        int[][] input1 = {{1, 3, 1},{1, 5, 1},{4, 2, 1}};
        System.out.println(shortestWay(input1));// ➞ 7   1+3+1+1+1=7

        int[][] input2 = {{2, 7, 3},{1, 4, 8},{4, 5, 9}};
        System.out.println(shortestWay(input2));// ➞ 21


        System.out.println();//9


        String strInput1 = "t3o the5m 1One all6 r4ule ri2ng";
        System.out.println(numericOrder(strInput1)); // One ring to rule them all
        
        String strInput2 = "re6sponsibility Wit1h gr5eat power3 4comes g2reat";
        System.out.println(numericOrder(strInput2));  // With great power comes great responsibility


        System.out.println();//10


        int res1 = switchNums(519, 723);
        System.out.println(res1); // 953

        int res2 = switchNums(491, 3912);
        System.out.println(res2); // 9942

        int res3 = switchNums(6274, 71259);
        // int res3 = switchNums(6277, 71259);//можно проверить, что работает с несколькими одинаковыми цифрами слева
        System.out.println(res3); // 77659






    }

    //1 удаляет повторяющиеся символы +
    public static String nonRepeatable(String str) { //1
        if (str.length() == 0) {   // если строка 0 в длину
            return "";
        }
        char firstChar = str.charAt(0);  // первый символ
        
        // вызываем рекурсивно функцию для остатка строки (удаляем все вхождения первого символа)
        String remaining = nonRepeatable(str.substring(1)).replaceAll(String.valueOf(firstChar), "");
        
        // возвращаем первый символ + результат рекурсивного вызова
        return firstChar + remaining;
    }
    
    //2 все правильные комбинации скобок +
    private static List<String> generateBrackets(int n){
        List<String> result = new ArrayList<String>();
        generateBrackets_helper(n,n,"",result);
        return result;
    }
    private static void generateBrackets_helper(int l, int r, String currentString, List<String> result) { //2
        // Есть 3 случая. Если l>0 мы всегда можем добавить левую скобку.
        //Если l>r, то у нас ошибка { к примеру (( ))) l = 1 r = 0 при n = 3},
        // поэтому правые скобки добавлять можно только если r>l (!!!!), а левые всегда

        if (l == 0 && r == 0) {
            result.add(currentString);
            return;
        }

        if (l > 0) {
            generateBrackets_helper(l - 1, r, currentString + "(", result);
        }

        if (r > l) {
            generateBrackets_helper(l, r - 1, currentString + ")", result);
        }
    }


    //3 бинарные комбинации длины n +
    public static List<String> binarySystem(int n){
    List<String> result = new ArrayList<String>();
    binarySystem_helper(n,result,"");
    return result;
    }

    public static void binarySystem_helper(int n, List<String> result, String currentString){//судя по примерам в условии, 1 может повторяться, 0 - нет
        if(n == 0){ //испоьзуем лист чтобы задавать ему значения без return так как это ссылочный тип
            result.add(currentString);
        }
        if((n>0)&&(currentString.length() == 0)){//если предыдущий символ 0, добавлчем только 1, иначе можно добавитт 0 или 1
            binarySystem_helper(n-1,result,currentString+"0");
            binarySystem_helper(n-1,result,"1");
        }
        else if((n>0)&&(String.valueOf(currentString.charAt(currentString.length()-1)).equals("1"))){
            binarySystem_helper(n-1,result,currentString+"0");
            binarySystem_helper(n-1,result,currentString+"1");
        } 
        else if((n>0)&&(String.valueOf(currentString.charAt(currentString.length()-1)).equals("0"))){
            binarySystem_helper(n-1,result,currentString+"1");
        }
    }


    //4 длина последовательного ряда +
    public static String alphabeticRow(String s){
        return alphabeticRow_helper(s, "", 0, 0, "", false);
    }

    public static String alphabeticRow_helper(String inputString, String result, int currentLength, int currentChar, String currentRow, boolean isIncreasing){
        if(inputString.length() == 0){//если длина строки = 0, заканчиваем работу
            return result;
        } else if(currentLength == 0){//если последовательного ряда ещё нет, начинаем его отсчёт
            currentLength += 1;
            currentChar = (int)inputString.charAt(0);
            currentRow = Character.toString(currentChar);
            result = currentRow.length()>result.length()?currentRow:result;//если длина больше предыдущего максимального ряда
            if(inputString.length()>1){//рекурсивная функция
                inputString = inputString.substring( 1, (inputString.length()));
                return alphabeticRow_helper(inputString,result, currentLength,currentChar,currentRow, false);
                //                 входная строка, текущий результат, текущая длина послед, текущий символ, текущая послед, возр/убыв
            } else {
                return result;
            }
        } else {//если ряд уже есть
            if(
                (currentLength == 1)||
                ((int)(currentChar + 1) == (int)inputString.charAt(0)&&isIncreasing)|| //проверяем увеличивается или уменьшается код символа, либо длина ряда 1
                ((int)(currentChar - 1) == (int)inputString.charAt(0)&&(!isIncreasing)))
                {//если да, продолжаем отсчёт ряда
                currentLength += 1;
                isIncreasing = ((int)(currentChar + 1) == (int)inputString.charAt(0)); //задаём увеличение либо уменьшение последовательности
                currentChar = (int)inputString.charAt(0);
                currentRow += Character.toString(currentChar);
                result = currentRow.length()>result.length()?currentRow:result;
                if(inputString.length()>1){//проверяем, есть ли ещё больше 1 символа в строке для отсчёта
                    inputString = inputString.substring( 1, (inputString.length()));
                    return alphabeticRow_helper(inputString,result, currentLength,currentChar,currentRow,isIncreasing);
                } else {//ели нет, возвращаем результат
                    return result;
                }
            } else {//если последовательность сбилась - сразу отсчитываем новую
                currentLength = 1;
                currentChar = (int)inputString.charAt(0);
                result = currentRow.length()>result.length()?currentRow:result;
                currentRow = Character.toString(currentChar);
                if(inputString.length()>1){
                    inputString = inputString.substring( 1, (inputString.length()));
                    return alphabeticRow_helper(inputString,result, currentLength,currentChar,currentRow, false);
                } else {
                    return result;
                }
            }
        }
    }

    //5 +
    public static String sortAndCountPattern(String str) {
        if (str == null || str.isEmpty()) { //проверяем что параметры заданы
            return str;
        }
        
        StringBuilder result = new StringBuilder(); //StringBuilder
        int count = 1; //count 1 так как в цикле начинаем с i=1
        
        for (int i = 1; i < str.length(); i++) { //проходим по символам в строке
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {//когда идущие подряд символы закончились, добавляем последовательность в результирующую строку
                result.append(str.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }
        
        result.append(str.charAt(str.length() - 1));
        result.append(count);//добавляем последнюю последовательность
        
        // Сортируем строку по возрастанию длины последовательности
        for (int i = 1; i < result.length() - 2; i += 2) {// сортировка пузырьком
            for (int j = i + 2; j < result.length(); j += 2) {//i j на цифрах
                if (result.charAt(j) < result.charAt(i) || (result.charAt(j) == result.charAt(i) &&
                    result.charAt(j - 1) < result.charAt(i - 1))) {//цифра должна быть больше, а буквы в алфавитном порядке
                    char tempChar = result.charAt(i-1);
                    int tempCount = Integer.parseInt(String.valueOf(result.charAt(i)));
                    
                    result.setCharAt(i-1, result.charAt(j-1));//меняем местами 2 символа если условия выполнились
                    result.setCharAt(i, result.charAt(j));
                    result.setCharAt(j-1, tempChar);
                    result.setCharAt(j, (char)(tempCount + '0'));
                }
            }
        }
        return result.toString();
    }

    //6 число из строки +
    public static int convertToNum(String numberStr) {
        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};//цифры
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};//десятки
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};//10-19
        String[] scales = {"hundred", "thousand"};//сотни и тысячи

        int result = 0;
        int tempResult = 0;
        int scale = 1;

        String[] words = numberStr.split(" ");//разбиваем строку на слова по пробелу

        for (String word : words) {
            boolean found = false;

            for (int i = 0; i < 10; i++) {
                if (word.equals(digits[i])) {//проверка на то, что слово одно из цифр
                    tempResult += i;
                    found = true;
                    break;
                }
            }

            for (int i = 1; i < 10; i++) { //проверка на то, что слово одно из десятков
                if (word.equals(tens[i])) {
                    tempResult += i * 10;
                    found = true;
                    break;
                }
            }

            for (int i = 0; i < 10; i++) { //проверка на то, что слово в массиве 10-19
                if (word.equals(teens[i])) {
                    tempResult += i + 10;
                    found = true;
                    break;
                }
            }

            for (int i = 0; i < 2; i++) {
                if (word.equals(scales[i])) { // проверка на сотни/тысячи
                    scale = scale * (i == 0 ? 100 : 1000); //сотни либо тысячи, только 2 варианта
                    result += tempResult * scale;//умножаем tempResult на scale и возвразаем scale до 0
                    tempResult = 0;
                    scale = 1;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return -1; // Возвращаем -1 в случае некорректного ввода
            }
        }

        result += tempResult;
        return result;
    }

    //7 уникальные подстроки
    public static String uniqueSubstring(String str) {
        String longestSubstring = "";//результат
        
        for (int i = 0; i < str.length(); i++) {//перебираем все варианты
            String substring = "";
            for (int j = i; j < str.length(); j++) {// строим substring по одному символу за раз
                char ch = str.charAt(j);
                if (substring.indexOf(ch) == -1) {//проверка что такого символа ещё нет в подстроке
                    substring += ch;
                } else {
                    break;//если есть, начинаем заново (после определения самой длинной строки
                }
            }
            if (substring.length() > longestSubstring.length()) {//после break переходим сюда
                longestSubstring = substring;
            } //если прерванная строка больше максимальной из наденных
        }
        
        return longestSubstring;
    }


    //8 самый короткий путь по двумерному массиву +
    public static int shortestWay(int[][] inputWay){
        List<Integer> result = new ArrayList<Integer>();
        result.add(10000000);
        shortestWay_helper(inputWay,result,0,0,0);
        return result.get(0);
    }

    public static void shortestWay_helper(int[][] inputWay, List<Integer> result, int curX, int curY, int curLen){
        int n = inputWay.length - 1;//записываем n
        //inputWay[curY][curX] в начале они 0 0
        if((curX==0)&&(curY==0)){//если только запустили метод и curLen не указан, задаём начальную длину маршрута на первой точке
            curLen = inputWay[0][0];
        }
        if((curX==n)&&(curY==n)){//если дошли до конца, сравниваем с минимальным результатом
            Integer curRes = result.get(0);
            curRes = curRes>curLen?curLen:curRes;
            result.set(0,curRes);
            return;
        }
        if(curX==n){
            shortestWay_helper(inputWay,result,curX,(curY+1),(curLen+inputWay[curY+1][curX])); //curLen меняется при вызове следующего метода в рекурсии
        } else if (curY==n){
            shortestWay_helper(inputWay,result,(curX+1),curY,(curLen+inputWay[curY][curX+1])); //перебираем все варианты
        } else {
            shortestWay_helper(inputWay,result,(curX+1),curY,(curLen+inputWay[curY][curX+1]));
            shortestWay_helper(inputWay,result,curX,(curY+1),(curLen+inputWay[curY+1][curX]));
        }
    }

    //9 слова с номером в предложении +
    public static String numericOrder(String input) {
        String[] words = input.split(" ");//разделяем слова по пробелам
        String[] orderedWords = new String[words.length];//создаём массив String с заданной длиной фразы
        
        for (String word : words) {
            int order = 0;
            for (int i = 0; i < word.length(); i++) {//проходим по массиву слов
                if (Character.isDigit(word.charAt(i))) {//проходим по всем символам, проверка что символ является числом
                    order = order * 10 + Character.getNumericValue(word.charAt(i));//умножаем предыдущий order на 10, если в строке больше 9 слов
                }
            }
            orderedWords[order - 1] = word.replaceAll("[0-9]", "");//вставляем слово в массив, вычтя из order единицу, убрав из слова числа
        }
        
        return String.join(" ", orderedWords);//возвращаем массив, соединённый через пробелы
    }

    //10 увеличение одного числа цифрами из  +
    public static int switchNums(int num1, int num2) {
        StringBuilder resultString = new StringBuilder();//будем создавать строку через StringBuilder
        for(int i = 0;i<String.valueOf(num2).length();i++){ //проходим по num2
            char curChar = String.valueOf(num2).charAt(i);
            int curInt = Integer.parseInt(Character.toString(curChar));

            char maxDigit = '0'; // Переменная для хранения максимальной цифры из num1

            for (int j = 0; j < String.valueOf(num1).length(); j++) {//ищем максимальную цифру в num1
                char currentChar = String.valueOf(num1).charAt(j);
                int currentDigit = Character.getNumericValue(currentChar);
                if (currentDigit > Character.getNumericValue(maxDigit)) {
                    maxDigit = currentChar;
                }
            }
            //проверяем больше ли она, чем та что в num2, если нет, ничего не меняем
            //Если да, заменяем её в num2 и убираем из num1
            if(curInt < Character.getNumericValue(maxDigit)){
                resultString.append(maxDigit);
                num1 = Integer.valueOf(String.valueOf(num1).replaceFirst(String.valueOf(maxDigit), "")); // Удаляем максимальную цифру из строки
            } else {
                resultString.append(curChar);
            }
        }
        return (int) Integer.valueOf(resultString.toString());
    }
}