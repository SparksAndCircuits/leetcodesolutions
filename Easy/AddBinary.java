package Easy;
import java.util.ArrayList;

/*  Leetcode question 67: Add Binary

    Given two binary strings a and b, return tehir sum as a binary string

*/

public class AddBinary {
    public String addBinary(String a, String b){
        String res = "";
        int carry = 0;

        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        for(int i = 0; i < Math.max(a.length(), b.length()); i++){
            int digitA = i < a.length() ? a.charAt(i) - '0' : 0;
            int digitB = i < b.length() ? b.charAt(i) - '0' : 0;

            int total = digitA + digitB + carry;
            char charDigit = (char)((total % 2) + '0');
            res = charDigit + res;
            carry = total / 2;
        }

        if(carry > 0){
            res = "1" + res;
        }

        return res;
    }
}
