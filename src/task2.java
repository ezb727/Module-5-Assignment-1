// ezb727
public class task2 {
    public static void main(String[] args) {
        System.out.println(sumMultiplesOf7(1, 50));
    }

    // Returns the inclusive sum of multiples of 7 between the two bounds.
    public static long sumMultiplesOf7(int n1, int n2) {
        long lower = Math.min((long) n1, n2);
        long upper = Math.max((long) n1, n2);
        long firstMultiple = lower + Math.floorMod(-lower, 7);
        return sumMultiplesOf7(firstMultiple, upper);
    }

    // Adds the current multiple and recursively sums the next one.
    private static long sumMultiplesOf7(long current, long upper) {
        // No multiples remain once the current value passes the upper bound.
        if (current > upper) {
            return 0;
        }
        return current + sumMultiplesOf7(current + 7, upper);
    }
}
