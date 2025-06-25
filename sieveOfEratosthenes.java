import java.util.Scanner;

public class sieveOfEratosthenes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the upper limit (n): ");
        int n = sc.nextInt();

        boolean[] prime = new boolean[n + 1];

        // Assume all numbers are prime initially
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        // Sieve logic
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
