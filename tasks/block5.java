import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class block5 {
    public static void main(String[] args){

        // 1
        System.out.println();
        System.out.println("1 задание");
        System.out.println();

        System.out.println(sameLetterPattern("ABAB", "CDCD")); // true
        System.out.println(sameLetterPattern("ABCBA", "BCDCB")); // true
        System.out.println(sameLetterPattern("FFGG", "CDCD")); // false
        System.out.println(sameLetterPattern("FFFF", "ABCD")); // false
        System.out.println(sameLetterPattern("ABAB", "YZYZ")); // true


        // 2
        System.out.println();
        System.out.println("2 задание");
        System.out.println();

        //тестовые задания

        // System.out.println(spiderVsFly("A1", "A2"));// цель на одной линии
        // System.out.println(spiderVsFly("G4", "G2"));
        // System.out.println(spiderVsFly("D4", "D1"));

        // System.out.println();

        // System.out.println(spiderVsFly("A0", "E2"));// начинаем в центре
        // System.out.println(spiderVsFly("A0", "C3"));

        // System.out.println();

        // System.out.println(spiderVsFly("H4", "A0"));//цель - центр паутины
        // System.out.println(spiderVsFly("G2", "F0"));//F0 - неправильное обозначение центра паутины. Но оно тоже работает

        // System.out.println();

        // System.out.println(spiderVsFly("H3", "D2"));// цель с прротивоположной стороны
        // System.out.println(spiderVsFly("A4", "E4"));
        // System.out.println(spiderVsFly("B3", "F1"));

        System.out.println();
        // путь к цели не по прямой (из примеров). Здесь алгоритм сложнее, чем в предыдущих случаях. Но он такой же надёжный и точный
        System.out.println(spiderVsFly("H3", "E2"));// "H3-H2-H1-A0-E1-E2"
        System.out.println(spiderVsFly("A4", "B2"));// "A4-A3-A2-B2"
        System.out.println(spiderVsFly("A4", "C2"));// "A4-A3-A2-B2-C2"


        // 3
        System.out.println();
        System.out.println("3 задание");
        System.out.println();

        System.out.println(digitsCount(4666));// 4
        System.out.println(digitsCount(544)); // 3 
        System.out.println(digitsCount(121317));// 6 
        System.out.println(digitsCount(0));// 1 
        System.out.println(digitsCount(12345));// 5
        System.out.println(digitsCount(1289396387328L));// 13

        //4
        System.out.println();
        System.out.println("4 задание");
        System.out.println();

        List<String> guessedWords1 = new ArrayList<>();
        guessedWords1.add("cat");
        guessedWords1.add("create");
        guessedWords1.add("sat");
        System.out.println(totalPoints(guessedWords1, "caster")); // 2

        List<String> guessedWords2 = new ArrayList<>();
        guessedWords2.add("trance");
        guessedWords2.add("recant");
        System.out.println(totalPoints(guessedWords2, "recant")); // 108

        List<String> guessedWords3 = new ArrayList<>();
        guessedWords3.add("dote");
        guessedWords3.add("dotes");
        guessedWords3.add("toes");
        guessedWords3.add("set");
        guessedWords3.add("dot");
        guessedWords3.add("dots");
        guessedWords3.add("sted");
        System.out.println(totalPoints(guessedWords3, "tossed")); // 13


        // 5
        System.out.println();
        System.out.println("5 задание");
        System.out.println();

        int[] arr1 = {1, 2, 3, 4, 5};
        List<int[]> result1 = sumsUp(arr1);
        for (int[] pair : result1) {
            System.out.println(Arrays.toString(pair));}// [[3, 5]] 
        System.out.println();
            int[] arr2 = {1, 2, 3, 7, 9};
        List<int[]> result2 = sumsUp(arr2);
        for (int[] pair : result2) {
            System.out.println(Arrays.toString(pair));}// [[1, 7]] 
        System.out.println();
            int[] arr3 = {10, 9, 7, 2, 8};
        List<int[]> result3 = sumsUp(arr3);
        for (int[] pair : result3) {
            System.out.println(Arrays.toString(pair));}// [] 
        System.out.println();
            int[] arr4 = {1, 6, 5, 4, 8, 2, 3, 7};
        List<int[]> result4 = sumsUp(arr4);
        for (int[] pair : result4) {
            System.out.println(Arrays.toString(pair));}// [[2, 6], [3, 5], [1, 7]]


        // 6
        System.out.println();
        System.out.println("6 задание");
        System.out.println();

        String[] grades1 = {"95%", "83%", "90%", "87%", "88%", "93%"};
        System.out.println(takeDownAverage(grades1)); // 54%
        String[] grades2 = {"10%"};
        System.out.println(takeDownAverage(grades2)); // 0%
        String[] grades3 = {"53%", "79%"};
        System.out.println(takeDownAverage(grades3)); // 51%


        // 7
        System.out.println();
        System.out.println("7 задание");
        System.out.println();

        String encodedMessage = caesarCipher("encode", "HELLO WORLD", 3);
        System.out.println(encodedMessage); // KHOOR ZRUOG

        String decodedMessage = caesarCipher("decode", "EPQSWX PEWX XEWO!", 4);
        System.out.println(decodedMessage); // ALMOST LAST TASK!


        // 8
        System.out.println();
        System.out.println("8 задание");
        System.out.println();

        System.out.println(setSetup(5, 3));// 60 
        System.out.println(setSetup(7, 3));// 210


        // 9
        System.out.println();
        System.out.println("9 задание");
        System.out.println();

        System.out.println(timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra"));// "2011-4-2 17:23"
        // Can be a new day.
        System.out.println(timeDifference("London", "July 31, 1983 23:01", "Rome"));// "1983-8-1 00:01"
        // Can be a new month.
        System.out.println(timeDifference("New York", "December 31, 1970 13:40", "Beijing"));// "1971-1-1 02:40"
        // Can be a new year.


        // 10
        System.out.println();
        System.out.println("10 задание");
        System.out.println();

        System.out.println(isNew(3));// true 
        System.out.println(isNew(30));// true 
        System.out.println(isNew(321));// false 
        System.out.println(isNew(123));// true


    }


    // 1 - одинаковый паттерн
    public static boolean sameLetterPattern(String str1, String str2) {
        //проверка введённых данных
        if (str1.length() != str2.length()) {
            return false;
        }
        
        int n = str1.length();
        //2 массива. 1 позиция - изначальная буква. далее - отступ от этой буквы в кодировке.
        // все значения в массиве кроме первого должны совпадать
        int[] indexes1 = new int[n];
        int[] indexes2 = new int[n];

        indexes1[0] = str1.charAt(0) - 'A';
        indexes2[0] = str2.charAt(0) - 'A';
        
        for (int i = 1; i < n; i++) {
            //вычитаем номер буквы в кодиревке
            int char1 = str1.charAt(i) - 'A';
            int char2 = str2.charAt(i) - 'A';
            
            indexes1[i] = indexes1[0] - char1;
            indexes2[i] = indexes2[0] - char2;
        }
        
        for (int i = 1; i < n; i++) {
            if (indexes1[i] != indexes2[i]) {
                return false;
            }
        }
        return true;
    }

    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    public static final int E = 4;
    public static final int F = -3;
    public static final int G = -2;
    public static final int H = -1;

    // 2
    public static String spiderVsFly(String spider, String fly) {
        // Разбиваем координаты паука и мухи на компоненты
        char startLineChar = spider.charAt(0);
        int startRadial = Character.getNumericValue(spider.charAt(1));
        Integer startLine;
        switch (startLineChar) {
            case 'A': startLine = 0;  break;
            case 'B': startLine = 1;  break;
            case 'C': startLine = 2;  break;
            case 'D': startLine = 3;  break;
            case 'E': startLine = 4;  break;
            case 'F': startLine = -3; break;
            case 'G': startLine = -2; break;
            case 'H': startLine = -1; break;
            default:
                return "error";
        }
        char targetLineChar = fly.charAt(0);
        int targetRadial = Character.getNumericValue(fly.charAt(1));
        Integer targetLine;
        switch (targetLineChar) {
            case 'A': targetLine = 0;  break;
            case 'B': targetLine = 1;  break;
            case 'C': targetLine = 2;  break;
            case 'D': targetLine = 3;  break;
            case 'E': targetLine = 4;  break;
            case 'F': targetLine = -3; break;
            case 'G': targetLine = -2; break;
            case 'H': targetLine = -1; break;
            default:
                return "error";
        }
        
        //ссылочные типы
        List<Float> result_Len = new ArrayList<Float>();
        List<String> result_Str = new ArrayList<String>();
        result_Len.add((float)1000000.0);
        result_Str.add("");

        // String startPath = String.valueOf(startLineChar) + startRadial;
        String startPath = "";

        spiderBrain(startLine,startRadial,targetLine,targetRadial,startPath,(float)0.0,result_Str, result_Len, 0);

        return "путь от " + startLineChar + startRadial + " до " + targetLineChar + targetRadial + " выглядит так:\n"
         + result_Str.get(0) + " расстояние: " + result_Len.get(0);
    }

    // public static final int A = 0;
    // public static final int B = 1;
    // public static final int C = 2;
    // public static final int D = 3;
    // public static final int E = 4;
    // public static final int F = -3;
    // public static final int G = -2;
    // public static final int H = -1;

    // Integer curRes = result.get(0);
    //         curRes = curRes>curLen?curLen:curRes;
    //         result.set(0,curRes);
    //         return;

    //States:
    // 0 - начало поиска пути
    // 1 - цель с противополодной стороны
    // 2 - перебор вариантов - движение вниз и по часовой
    // 3 - перебор вариантов - движение вниз и против часовой
    // 4 - движение по линии к цели (нет прямого функционала)
    // 5 - движение с пересечением центра (нет прямого функционала)
    // 6 - движение в бок по часовой
    // 7 - движение в бок против часовой
    //
    // line - ось на которой находимся
    // radial - расстояние до центра

    // рекурсивная функция поиска пути
    public static void spiderBrain(int currentLine, int currentRadial, int targetLine, int targetRadial, 
                                        String path, float distance, List<String> result_Str, List<Float> result_Len, int state) {

        if (state == 0) {//в начале пути не надо ставить дефис
            path += result_Str.get(0) + makePathToString(currentLine, currentRadial);
        } else {
            path += "-" + makePathToString(currentLine, currentRadial);}

        //если цель достигнута, проверяем, кратчайший ли это путь
        if((currentLine == targetLine && currentRadial == targetRadial) || (currentRadial == 0 && targetRadial == 0)){
            if (distance < result_Len.get(0)) {
                result_Len.set(0, distance);
                result_Str.set(0, path);
            }
            return;
        }
        //если мы в центре паутины, то идём на нужную нам линию
        if (currentRadial == 0 && targetRadial != 0) {
            spiderBrain(targetLine, 1, targetLine, targetRadial, path, distance + 1, result_Str, result_Len, 4);
            return;
        }

        //если мы на одной линии с целью
        //либо цель - центр паутины
        //либо после нескольких шагов в бок мы дошли до нужной линии (в IF это не указано, но условие сработает в любом случае)
        //то - идём прямо к цели
        if (currentLine == targetLine || targetRadial == 0) {
            if (currentRadial < targetRadial){
                spiderBrain(currentLine, currentRadial + 1, targetLine, targetRadial, path, distance + 1, result_Str, result_Len, 4);
                return;
            }
            else if (currentRadial > targetRadial || targetRadial == 0) {
                spiderBrain(currentLine, currentRadial - 1, targetLine, targetRadial, path, distance + 1, result_Str, result_Len, 4);
                return;
            }
        }

        // если цель с противоположной стороны
        //то - идём сквозь центр к цели
        if(Math.abs(currentLine) + Math.abs(targetLine) == 4){
            spiderBrain(currentLine, currentRadial - 1, targetLine, targetRadial, path, distance + 1, result_Str, result_Len, 5);
            return;
        }

        //если нет очевидного и прямого пути к цели, начинаем процесс перебора вариантов

        // 2 варианта действий - идти вниз, либо в бок. В разных ситациях разный выбор может быть выгоднее
        // после каждого шага вниз мы рассматриваем 2 случая - продолжить идти вниз, либо пойти вбок
        // если мы пошли вбок, вниз спускаться уже никогда не будем. Это регулируется переменной state
        // в бок идём до момента достижения нужной линии. Когда её достигли, движение продолжится по алгоритму, прописанному выше

        // 2 - по часовой, 3 - против часовой (вниз)
        // 6 - по часовой, 7 - против часовой (в бок)
        if (state == 0) {//если это начало цикла, и мы попали в эту часть алгоритма в первый раз, 
            state = chooseDirection(currentLine, targetLine);
        }

        if (state != 6 && state!= 7) {//если мы ещё не сделали шаг в бок, идём вниз (но не отсекаем вариант с шагом в бок)
            spiderBrain(currentLine, currentRadial - 1, targetLine, targetRadial, path, distance + 1, result_Str, result_Len, state);
        }

        //начинаем движение в бок. После начала такого движения, мы не остановимся пока не дойдём до нужной линии
        if (state == 2 || state == 3) {
            state = state==2?6:7;
        }
        int dest = getDestination(currentLine, state);
        float newDist = distance + calculateDistance(currentRadial);
        spiderBrain(dest, currentRadial, targetLine, targetRadial, path, newDist, result_Str, result_Len, state);
        return;
    }

    //для правильного вывода ответа нужно преобразовать числовое значение текущей линии в символьное
    public static String makePathToString(int line, int radial){
        // если дошли до центра, пишем A0
        if (radial == 0){
            return "A" + 0;
        }
        switch (line) {
            case 0: return "A"+radial;
            case 1: return "B"+radial;
            case 2: return "C"+radial;
            case 3: return "D"+radial;
            case 4: return "E"+radial;
            case -3: return "F"+radial;
            case -2: return "G"+radial;
            case -1: return "H"+radial;
            default:
                return line + "error" + radial;
        }
    }

    //если путь не очевиден, мы для начала выбираем направление - по или против часовой стрелки
    // 2 - по часовой
    // 3 - против часовой
    public static int chooseDirection(int currentLine, int targetLine) {
        if(Math.abs(currentLine) + Math.abs(targetLine) == 4){
            System.out.println("error" + currentLine + targetLine);
            return 2;
        }
        switch (currentLine) {
            case -3:
                if (Arrays.asList(-2, -1, 0).contains(targetLine)) {
                    return 2;} else {return 3;}
            case -2:
                if (Arrays.asList(-1, 0, 1).contains(targetLine)) {
                    return 2;} else {return 3;}
            case -1:
                if (Arrays.asList(0,1,2).contains(targetLine)) {
                    return 2;} else {return 3;}
            case -0:
                if (Arrays.asList(1,2,3).contains(targetLine)) {
                    return 2;} else {return 3;}
            case 1:
                if (Arrays.asList(2,3,4).contains(targetLine)) {
                    return 2;} else {return 3;}
            case 2:
                if (Arrays.asList(3,4,-3).contains(targetLine)) {
                    return 2;} else {return 3;}
            case 3:
                if (Arrays.asList(4,-3,-2).contains(targetLine)) {
                    return 2;} else {return 3;}
            case 4:
                if (Arrays.asList(-3,-2,-1).contains(targetLine)) {
                    return 2;} else {return 3;}
        
            default:
                System.out.println("error" + currentLine + targetLine);
                return 2;
        }
    }

    //при движении в бок расстояние от одной точки до другой зависит от расстояния до центра паутины
    public static float calculateDistance(int currentRadial){
        if (currentRadial == 0){
            System.out.println("error");
            return 0;
        }
        switch (currentRadial) {//здесь расстояние - основание равнобедренного треугольника
            case 1:return (float) 0.77;
            case 2:return (float) 1.54;
            case 3:return (float) 2.31;
            case 4:return (float) 3.08;
        
            default:
            System.out.println("error");
            return (float) 0.0;
        }
    }

    //так как у нас значения линий A-H от -3 до 4, при переходе из -3 или 4 нужно задать правильный номер линии
    // 6 - по часовой
    // 7 - против часовой
    public static int getDestination(int currentLine, int status){
        switch (currentLine) {
            case -3: return status==6?-2:4;
            case 4: return status==6?-3:3;
            default:
                return status==6?currentLine+1:currentLine-1;
        }
    }

    // 3 рекурсивная функция - кол-во цифр в числе
    // на входе long так как в примерах есть такое число
    public static int digitsCount(long number) {
        // так как в последний момент число меньше 10 (0-9), мы можем взять это как условие конца рекурсии
        if (number < 10) {
            return 1;
        } else {
        // если чесло больше 10, пррво на 10 (целочисленное деление) и рекурсируем
            return 1 + digitsCount(number / 10);
        }
    }


    // 4 игра в угадывание слов
    public static int totalPoints(List<String> guessedWords, String decryptedWord) {
        int totalPoints = 0;

        //по сути здесь 2 операции - проверка на правильность отгаданного слова + подсчёт отчков
        for (String word : guessedWords) {
            if (isValidWord(word, decryptedWord)) {
                totalPoints += getPoints(word);
            }
        }

        return totalPoints;
    }

    private static boolean isValidWord(String word, String decryptedWord) {
        //алфавитный массив
        int[] freq = new int[26];

        //на позициях массива будет кол-во букв с соответствующим номером
        for (char c : decryptedWord.toCharArray()) {
            // стандарт кодирования знаков не начинает отсчёт строчных букв с 0, поэтому надо вычесть код буквы 'a'
            freq[c - 'a']++;
        }

        //проверяем, нет ли в отгаданном слове лишних букв
        for (char c : word.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    private static int getPoints(String word) {
        int length = word.length();

        // если всё верно, подсчитываем очки
        if (length == 3) {
            return 1;
        } else if (length == 4) {
            return 2;
        } else if (length == 5) {
            return 3;
        } else if (length == 6) {
            return 54;
        }

        return 0;
    }


    // 5 - пары в сумме = 8 + кринжовая сортировка
    // из условия не понятно как сортировка должна работать, поэтому её нет
    public static List<int[]> sumsUp(int[] array) {
        List<int[]> pairs = new ArrayList<>();
        Arrays.sort(array); // Сортируем массив по возрастанию
        
        int length = array.length;
        
        // просто проходимся по массиву и ищем подходящие пары
        for(int i = 0; i < length - 1; i++) {
            for(int j = i + 1; j < length; j++) {
            int sum = array[i] + array[j];
                if (sum == 8) {
                    int[] pair = {array[i], array[j]};
                    pairs.add(pair);
                }
            }
        }
        return pairs;
    }


    // 6 - снижаем средний балл класса ^_^
    public static String takeDownAverage(String[] grades) {
        //здесь везде float чтобы без ошибок считались значения. Округляем в конце
        float sum = 0;
        float leng = grades.length;
        //вычисляем сумму буллов
        for (String grade : grades) {
            // Удаляем символ процента и преобразуем в целое число
            float value = Integer.parseInt(grade.substring(0, grade.length() - 1));
            sum += value;
        }

        // вычисляем изначальный средний балл
        float average = sum / leng; 
        
        // Вычисляем новый средний балл с учетом снижения на 5%
        // исходя из простых математических вычислений
        /*
         * sum/len = average
         * sum = average*len
         * sum+x = (average-5)*(len+1)
         * x = (average-5)*(len + 1) - sum
         */
        float impostersGrade = (average-5)*(leng+1) - sum;
        int result = (int) Math.round(impostersGrade);
        
        return result + "%";
    }


    // 7 - шифр цезаря (ну хотя бы не Энигма)
    // в условии сказано обрабатывать только верхний регистр
    public static String caesarCipher(String mode, String message, int shift) {
        String result = "";
        // Ограничиваем сдвиг до 26, чтобы избежать ошибок
        shift = shift % 26;

        if (mode.equalsIgnoreCase("encode")) {
            //проходимся по всем символам
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    //меняем только буквы, другие имволы остаются безь изменений
                    ch = (char) (ch + shift);
                    // если символ вышел за границы кодировки букв, возвращаем его туда
                    // если сдвиг очень большой, потребуется несколько итераций
                    while (ch > 'Z') {
                        ch = (char) (ch - 26);
                    }
                }
                result += ch;
            }
        //если режим дешифровки, меняем + и -
        } else if (mode.equalsIgnoreCase("decode")) {
            //здесь всё то же самое, но в обратном порядке
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch - shift);
                    while (ch < 'A') {
                        ch = (char) (ch + 26);
                    }
                }
                result += ch;
            }
        }

        return result;
    }

    // 8 формула размещений без повторений: n! / (n - k)!
    public static int setSetup(int n, int k) {
        // проверка условия
        if (n < k) {
            throw new IllegalArgumentException("n должно быть больше или равно k");
        }
        
        if (k == 0 || k == n) {
            return 1;
        }
        // используем рекурсивную функцию для расчёта факториала
        return factorial(n) / factorial(n - k);
    }
    
    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        
        return num * factorial(num - 1);
    }


    // 9 временная разница
    public static String timeDifference(String cityA, String timestamp, String cityB) {
        /* 
         * Мы будем использовать java.time чтобы не приходилось вручную определять длину месяцев и лет.
         *
         * java.time.LocalDateTime использует внутреннее представление времени в виде числа миллисекунд с начала отсчета
         * 1 января 1970 года 00:00:00 UTC, также известно как Unix timestamp. 
         * Он сохраняет дату и время без учета часового пояса или смещения.
         * 
         * Поэтому наша задача сводится к простым математическим операциям, а также преобразованию форматов
        */

        // Создаем словарь с городами и их смещениями
        Map<String, String> cityOffsets = new HashMap<>();
        cityOffsets.put("Los Angeles", "-08:00");
        cityOffsets.put("New York", "-05:00");
        cityOffsets.put("Caracas", "-04:30");
        cityOffsets.put("Buenos Aires", "-03:00");
        cityOffsets.put("London", "00:00");
        cityOffsets.put("Rome", "+01:00");
        cityOffsets.put("Moscow", "+03:00");
        cityOffsets.put("Tehran", "+03:30");
        cityOffsets.put("New Delhi", "+05:30");
        cityOffsets.put("Beijing", "+08:00");
        cityOffsets.put("Canberra", "+10:00");

        // Парсим LocalDateTime используя DateTimeFormatter. Locale.US объявляет, что мы используем формат США.
        // Это нужно чтобы избежать ошибки, которая возникает если не добавить этот параметр.

        LocalDateTime dateTimeA;
        try {//ловим ошибки, если они есть

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d',' yyyy HH':'mm", Locale.US);
            dateTimeA = LocalDateTime.parse(timestamp, formatter);

        } catch (DateTimeParseException e) {
            System.err.println("Error: " + e.getMessage());
            return "error";
        }

        // Получаем смещение для городов A и B из словаря
        String offsetA = cityOffsets.get(cityA);
        String offsetB = cityOffsets.get(cityB);

        // чтобы вычислить, сколько часов прибавить (либо прибавить со знаком минус) к dateTimeA, нужно из смещения B вычесть смещение A.
        // например London GMT = 0, Moscow GMT = 3. delta_hours = 3-0 = 3.
        // то есть ко времени в лондоне нужно прибавить 3 часа чтобы получить время в Москве
        // также с минутами

        Integer hours_1;
        Integer minutes_1;

        // парсим смещения часов и минут городов A и B
        if (cityA == "London") {//в строке с GMT лондона нет знака + или -, поэтому substring не работает
            hours_1 = 0;
            minutes_1 = 0;
        } else {
            hours_1 = Integer.parseInt(offsetA.substring(0, 3));
            minutes_1 = Integer.parseInt(offsetA.substring(4));
        }

        Integer hours_2;
        Integer minutes_2;

        if (cityB == "London") {
            hours_2 = 0;
            minutes_2 = 0;
        } else {
            hours_2 = Integer.parseInt(offsetB.substring(0, 3));
            minutes_2 = Integer.parseInt(offsetB.substring(4));
        }

        Integer delta_hrs = hours_2 - hours_1; //вычисляем разницу. Если часы нужно прибавить, delta положительная, если вычесть - отрицательная
        Integer delta_mins = minutes_2 - minutes_1;
        
        //поэтому мы прибавляем дельту - знак в ней уже учтён
        LocalDateTime gmtDateTimeB = dateTimeA.plusHours(delta_hrs).plusMinutes(delta_mins);

        // Преобразуем в требуемый формат
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-M-d HH:mm", Locale.US);
        String formattedDateTimeB = gmtDateTimeB.format(outputFormatter);

        return formattedDateTimeB;
    }


    // 10 Новое число – это число, которое не является перестановкой любого меньшего числа
    public static boolean isNew(int number) {
        // чтобы получить минимальное число из цифр, среди которых есть нули,
        // нули нужно ставить после первого по счёту символа (который минимальный из всех кроме 0)
        // пример: 23109 -> 10239
        // 8090340 -> 3000489

        // Преобразуем число в строку
        String strNumber = Integer.toString(number);
        // Преобразуем строку в массив
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < strNumber.length(); i++){
            arr.add(String.valueOf(strNumber.charAt(i)));
        }
        // убираем все нули
        int zeros = 0;
        while (arr.contains("0")) {
            zeros++;
            arr.remove("0");
        }
        // Сортируем массив символов в порядке возрастания
        Collections.sort(arr);
        while (zeros > 0) {
            arr.add(1, "0");
            zeros--;
        }
        // Преобразуем отсортированный массив символов обратно в строку
        String sortedStrNumber = "";
        for(String x : arr) {
            sortedStrNumber += x;
        }
        // Преобразуем отсортированную строку обратно в число
        int sortedNumber = Integer.parseInt(sortedStrNumber);
        // Сравниваем отсортированное число с исходным
        if (sortedNumber == number) {
            return true; // Число является новым
        } else {
            return false; // Число не является новым
        }
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
