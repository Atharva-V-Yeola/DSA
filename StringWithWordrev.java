import java.util.Scanner;
//import java.util.Stack;

public class StringWithWordrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = input.length();
        //System.out.println(stk(input,n));
        System.out.println(TwoP(input,n));
        sc.close();
    }
    // public static String stk(String input,int n){
    //     StringBuilder ans = new StringBuilder();
    //     Stack<Character> s = new Stack<>();
    //     for(int i = 0;i<n;i++){
    //         char ch = input.charAt(i);
    //         if(ch!=' ') s.push(ch);
    //         else{
    //             while (!s.isEmpty()) {
    //                 ans.append(s.pop());
    //             }
    //             ans.append(' ');
    //         }
    //     }
    //     while (!s.isEmpty()) {
    //         ans.append(s.pop());
    //     }
    //     return ans.toString();
    // }
    public static String TwoP(String input, int n){
        StringBuilder ans = new StringBuilder();
        char[] chars = input.toCharArray();
        //int n = chars.length;
        int s = 0;
        
        return ans.toString();
    }
}
