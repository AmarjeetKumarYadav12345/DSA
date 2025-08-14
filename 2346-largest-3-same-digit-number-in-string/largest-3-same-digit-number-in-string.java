class Solution {
    public String largestGoodInteger(String num) {

            String ans = "";
        for (int i = 0; i <= num.length() - 3; i++) {
            char c1 = num.charAt(i);
            char c2 = num.charAt(i + 1);
            char c3 = num.charAt(i + 2);
            
            // Check if all three characters are the same
            if (c1 == c2 && c2 == c3) {
                String curr = num.substring(i, i + 3);
                // Compare lexicographically since digits are single characters
                if (ans.equals("") || curr.compareTo(ans) > 0) {
                    ans = curr;
                }
            }
        }
        return ans;
        
    }

}