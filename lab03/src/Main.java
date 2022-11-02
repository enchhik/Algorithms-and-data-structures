public class Main {

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        Fibonacci fib = new Fibonacci();
        RecursionSumDigits sumDigits = new RecursionSumDigits();
        RecursionSumOfNum sumOfNum = new RecursionSumOfNum();

        int n1 = 12;
        int n2 = 5;

        int n = 4;

        int a = fact.cycleExecute(n);
        int b = fact.recursionExecute(n);

        System.out.println(n + "!");

        assert a == b : "different values";

        System.out.println(a);
        System.out.println(b);

        System.out.println();

        int c = fib.cycleExecute(n);
        int d = fib.recursionExecute(n);

        System.out.println("Fibonacci: " + n);

        assert c == d : "different values";

        System.out.println(c);
        System.out.println(d);

        System.out.println();

        int sd = sumDigits.execute(n);

        System.out.println("sum of digits of number: " + n);
        System.out.println(sd);

        System.out.println();

        int sn = sumOfNum.execute(n1, n2);

        System.out.println(n1 + " + " + n2 + " = " + sn);

    }
}