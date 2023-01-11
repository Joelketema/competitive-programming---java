class Solution {
    public int maxCoins(int[] piles) {
        int maxCoin = 0;
        
        Arrays.sort(piles);

        for(int i=piles.length/3;i<piles.length;i+=2){
            maxCoin +=piles[i];
        }

        return maxCoin;
        
    }
}
