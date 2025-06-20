import java.util.Scanner;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        prime[i]= true;
        for(int p=2;p*p<=n;p++){
            if(prime[p]){
                for(i=p*p;i<=n;i+=p){
                    prime[i]=false;
                }
            }
        }
        sc.close();
    }
}
