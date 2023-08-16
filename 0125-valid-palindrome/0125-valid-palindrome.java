class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        int start = 0;
        int end = s.length() - 1;

        while(start <= end) {
            char currentFirst = s.charAt(start);
            char currentEnd = s.charAt(end);

            if(!Character.isLetterOrDigit(currentFirst)) {
                start++;
            } else if(!Character.isLetterOrDigit(currentEnd)) {
                end--;
            } else {
                if(Character.toLowerCase(currentFirst) != Character.toLowerCase(currentEnd)) {
                    return false;
                }
                start++;
                end--;
            }
        }

        return true;
    }
}