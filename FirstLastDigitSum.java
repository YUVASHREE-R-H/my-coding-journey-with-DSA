
class Solution {
    public int corner_digitSum(int n) {
        if(n<=9){
            return n;
        }
        int last= n%10;
        
        while(n>9){
            n=n/10;
    }
    return last+n;
    }
    
}
