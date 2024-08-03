//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] num = {0,12,345,2,6,7896,-87656};
        System.out.println(findNumbers(num));
        System.out.println(DigitCount(-87656));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        int Digits = DigitCount(num);
        return Digits % 2 == 0;
        /* if(num % 2 ==0 )
         return true; */
    }
    static int DigitCount(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0)
    {
        return 1;
    }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
