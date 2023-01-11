class Solution {
    public void flip(int[]A, int index){
        for(int i = 0; i <= index/2; ++i){
            int tmp = A[i];
            A[i] = A[index-i];
            A[index-i] = tmp;
        }
    }
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> result = new ArrayList();
        for(int i = A.length-1; i > 0; --i){
            for(int j = 1; j <= i; ++j){
                if(A[j] == i+1){
                    flip(A, j);
                    result.add(j+1);
                    break;
                }
            }
            flip(A, i);
            result.add(i+1);
        }
        return result;
    }
}
