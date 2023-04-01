public class StringsAppearAsSubString_1967 {
    public int numOfStrings(String[] patterns, String word) {
        int res=0;
        for(String i:patterns){
            if(word.contains(i)) res++;
        }
        return res;
    }
}
