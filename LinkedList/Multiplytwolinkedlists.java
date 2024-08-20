class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        long n1 = 0;
        long n2 = 0;
        int mod = 1000000007;
        while (first != null) {
            n1 = ((n1 * 10) + first.data) % mod;
            first = first.next;
        }
        while (second != null) {
            n2 = ((n2 * 10) + second.data) % mod;
            second = second.next;
        }
        long ans = (n1 * n2) % mod;
        return ans;

    }

}