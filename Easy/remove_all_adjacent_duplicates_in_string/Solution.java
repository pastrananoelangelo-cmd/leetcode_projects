package easy.remove_all_adjacent_duplicates_in_string;


class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        String ans;

        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        for (char c : stack) {
            sb.append(c);
        }

        ans = sb.reverse().toString();

        return ans;
    }
}