import java.time.Instant;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println(Instant.now());
        //ans(n);
        System.out.println(ans(n));
        System.out.println(Instant.now());
        sc.close();
    }
    static boolean ans(int n){
        for(int i = 2;i<n;i++){
            if(n%i==0) return false;
            
        }
        // if(n%2==0 || n%3==0) return false;
        // for(int i=5;i*i<=n;i+=6){
        //     if(n%i==0 || n%(i+2)==0) return false;
        // }
        return true;
    }
}
