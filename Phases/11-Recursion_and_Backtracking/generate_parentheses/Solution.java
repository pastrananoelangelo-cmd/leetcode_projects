class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        generate(ans, n, sb, 0, 0);

        return ans;
    }

    private void generate(List<String> ans, int n, StringBuilder sb, int open, int close) {
        System.out.println(sb.toString());
        if (n == open && n == close) {
            StringBuilder temp = new StringBuilder(sb);
            ans.add(temp.toString());
        } else {
            if (open < n) {
                sb.append("(");
                generate(ans, n, sb, open + 1, close);
                sb.deleteCharAt(sb.length() - 1);
            }
            
            if (open > close) {;
                sb.append(")");
                generate(ans, n, sb, open, close + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}