import java.util.Map;

public class TestZ_003 {
    public static int main(String s){
         int [] freq = new int [256];
        //sliding window [l..........r]
         int l =0; int r = -1;   //
        int res = 0;
        while (r+1<s.length()){
            while (r+1<s.length()&&freq[s.charAt(r+1)]==0){
                freq[s.charAt(++r)]++;
            }
            res= Math.max(res,r-l+1);
            if (r+1<s.length()){
                freq[s.charAt(++r)]++;
                while (l<=r && freq[s.charAt(r)]==2){
                    freq[s.charAt(l++)]--;
                }
            }
        }
        return res;
    }
}
