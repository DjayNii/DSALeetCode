class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reverseCleanString = "";

        for(int i=0; i<cleanString.length();i++){
            reverseCleanString = cleanString.charAt(i) + reverseCleanString;
        }

       
        if(reverseCleanString.equals(cleanString)){
            return true;
        }
        else{
            return false;
        }
    }
}