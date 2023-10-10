class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int d1=common[2]-common[1];
        int d2=common[1]-common[0];
        if (d2 != d1) {
            int r=common[1]/common[0];
            answer=common[common.length-1]*r;
        } else{
            answer=common[common.length-1]+d1;
        }
        
        return answer;
    }
}