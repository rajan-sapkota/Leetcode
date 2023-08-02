
public class SumOfArray {
    public static void main(String[] args) {
        int[] arr1 = { 9, 9, 9, 9, 9, 9, 9 };
        int[] arr2 = { 9, 9, 9, 9 };

        adder(arr1, arr2);
    }

    static int[] adder(int[] num1, int[] num2) {
        int nums1 = 0;
        int nums2 = 0;
        for (int i = num1.length - 1; i >= 0; i--) {
            nums1 = nums1 * 10 + num1[i];
        }

        for (int i = num2.length - 1; i >= 0; i--) {
            nums2 = nums2 * 10 + num2[i];
        }
        System.out.println(nums1 + " + " + nums2);
        int result = (nums1 + nums2);
        System.out.println(result);
        int[] ans = new int[String.valueOf(result).length()];
        int i = 0;
        while (result > 0) {
            ans[i] = result % 10;
            System.out.print(ans[i] + " ");
            i++;
            result = result / 10;
        }

        return ans;
    }
}
