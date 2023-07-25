public class SortedTwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = { -1, -1 };
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                arr[0] = ++start;
                arr[1] = ++end;
                return arr;
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return arr;
    }
}