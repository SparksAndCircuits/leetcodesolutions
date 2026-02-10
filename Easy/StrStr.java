package Easy;

/*  Leetcode question 28: Find the index of the first occurrence in the string

    Given two strings needle and haystack , return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

*/

public class StrStr {
    public int strStr(String haystack, String needle){

        for(int i = 0; i < haystack.length(); i++){
            for(int j = 0; j < needle.length(); j++){
                if(i == j){
                    return i;
                }
            }
        }

        return -1;
    }
}
