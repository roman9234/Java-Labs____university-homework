public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) { 
            String s = args[i];
        if(isPalindrome(s)){
            System.out.println(s);
            System.out.println(isPalindrome(s));
            System.out.println(reverseString(s));}
        }
    }

    public static String reverseString(String inputString){
        String resultString = "";
        for(int i = inputString.length()-1;i>=0;i--){
            resultString += inputString.charAt(i);
        }
        return resultString;
    }

    public static boolean isPalindrome(String s){
        String resultString = reverseString(s);
        return resultString.equals(s);
    }


}