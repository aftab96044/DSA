public class BinarySearchRecursive {

    static int binarySearch(int[] arr, int low, int high, int target) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, high, target);
        } else {
            return binarySearch(arr, low, mid - 1, target);
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 12, 16, 23, 27, 31, 35, 42, 48, 54, 61, 73, 89};

        int target = 42;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}