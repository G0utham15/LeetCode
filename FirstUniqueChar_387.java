import java.util.Arrays;

public class FirstUniqueChar_387 {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        Arrays.fill(freq,0);
        for(char i:s.toCharArray()){
            freq[i-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
