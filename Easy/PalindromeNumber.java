package Easy;

/*  LeetCode Question 9: Palindrome Number

    Given an integer x, return true if x is a palindrome, and false otherwise.

    Constraints:
    1) -2^31 <= x <= 2^31 -1
*/
public class PalindromeNumber {
    public boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }

        String s = String.valueOf(x);
        StringBuilder stringofnum = new StringBuilder(s);
        String reversed = stringofnum.reverse().toString();

        return s.equals(reversed);
    }
}
