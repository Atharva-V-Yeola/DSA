import java.util.*;
import java.io.*;

public class powerExpo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = (long)1e9+7;
        long a = sc.nextLong();
        long n = sc.nextLong();
        long ans = 1;
        while (n-->0) {
            ans=(ans*a)%m;
        }
        sc.close();
    }
}
