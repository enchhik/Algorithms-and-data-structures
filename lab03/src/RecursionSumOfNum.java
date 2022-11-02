public class RecursionSumOfNum {

    public static int execute(int a, int b) {

        if (a == 0 && b == 0) {
            return 0;
        }

        if (a == 0)
            return b;

        if (b == 0)
            return a;

        return execute(a+1, b-1);
    }
}
