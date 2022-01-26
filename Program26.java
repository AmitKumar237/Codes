// https://leetcode.com/problems/long-pressed-name/

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.charAt(0) != typed.charAt(0))
            return false;
        int i=0;
        int j=0;
        while(i < name.length() && j < typed.length()){
            char ch1 = name.charAt(i);
            char ch2 = typed.charAt(j);
            if(ch1 == ch2){
                i++;
                j++;
            }else if(name.charAt(i-1) != ch2){
                return false;
            }else{
                j++;
            }
        }
        
        while(j < typed.length()){
            if(typed.charAt(j) != name.charAt(name.length() - 1)){
                break;
            }
            j++;
        }
        if(i != name.length() && j==typed.length())
            return false;
        if(i == name.length() && j==typed.length())
            return true;
        return false;
    }
}