public class FirstBadVersion_278 {
    boolean isBadVersion(int version){
        return (int) (Math.random() * 10) % 2 == 0;
    }
    public int firstBadVersion(int n) {
        if(n==1) return 1;
        int start=0, end=n,mid;

        while(true){
            mid=start+(end-start)/2;
            System.out.println(mid+" "+isBadVersion(mid));
            if(isBadVersion(mid)&&!isBadVersion(mid-1)){
                return mid;
            }
            if(!isBadVersion(mid)){
                start=mid+1;
            }else{
                end=mid-1;
            }
            System.out.println(start+" "+end);
        }
    }
}
