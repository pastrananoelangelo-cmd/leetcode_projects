class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> visited = new HashSet<>();

        for (int i = 0; i < prerequisites.length; i++) {
            if (!map.containsKey(prerequisites[i][1])) {
                map.put(prerequisites[i][1], new ArrayList<>());
            }
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        // System.out.println(map);

        for (int i = 0; i < numCourses; i++) {
            if (visited.contains(i)) {
                continue;
            }

            if (!dfs(map, set, visited, i)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(HashMap<Integer, List<Integer>> map, 
    HashSet<Integer> set, HashSet<Integer> visited, int curr) {
        if (set.contains(curr)) {
            return false;
        }
        
        if (!set.contains(curr)) {
            set.add(curr);
        }

        if (!visited.contains(curr)) {
            List<Integer> neighbors = map.get(curr);
            if (neighbors != null) {
                for (Integer neighbor : neighbors) {
                    if (!dfs(map, set, visited, neighbor)) {
                        return false;
                    }
                }
            }
            visited.add(curr);
        }

        set.remove(curr);
        return true;
    }
}