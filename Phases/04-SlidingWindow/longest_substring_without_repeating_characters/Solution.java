package longest_substring_without_repeating_characters;


class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0, curr;
        int valid = 0;

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(valid));
                valid++;
            }
            set.add(s.charAt(i));
            
            curr = i + 1 - valid;
            if (curr > max) {
                max = curr;
            }
        }

        return max;
    }
}