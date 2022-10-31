public class Main {

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        Fibonacci fib = new Fibonacci();

        int n = 4;

        int a = fact.cycleExecute(n);
        int b = fact.recursionExecute(n);

        System.out.println(n + "!");

        assert a == b : "different values";

        System.out.println(n);
        System.out.println(a);
        System.out.println(b);

        System.out.println();

        int c = fib.cycleExecute(n);
        int d = fib.recursionExecute(n);

        System.out.println("Fibonacci: " + n);

        assert c == d : "different values";

        System.out.println(n);
        System.out.println(c);
        System.out.println(d);
    }
}