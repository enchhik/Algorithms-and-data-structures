public class Fibonacci {

    //число Фибоначчи n = n−1 + n−2

    public static int cycleExecute(int count) {
        int a = 0;
        int b = 1;
        int sum = 0;

        if (count == 1)
            return 1;

        for (int i = 2; i <= count; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static int recursionExecute(int count) {
        if (count == 1)
            return 1;
        if (count == 0)
            return 0;

        return recursionExecute(count - 1) + recursionExecute(count - 2);
    }

}
