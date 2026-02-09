package Easy;
/*  Leetcode question 20: Valid Parentheses

    Given a string s containing just the charcters '(', ')', '{', '}', '[', ']', determine if the input string is valid.

    An input string is valid if:
    1) Open brackets must be closed by the same type of bracket.
    2) Open brackets must be closed in the correct order.
    3) Every close bracket has a corresponding open bracket of the same type.
*/
public class ValidParentheses {
    public boolean isValid(String s){
        for(int i = 0; i < s.length(); i++){
            if(i == '('){
                for(int j = 1; j <s.length(); j++){
                    if(j == ')'){
                        return true;
                    }
                    i++;
                }
            }else if(i == '{'){
                for(int j = 1; j <s.length(); j++){
                    if(j == '}'){
                        return true;
                    }
                    i++;
                }
            }else if(i == '['){
                for(int j = 1; j <s.length(); j++){
                    if(j == '}'){
                        return true;
                    }
                    i++;
                }
            }
        }

        return false;
    }
}
