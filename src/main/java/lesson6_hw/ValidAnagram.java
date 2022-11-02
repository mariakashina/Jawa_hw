package lesson6_hw;

class Solution {
    public boolean isAnagram(String s, String t) {
        int len_s = s.length();
        int len_t = t.length();
        if (len_s != len_t) {
            return false;
        }
        int[] count = new int[26];

        for (int i = 0; i < len_s; i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int j = 0; j < len_t; j++) {
            count[t.charAt(j) - 'a']--;
            if (count[t.charAt(j) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
