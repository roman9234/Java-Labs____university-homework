import java.util.regex.Matcher;import java.util.regex.Pattern;

public class Lab5{

    public static void main(String[] args) {

        System.out.println();

        find_number("bgfgfgg7.9fr88deded9,098deded54");
        find_number("53.98 53,98 668 123,2 098");

        password_checker("Abcdefg00000008");//+ 16 символов
        password_checker("A0000_00");//- есть не подходящий символ
        password_checker("A0000");//- меньше 8 символов
        password_checker("23dhfre932");//- нет заглавной буквы
        password_checker("adfd_df");//- маленькая длина, нет заглавной буквы, цифр, есть неподходящи символ

        hyper_converter("""
            Длинный текст с ссылкой http://example.com и другими текстами.
            Содержит вариант https://example.com
            либо http://bruh.ru
        """);

        ip_checker("10.122.13.212");//+
        ip_checker("231.23.12.321");//-
        ip_checker("10.122.13.212.");//-
        ip_checker("10.122.13");//-
        ip_checker("10.022.13.212");//-

        find_word("B", "hello, beeee, Bruh, BBBBBBBB leee", true);
        find_word("B", "hello, beeee, Bruh, BBBBBBBB leee", false);
        find_word("q", "qwerty QWerty", true);
        find_word("q", "qwerty QWerty", false);

    }


    //1 - поиск чисел в тексте
    public static void find_number(String input_text) {

        System.out.println(input_text);
        Pattern pattern = Pattern.compile(//выводит всё что похоже на настоящее число
            "(\\d+\\.\\d+|\\d+\\,\\d+|[1-9]+[0-9]+|[1-9])");
        Matcher matcher = pattern.matcher(input_text);
        try{

            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        } catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println();
    }

    //2 - проверка корректности ввода пароля
    /*
     *  Пароль должен состоять из латинских букв и цифр, быть
        длиной от 8 до 16 символов
        и содержать хотя бы одну заглавную букву и одну цифру
     */
    public static void password_checker(String input_text){
        //функция выводит всё, что нужно исправить в пароле

        System.out.println(input_text);
        boolean incorrect = false;
        try{

            //проверка длины 8-16 символов
            String length_pattern = ".{8,16}";
            boolean length_b = input_text.matches(length_pattern);
            if(!length_b){
                System.out.println("Invalid password: the length is less than 8 or more than 16. Current length is " + input_text.length());
                incorrect = true;
            }

            //проверка на отсутствие неподходящих символов
            String symbols_pattern = "[A-Za-z0-9]*";
            boolean symb_b = input_text.matches(symbols_pattern);
            if(!symb_b){
                System.out.println("Invalid password: the password must contain only Latin letters and numbers");
                incorrect = true;
            }

            //проверка на хотя бы 1 заглавную букву
            if(!Pattern.compile("[A-Z]").matcher(input_text).find()){
                System.out.println("Invalid password: the string must contain at least one uppercase Latin letter");
                incorrect = true;
            }

            //проверка на наличие хотя бы 1 цифры
            if(!Pattern.compile("[0-9]").matcher(input_text).find()){
                System.out.println("Invalid password: the string must contain at least one digit");
                incorrect = true;
            }
            
            if(!incorrect){
                System.out.println("Valid password");
            }
            System.out.println();

        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

    }



    //3 -  замена всех ссылок на гиперссылки
    public static void hyper_converter(String input_string){
        
        System.out.println(input_string);

        try{
            //здесь много экспериментов с паттернами. 

            // Pattern pattern = Pattern.compile("(https?://\\S+\\b)");//regex
            // Pattern pattern = Pattern.compile("(https?://\S+(?!,\s|\b))");//regex

            Pattern pattern = Pattern.compile("(https?://\\S+)");//regex: http либо https, и затем все символы до пробела/запятой/точки
            // Pattern pattern = Pattern.compile("(https?://\\S+((?!\\.$)|(?!,$)|(?!$)))");//regex: http либо https, и затем все символы до пробела/запятой/точки
            // Замена
            Matcher matcher = pattern.matcher(input_string);
            while (matcher.find()) {
                String link = matcher.group(1);
                String hyperlink = "<a href=\"" + link + "\">" + link + "</a>";
                input_string = input_string.replace(link, hyperlink);
            }

        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println(input_string);
    }

    //4 - проверка корректности ввода IP-адреса
    public static void ip_checker(String input_string){

        System.out.println(input_string);
        boolean allgood = false;

        try{
        String pattern = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
        //все варианты + точка и продолжение, либо окончание строки без точки. и так 4 раза
        allgood = input_string.matches(pattern);
        } catch(Exception e){
            System.out.println(e);
            return;
        }

        if(allgood) {
            System.out.println("IP correct");
            System.out.println();
            return;
        }

        System.out.println("IP incorrect");
        System.out.println();
    }


    //5 - поиск всех слов, начинающихся с заданной буквы
    public static void find_word(String input_char, String input_text, boolean lower_and_upper_cases) {

        String pattern1, pattern2;

        System.out.println(input_char + " " + String.valueOf(lower_and_upper_cases) + "\n" + input_text);
        pattern1 = "\\b" + input_char + "\\w+\\b";
        if(lower_and_upper_cases){
            // если ищем слова и с маленькой, и с большой буквы
            if(input_char.toLowerCase() == input_char){
                finder_helper(pattern1, input_text);
                input_char = input_char.toUpperCase();
                pattern2 = "\\b" + input_char + "\\w+\\b";
                finder_helper(pattern2, input_text);
            } else {
                finder_helper(pattern1, input_text);
                input_char = input_char.toLowerCase();
                pattern2 = "\\b" + input_char + "\\w+\\b";
                finder_helper(pattern2, input_text);
            }

        } else{
            finder_helper(pattern1, input_text);
        }
        System.out.println();
    }

    public static void finder_helper(String pattern_String, String input_text){
        //хелпер ищет слова и выводит их в консоль.

        Pattern pattern = Pattern.compile(pattern_String);
        Matcher matcher = pattern.matcher(input_text);
        try{
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }






}