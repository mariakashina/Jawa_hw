package lesson2_hw;

class Solution {
    List<List<Integer>> combination;

    public List<List<Integer>> combine(int n, int k) {
        combination = new ArrayList<>();
        combiner(n, k, 1, new ArrayList<>());
        return combination;
    }

    private void combiner(int n, int k, int index, List<Integer> part) {

        if (part.size() == k) {
            combination.add(new ArrayList<>(part));
            return;
        }

        for (int i = index; i <= n; i++) {
            part.add(i);
            combiner(n, k, i + 1, part);
            part.remove(part.size() - 1);
        }
    }
}
