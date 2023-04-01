import java.util.Arrays;

public class ReverseWordsinString3_557 {
    /*
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s.length());
        StringBuilder temp;
        int strLen=0;
        for(String i:s.split(" ")){
            if(strLen!=0)
                sb.append(" ");
            temp= new StringBuilder(i);
            sb.append(temp.reverse());
            strLen++;
        }
        System.gc()
        return sb.toString();
    }
    */
    public String reverseWords(String s) {
        String[] strArr=s.split(" ");
        for(int i=0;i<strArr.length;i++){
            strArr[i]=reverse(strArr[i]);
        }
        System.gc();
        return String.join(" ",strArr);
    }
    public String reverse(String s){
        char[] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        char temp;
        while(i<j) {
            temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}
