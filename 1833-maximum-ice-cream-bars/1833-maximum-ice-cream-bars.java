class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        long price = 0;
        int totIce = 0;
        for(int cost : costs) {
            price += cost;
            if(price <= coins) totIce++;
        }
        return totIce;
    }
}