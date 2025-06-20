import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(ans(a,b));
        sc.close();
    }
    public static int ans(int a, int b){
        //int max = Integer.MIN_VALUE;
        int min = Math.min(a, b);
        while(min!=0){
            int temp = min;
            min = a%b;
            a = temp;
        }
        return a;
    }
}
