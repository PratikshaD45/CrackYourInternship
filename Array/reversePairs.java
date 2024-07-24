class Solution {

    // merge sort
    public static int mergeSort(int arr[], int si, int ei) {
        int count = 0;
        if (si >= ei) {
            return count;
        }
        int mid = si + (ei - si) / 2;
        count += mergeSort(arr, si, mid);
        count += mergeSort(arr, mid + 1, ei);
        count += countPairs(arr, si, mid, ei);
        merge(arr, si, mid, ei);

        return count;
    }

    // count
    public static int countPairs(int arr[], int si, int mid, int ei) {
        int count = 0;
        int right = mid + 1;
        for (int i = si; i <= mid; i++) {
            while (right <= ei && arr[i] > 2L * arr[right]) {
                right++;

            }
            count += right - (mid + 1);
        }
        return count;
    }

    // merge
    public static void merge(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n - 1);

    }
}