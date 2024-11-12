public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacciSequence(100);
    }

    public static void printFibonacciSequence(int Num) {
        int a = 0, b = 1, c = 1;

        for (int i = 0; i <= Num; i++) {
            System.out.print(a);
            if (i != Num) {
                System.out.print(", ");
            }
            a = b;
            b = c;
            c = a + b;
        }
    }
}
