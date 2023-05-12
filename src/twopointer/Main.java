package twopointer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 678, 798, 654, 88, 99, 100};
        int result = findFirstGreaterThan(100, arr);
        System.out.printf("result : " + result);
        System.out.println("\n----------------");

        String string = "abc-99-cbcbnmvzcxz";
        int count = longestSubstring(string);
        System.out.println("count: "+count);

    }

    private static int findFirstGreaterThan(int x, int... arr) {
        int left = 0;
        int right = arr.length - 1;

        Arrays.sort(arr);
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > x) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }


    private static int findFirstGreaterThanSecond(int x, int... arr) {
        int result = -1;
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > x) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    /**
        Tim kiếm chuổi con có độ dài lớn nhất và tất cả đều có độ dài là duy nhất .
     */
    private static int longestSubstring(String string) {
        int[] count = new int[128];
        int left = 0;
        int right = 0;
        int maxLength = 0;
        while (right < string.length()) {

            char c = string.charAt(right);
            count[c]++;
            while (count[c] > 1) {
                count[string.charAt(left)]--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
