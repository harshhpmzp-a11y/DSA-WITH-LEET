class Solution {
    public int countCommas(int n) {
        int count = 0 ;
        for ( int i = 1 ; i <= n ; i++){
            String s = String.valueOf(i);
            if (s.length() >= 4){
                count += (s.length()-1)/3 ;
            }
        }
        return count ;
    }
}