class Solution {
    public void pyramid(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*   ");
            }

            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        int n = 3;

        Solution obj = new Solution();
        obj.pyramid(n);
    }
}
