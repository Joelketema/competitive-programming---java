class Solution {
    public boolean isValid(String s) {
        Stack<Character> items = new Stack<Character>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                items.push(s.charAt(i));
            }
            else{
                if (items.isEmpty()) {
                  return false;
                }
             char popped = items.pop();
        if (!((s.charAt(i) == ')' && popped == '(') || (s.charAt(i) == ']' && popped == '[') || (s.charAt(i) == '}' && popped == '{'))) {
          return false;
        }
            }
    
        }

        return items.isEmpty();
    }
}
