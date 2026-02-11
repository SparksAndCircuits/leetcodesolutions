package Easy;

/*  Leetcode question: Length of Last word

    Given a string s consisting of words and space, return the length of the last word in the string.

    A word is a maximal substring consisting of non-space character only.

*/

public class LengthOfLastWord {
    public int lengthOfLastWord(String s){
        int i = s.length() - 1;
        int length = 0;

        while(s.charAt(i) == ' '){
            i--;
        }

        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }

        return length;
    }
}
