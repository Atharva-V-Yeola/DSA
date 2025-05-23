import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class perfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(temp(start,end));
    }
    public static List<Integer> temp(int start, int end){
        List<Integer> ans = new ArrayList<>();
        for(int i=start;i<=end;i++){
            if(isPerfect(i)){
                ans.add(i);
            }
            //return ans;
        }
        return ans;
    }
    public static boolean isPerfect(int num){
        if(num<=1) return false;
        int sum = 1;
        for(int i = 2;i<num/2;i++){
            if(num%i==0) sum+=i;
        }
        return sum==num;
    }
}
