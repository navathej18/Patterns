class Solution {
    public void pascalTriangle(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        int n = 3;

        Solution obj = new Solution();
        obj.pascalTriangle(n);
    }
}
