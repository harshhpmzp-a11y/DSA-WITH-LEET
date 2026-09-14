class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        // rec1 is completely left of rec2
        if (rec1[2] <= rec2[0]) {
            return false;
        }

        // rec2 is completely left of rec1
        if (rec2[2] <= rec1[0]) {
            return false;
        }

        // rec1 is completely below rec2
        if (rec1[3] <= rec2[1]) {
            return false;
        }

        // rec2 is completely below rec1
        if (rec2[3] <= rec1[1]) {
            return false;
        }

        return true;
    }
}