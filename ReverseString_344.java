public class ReverseString_344 {
    public void reverseString(char[] s) {
        int i=0,j=s.length-1;
        char ch;
        while(i<j){
            ch=s[j];
            s[j]=s[i];
            s[i]=ch;
            i++;j--;
        }
        //System.gc();
    }
}
