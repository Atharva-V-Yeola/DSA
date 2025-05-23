class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int left = 0, right = 0,ans = 0;
        for(int i = 0;i<n;i++){
            while((right)-(left)<k){
                if(colors[i+1%k]!=colors[i%k]) right++;
                else{
                    left = i+1;
                    right++;
                }
                if(right-left==k-1) ans+=1;
            }
            if(ans!=0){
                if(k%2==0){
                if(colors[left%k]==colors[(right+1)%k]) ans++;
                else{
                    left = i+1;
                    right++;
                }
                }
                else{
                    if(colors[left%k]!=colors[(right+1)%k]) ans++;
                else{
                    left = i+1;
                    right++;
                }
                }
            }
        }
        return ans;
    }
}