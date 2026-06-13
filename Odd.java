class Solution {
    public void pattern(int n) {
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.printf("%-4d", num);
                } else {
                    System.out.print("    ");
                }

                num += 2;
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        int n = 5;

        Solution obj = new Solution();
        obj.pattern(n);
    }
}
