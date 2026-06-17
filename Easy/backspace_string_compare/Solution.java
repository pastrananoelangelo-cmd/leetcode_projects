package easy.backspace_string_compare;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1, s2;
        
        s1 = build(s);
        s2 = build(t);

        return s1.equals(s2);
    }

    private String build(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str.charAt(i));
            }
        }

        for (char c : stack) {
            s.append(c);
        }

        return s.toString();
    }
}
