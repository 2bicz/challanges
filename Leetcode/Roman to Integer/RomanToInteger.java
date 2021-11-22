/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0, right = n;
        int shot = n / 2;
        while left <= right{
            if(isBadVersion(shot) == false) left = shot + 1;
            else if(isBadVersion(shot) == true){
                if(isBadVersion(shot - 1) == false) return shot;
                right = shot - 1;
            }
            shot = (left + right) / 2;
        }
        return -1;
    }
}