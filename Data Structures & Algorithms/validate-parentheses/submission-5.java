class Solution {
    public boolean isValid(String s) {
        int i = 0;
        Stack<Character> stack = new Stack<>();
        while(i < s.length()) {
            if(s.charAt(i) == '(') stack.push(')');
            else if(s.charAt(i) == '[') stack.push(']');
            else if(s.charAt(i) == '{') stack.push('}');
            else if(stack.isEmpty() || stack.pop() != s.charAt(i)) return false;
            i++;
        }

        return stack.isEmpty();
    }
}
