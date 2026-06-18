package group_anagrams;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        String[] temp = new String[strs.length];
        char[] charTemp;

        for (int i = 0; i < strs.length; i++) {
            charTemp = strs[i].toCharArray();
            Arrays.sort(charTemp);
            temp[i] = new String(charTemp);
        }

        for (int i = 0; i < strs.length; i++) {
            if (!map.containsKey(temp[i])) {
                map.put(temp[i], new ArrayList<>());
            }

            map.get(temp[i]).add(strs[i]);
        }

        ans = new ArrayList<>(map.values());

        return ans;
    }
}