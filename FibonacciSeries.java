//import java.util.*;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int one=0,two=1,next=0,n=s.nextInt();
        for(int i=1;i<n;i++){
            next = one+two;
            one=two;
            two=next;
        }
        System.out.println(next);
        s.close();
    }
}
