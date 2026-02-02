class Solution {
    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] ans = new int[n];

        // Step 1: Left to Right pass
        int prev = Integer.MIN_VALUE / 2;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = i - prev;
        }

        // Step 2: Right to Left pass
        prev = Integer.MAX_VALUE / 2;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
}
