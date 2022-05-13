/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) { //5
        int left  = 0;
        int right  = n;
        while(left < right){
            int mid  = left + (right - left) / 2; // to overcome int overflow
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        
        if(left == right && isBadVersion(left)){
            return left;
        }
        
        return -1;
    }
}