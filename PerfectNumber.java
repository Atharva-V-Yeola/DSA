
    import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfect(int number) {
        if (number <= 1) return false;

        int sum = 1; // 1 is always a proper divisor
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // if (isPerfect(num)) {
        //     System.out.println("YES");
        // } else {
        //     System.out.println("NO");
        // }
        for (int i = 1; i <= num; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        scanner.close();    
    }
}


