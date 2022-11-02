package lesson6_hw;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = getSet(nums1);
        Set<Integer> set2 = getSet(nums2);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> distinct1 = getDistinct(set1, set2);
        List<Integer> distinct2 = getDistinct(set2, set1);
        result.add(distinct1);
        result.add(distinct2);
        return result;
    }

    private Set<Integer> getSet(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        return set;
    }

    private List<Integer> getDistinct(Set<Integer> set1, Set<Integer> set2) {
        List<Integer> distinct1 = new ArrayList<>();

        for (Integer n1 : set1) {
            if (!set2.contains(n1)) {
                distinct1.add(n1);
            }
        }
        return distinct1;
    }
}
