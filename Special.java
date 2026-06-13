import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        int[] fact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

        System.out.println((fact[a] + fact[b] + fact[c]) == n);
    }
}
