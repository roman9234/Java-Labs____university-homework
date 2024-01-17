import java.util.ArrayList;
import java.util.List;

public class Primes {
    public static void main(String[] args) { 
        // System.out.println(IsPrime(11));//true
        // System.out.println(IsPrime(93));//false
        // System.out.println(IsPrime(19));//true
        // System.out.println(IsPrime(42));//false
        List<Integer> primes = new ArrayList<>();
        for(int i=2;i<101;i++){
            if(IsPrime(i)){
                primes.add(Integer.valueOf(i));
                System.out.println(i);
            }
        }
    }
    public static boolean IsPrime (int n){
        for(int i = 2;i<n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
