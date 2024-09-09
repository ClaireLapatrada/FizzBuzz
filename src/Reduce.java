public class Reduce {
    public static int reduce(int n) {
        int steps = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
                steps++;
            } else {
                n = n - 1;
                steps++;
            }
        }
        System.out.println(steps);
        return steps;
    }

    public static void main(String[] args) {
        reduce(100);
    }
}
