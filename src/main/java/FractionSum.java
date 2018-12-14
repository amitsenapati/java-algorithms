import java.util.HashMap;
import java.util.Map;

/**
 * sum of fraction, with simplified output
 */
public class FractionSum {

    public static void main(String[] args){
        int numer1 = 1;
        int denom1 = 3;
        int numer2 = 3;
        int denom2 = 9;

        //1. find the LCM of the denominators.
        //2. divide the denom of each number by the LCM and multi[ly the result with the numerator
        //3. Update the denom to the LCM
        //4. Sum up the numerator
        //5. Find the GCD of the numerator & denominator
        //6. Divide the numerator and denominator by the GCD

        int commonDenom = denom1 * denom2;
        int tempNumer1 = (commonDenom / denom1) * numer1;
        int tempNumer2 = (commonDenom / denom2) * numer2;

        int resultNumer = tempNumer1 + tempNumer2;
        double gcd = getGcd(resultNumer, commonDenom);

        System.out.println(resultNumer / gcd + "/" + commonDenom / gcd);
    }

    private static double getGcd(int num1, int num2){
        Map<Integer, Integer> pf1 = primeDivisors(num1);
        Map<Integer, Integer> pf2 = primeDivisors(num2);
        double gcd = 1;

        for(Map.Entry<Integer, Integer>  entry : pf1.entrySet()){
            if(pf2.containsKey(entry.getKey())){
                if(entry.getValue() < pf2.get(entry.getValue()))
                    gcd = gcd * Math.pow(entry.getKey(), entry.getValue());
                else
                    gcd = gcd * Math.pow(entry.getKey(), pf2.get(entry.getKey()));
            }
        }
        return gcd;
    }

    private static Map<Integer, Integer> primeDivisors(int number){
        Map<Integer, Integer> result = new HashMap<>();
        while(number > 1){
            int primeFactor = getPrimeFactor(number);
            int count = result.getOrDefault(primeFactor, 0);
            result.put(primeFactor, count + 1);
            number = number / primeFactor;
        }
        return result;
    }

    private static int getPrimeFactor(int number){
        for(int i = 2; i < number; i++){
            if(numberIsPrime(i) && (number % i == 0)){
                return i;
            }
        }
        return number;
    }

    private static boolean numberIsPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
