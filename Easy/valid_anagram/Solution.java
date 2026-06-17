package easy.valid_anagram;


class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            // if (map.containsKey(s.charAt(i))) {
            //     val = map.get(s.charAt(i));
            //     val += 1;
            //     map.put(s.charAt(i), val);
            // } else {
            //     map.put(s.charAt(i), 1);
            // }
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))){
                // val = map.get(t.charAt(i));
                // val -= 1;
                // map.put(t.charAt(i), val);
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}