public class zop {
    public static void main(String[] args) {
        String name = "PRIYAL";
        System.out.println(zigzag(name));
    }
    public static String zigzag(String name){
        String s1 = "";
        String s2 = "";
        int n = name.length();
        int l=0,r=1;
        while (l<n) {
            s1+=name.charAt(l);
            l+=2;
        }
        while (r<n) {
            s2+=name.charAt(r);
            r+=2;
        }
        return s1+s2;
    }
}

