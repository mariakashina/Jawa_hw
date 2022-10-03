package lesson1_hw;

class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
                continue;
            }
            int start = s.lastIndexOf(' ', i);
            str.append(' ');
            str.append(s.substring(start + 1, i + 1));
            i = start - 1;
        }
        if (str.length() > 0) {
            str.deleteCharAt(0);
        }

        return str.toString();
    }
}
