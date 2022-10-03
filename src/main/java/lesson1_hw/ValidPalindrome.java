package lesson1_hw;

class Solution {
    public boolean isPalindrome(String s) {
        int n = 0;
        int m = s.length() - 1;

        while (n < m) {

            while (n < m && !Character.isLetterOrDigit(s.charAt(n))) {
                n++;
            }

            while (m > n && !Character.isLetterOrDigit(s.charAt(m))) {
                m--;
            }
            if (n >= m) {
                break;
            }
            if (Character.toLowerCase(s.charAt(n)) == Character.toLowerCase(s.charAt(m))) {
                n++;
                m--;
            } else {

                return false;
            }
        }

        return true;
    }
}
