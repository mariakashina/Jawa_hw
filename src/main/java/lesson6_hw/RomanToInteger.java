package lesson6_hw;

public class Solution {
    public int romanToInt(String s) {
        char[] sc = s.toCharArray();
        int sum = 0;
        for (int index = sc.length - 1; index >= 0; index--) {
            if (sc[index] == 'I') {
                sum += (sum < 5 ? 1 : -1);
            } else if (sc[index] == 'V') {
                sum += 5;
            } else if (sc[index] == 'X') {
                sum += (sum < 50 ? 10 : -10);
            } else if (sc[index] == 'L') {
                sum += 50;
            } else if (sc[index] == 'C') {
                sum += (sum < 500 ? 100 : -100);
            } else if (sc[index] == 'D') {
                sum += 500;
            } else if (sc[index] == 'M') {
                sum += 1000;
            }
        }
        return sum;
    }
}


