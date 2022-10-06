package lesson2_hw;

class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] A, int left, int right) {
        if (left >= right)
            return;

        final int middle = (left + right) / 2;
        mergeSort(A, left, middle);
        mergeSort(A, middle + 1, right);
        merge(A, left, middle, right);
    }

    private void merge(int[] A, int left, int middle, int right) {
        int[] sorted = new int[right - left + 1];
        int k = 0;
        int i = left;
        int j = middle + 1;

        while (i <= middle && j <= right)
            if (A[i] < A[j])
                sorted[k++] = A[i++];
            else
                sorted[k++] = A[j++];

        while (i <= middle)
            sorted[k++] = A[i++];

        while (j <= right)
            sorted[k++] = A[j++];

        System.arraycopy(sorted, 0, A, left, sorted.length);
    }
}
