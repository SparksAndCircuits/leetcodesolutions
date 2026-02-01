package Easy;

/*  LeetCode Question 13: Roman to Integer

    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX.

    Given a roman numeral, convert it to an integer.
*/

public class RomanToInt {
    public int romanToInt(String s){
        int total = 0;
        int i = 0;

        while(i < s.length()){
            if(i < s.length() - 1){
                String twoChar = s.substring(i, i + 2);

                if(twoChar.equals("IV")){
                    total += 4;
                    i += 2;
                    continue;
                }else if(twoChar.equals("IX")){
                    total += 9;
                    i += 2;
                    continue;
                }else if(twoChar.equals("XL")){
                    total += 40;
                    i += 2;
                    continue;
                }else if(twoChar.equals("XC")){
                    total += 90;
                    i += 2;
                    continue;
                }else if(twoChar.equals("CD")){
                    total += 400;
                    i += 2;
                    continue;
                }else if(twoChar.equals("CM")){
                    total += 900;
                    i += 2;
                    continue;
                }
            }

            char c = s.charAt(i);

            if(c == 'I'){
                total += 1;
            }else if(c == 'V'){
                total += 5;
            }else if(c == 'X'){
                total += 10;
            }else if(c == 'L'){
                total += 50;
            }else if(c == 'C'){
                total += 100;
            }else if(c == 'D'){
                total += 500;
            }else if(c == 'M'){
                total += 1000;
            }

            i++;
        }

        return total;
    }
}
