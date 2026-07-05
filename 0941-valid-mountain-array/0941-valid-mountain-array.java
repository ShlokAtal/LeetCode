public class Solution {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }

        int i = 0;
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }

        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] test1 = {0, 3, 2, 1};
        int[] test2 = {2, 1};
        int[] test3 = {3, 5, 5};

        System.out.println(validMountainArray(test1)); 
        System.out.println(validMountainArray(test2)); 
        System.out.println(validMountainArray(test3));
    }
}