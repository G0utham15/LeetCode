import java.util.Arrays;

public class RansomeNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        Arrays.fill(freq, 0);
        for(char i:magazine.toCharArray()){
            freq[i-'a']++;
        }
        for(char i:ransomNote.toCharArray()){
            freq[i-'a']--;
            if(freq[i-'a']<0){
                return false;
            }
        }
        return true;
    }
}
