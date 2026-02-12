package Easy;
import java.util.*;

/* Leetcode question 66: Plus one

    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.

*/

public class PlusOne {
    public int[] plusOne(int[] digits){
        List<Integer> digitsList = new ArrayList<>();

        for(int i = digits.length - 1; i >= 0; i++){
            digitsList.add(digits[i]);
        }

        int one = 1;
        int i = 0;

        while(one == 1){
            if(i < digitsList.size()){
                if(digitsList.get(i) == 9){
                    digitsList.set(i,0);
                }else{
                    digitsList.set(i, digitsList.get(i) + 1);
                    one = 0;
                }

                i++;
            }
        }

        Collections.reverse(digitsList);
        int[] result = new int[digitsList.size()];
        for(int j = 0; j < digitsList.size(); j++){
            result[j] = digitsList.get(j);
        }

        return result;
    }
}
