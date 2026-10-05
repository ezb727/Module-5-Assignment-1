// ezb727
public class task3 {
    public static void main(String[] args) {
        int[] values = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch(values, 7));
    }

    // Recursively searches a sorted array and returns the target's index or -1.
    public static int binarySearch(int[] values, int target) {
        if (values == null) {
            return -1;
        }
        return binarySearch(values, target, 0, values.length - 1);
    }

    // Searches only the current low-to-high range.
    private static int binarySearch(int[] values, int target, int low, int high) {
        // An empty range means the target is absent.
        if (low > high) {
            return -1;
        }

        int middle = low + (high - low) / 2;
        if (values[middle] == target) {
            return middle;
        }
        if (target < values[middle]) {
            return binarySearch(values, target, low, middle - 1);
        }
        return binarySearch(values, target, middle + 1, high);
    }
}
