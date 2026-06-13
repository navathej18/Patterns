import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("10's   = " + (n / 10));
        System.out.println("100's  = " + (n / 100));
        System.out.println("1000's = " + (n / 1000));
    }
}
