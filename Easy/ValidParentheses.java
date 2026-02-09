package Easy;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
/*  Leetcode question 20: Valid Parentheses

    Given a string s containing just the charcters '(', ')', '{', '}', '[', ']', determine if the input string is valid.

    An input string is valid if:
    1) Open brackets must be closed by the same type of bracket.
    2) Open brackets must be closed in the correct order.
    3) Every close bracket has a corresponding open bracket of the same type.
*/
public class ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();

        closeToOpen.put(')','(');
        closeToOpen.put(']','[');
        closeToOpen.put('}','{');

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(closeToOpen.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == closeToOpen.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
