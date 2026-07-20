class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        boolean ans = false;

        for (int i = 0; i < edges.length; i++) {
            if (!map.containsKey(edges[i][0])) {
                map.put(edges[i][0], new ArrayList<>());
            }

            if (!map.containsKey(edges[i][1])) {
                map.put(edges[i][1], new ArrayList<>());
            }

            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }

        System.out.println(map);

        ans = dfs(map, set, source, destination);

        return ans;
    }

    private boolean dfs(HashMap<Integer, List<Integer>> map, HashSet<Integer> set, 
    int curr, int dest) {
        System.out.println(curr);
        if (curr == dest) {
            return true;
        }

        if (set.contains(curr)) {
            return false;
        }

        if (!set.contains(curr)) {
            set.add(curr);
        }

        List<Integer> list = map.get(curr);
        for (Integer num : list) {
            if (dfs(map, set, num, dest)) {
                return true;
            }
        }

        return false;
    }
}