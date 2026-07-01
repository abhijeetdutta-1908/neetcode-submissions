class Solution {
    public boolean isPalindrome(String s) {
        String s2 = s.replace(" ", "").toLowerCase();
        int i = 0;
        int j = s2.length() -1 ;
        boolean flag = true;
        while(i<j){
            while (i < j && !Character.isLetterOrDigit(s2.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s2.charAt(j))) {
                j--;
            }
            if(s2.charAt(i) != s2.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
}
