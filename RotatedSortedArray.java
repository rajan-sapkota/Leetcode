public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 0));
    }

    static int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int mid = (s + e) / 2;
            if (nums[s] < nums[mid]) {
                s = mid;
            } else {
                e = mid;
            }
        }
        int pivot = s;
        int start = 0;
        while (start <= pivot) {
            int mid = (start + pivot) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                pivot = mid - 1;
            }
        }
        int start2 = s + 1;
        e = nums.length - 1;
        while (start2 <= e) {
            int mid = (start2 + e) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start2 = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;

    }
}