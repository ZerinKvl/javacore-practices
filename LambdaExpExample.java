package streamsamples;

public class LambdaExpExample {

    public static void main(String[] args) {

        LambdaExpExample obj = new LambdaExpExample();
        PerformOperation isOdd = number -> {
            if (number % 2 == 0)
                return false;
            else
                return true;
        };
        PerformOperation isPrime = number -> {
            int i;
            int m = number / 2;
            if (number == 0 || number == 1) {
                return false;
            } else {
                for (i = 2; i <= m; i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        };
        PerformOperation isPalindrome = number -> {
            return Integer.toString(number).equals(new StringBuilder(Integer.toString(number)).reverse().toString());
        };

        System.out.println(obj.checker(7, isOdd)); // prints true
        System.out.println(obj.checker(0, isPrime)); // prints false
        System.out.println(obj.checker(12321, isPalindrome));// prints true

    }

    interface PerformOperation {
        boolean operation(int number);

    }

    private boolean checker(int num, PerformOperation operationType) {
        return operationType.operation(num);
    }
}
