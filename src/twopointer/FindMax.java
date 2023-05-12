package twopointer;

public class FindMax {
    public static void main(String[] args) {

        int[] arr = {1, 4, 56, 88, 9, 44, 666};
        int left = 0;
        int right = arr.length - 1;
        int max = Integer.MIN_VALUE;
        while (left <= right) {
            if (arr[left] > max) {
                max = arr[left];
            }
            if (arr[right] > max) {
                max = arr[right];
            }

            left++;
            right--;
        }

        System.out.printf("max: " + max);
    }

    private static int findMax(int... arr) {
        int right = 0;
        int left = 0;
        int max = Integer.MIN_VALUE;
        while (left <= right) {
            if (arr[left] > max) {
                max = arr[left];
            }
            if (arr[right] > max) {
                max = arr[right];
            }

            left++;
            right--;
        }

        return max;
    }

}
