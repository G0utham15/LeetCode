import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestWordInDict_720 {
    public String longestWord(String[] words) {
        String poss="";
        for(String i:words) {
            if (i.length() < poss.length()) continue;
            if (poss.length() < i.length()) {
                poss = i;
            } else {
                if (poss.compareTo(i) < 0) {
                    poss = i;
                }
            }

        }
        return poss;
    }
}
