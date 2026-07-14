package easy.valid_parentheses;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();
        char curr;

        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) { 
                    return false;
                }

                curr = stack.pop();
                if (map.get(curr) != s.charAt(i)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
} {
    
}
