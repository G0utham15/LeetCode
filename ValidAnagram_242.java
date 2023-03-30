import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        int[] freq1=new int[26];
        Arrays.fill(freq1,0);
        for(char i:s.toCharArray()){
            freq1[i-'a']++;
        }
        for(char i:t.toCharArray()){
            freq1[i-'a']--;
            if(freq1[i-'a']<0){
                return false;
            }
        }
        for (int i:freq1){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
