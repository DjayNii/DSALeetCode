class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        char[] cArr = s.toCharArray();

        for (char c: cArr){
            if (c == '(' || c == '[' || c == '{') {
                brackets.push(c);
            } else {
                if (brackets.isEmpty()) return false;
                char top = brackets.peek();
                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {
                    brackets.pop();
                } else {
                    return false;
                }
            }
        } 

      return brackets.empty();
    }
}