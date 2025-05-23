import java.util.Scanner;

public class compareLexixcograpgically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(comp(s1,s2));
        sc.close();
    }
    public static int comp(String s1, String s2){
        int ans ;
        if(s1.toLowerCase().compareTo((s2.toLowerCase()))<0) ans = -1;
        else if(s1.toLowerCase().compareTo((s2.toLowerCase()))>0) ans = 1;
        else ans = 0;
        return ans;
    }
}
