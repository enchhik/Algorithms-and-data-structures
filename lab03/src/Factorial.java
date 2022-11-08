public class Factorial {

    //факториал N! чисел
    public static int cycleExecute(int count) {
        int product = 1;

        for (int i = 1; i <= count; i++)
            product *= i;

        return product;
    }

    public static int recursionExecute(int count) {
        if (count == 1) {
            return 1;
        }
        return count * recursionExecute(count - 1);
    }

}
