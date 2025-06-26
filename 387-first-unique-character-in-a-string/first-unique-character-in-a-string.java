class Solution {
    public int firstUniqChar(String s) {
         HashMap<Character , Integer> wordCount = new HashMap<Character,Integer>();
        char result = ' ';
      for(int i = 0 ; i < s.length();i++){
        if(wordCount.containsKey(s.charAt(i))){
          int value = wordCount.get(s.charAt(i));
          wordCount.put(s.charAt(i), value+1);
        }
        else{
          wordCount.put(s.charAt(i), 1);
        }
      }
     for (int i = 0; i < s.length(); i++) {
    if (wordCount.get(s.charAt(i)) == 1) {
        return i;
    }
    }
    return -1;
}}