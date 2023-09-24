class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String BB =B+B;
        if (!BB.contains(A))
            answer = -1;
        else {
            answer=BB.indexOf(A);
        }
        return answer;
    }
}
