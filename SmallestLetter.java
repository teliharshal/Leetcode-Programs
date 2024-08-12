import java.util.Arrays;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1353414383/
public class SmallestLetter {

    public static void main(String[] args) {
        char[] letters =  {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters,target));

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;
        int n = letters.length;

        while (start <= end)
        {
            int mid = start+(end-start)/2;

            if(letters[mid]>target)
            {
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }
        return letters[start % n];
    }
}
