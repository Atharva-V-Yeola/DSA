import java.util.Scanner;
import java.util.*;
import java.io.*;
public class ModuloArth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = (long)1e9+7;
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println((a%m + b%m)%m);

    }
}
