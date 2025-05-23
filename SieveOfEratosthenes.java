import java.util.*;

public class SieveOfEratosthenes {
    public static void listOfPrime(int num1, int num2) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Corrected: Use add() instead of set()
        for (int q = 0; q < num2 * num2; q++) {
            ans.add(q + 1);
        }

        for (int p = 2; p * p < num2; p++) {
            if (ans.contains(p)) {
                for (int i = p * p; i <= num2; i += p) {
                    ans.remove(Integer.valueOf(i)); // Correct removal
                }
            }
        }

        // Corrected: Print valid primes in range
        for (int prime : ans) {
            if (prime > num1 && prime <= num2) {
                System.out.print(prime + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        listOfPrime(num1, num2);
        sc.close();
    }
}
