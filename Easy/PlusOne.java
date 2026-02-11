package Easy;

/* Leetcode question 66: Plus one

    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.

*/

public class PlusOne {
    public int[] plusOne(int[] digits){
        for(int i = 0; i < digits.length; i++){
            if(i == digits.length){
                if(digits[i] == 9){
                    digits[i] = 0;
                    digits[i - 1] += 1;
                }else{
                    digits[i] +=1;
                }
            }
        }

        return digits;
    }
}
