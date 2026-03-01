public class Exercise {

    public boolean calculate(int number) {

        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int digitsCount = countDigits(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += power(digit, digitsCount);
            number /= 10;
        }

        return sum == originalNumber;
    }

    private int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    private int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}