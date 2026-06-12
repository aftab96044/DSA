
public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 27, 31, 35, 42, 48, 54, 61, 73, 89};

        int target = 42;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index " + mid);
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Not found");
    }
}