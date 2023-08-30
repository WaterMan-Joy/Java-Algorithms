public class Divisible {
    public static void divisible(int value, int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i ++) {
            sum = value * i;
            System.out.println(sum);
        }
    }
}
