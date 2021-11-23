public class priceComp {
        public  int maxProfit(int[] prices) {
            int result_profit = 0;
            for (int i = 0; i < prices.length; i++) {
                for (int j = i + 1; j < prices.length; j++) {
                    int initial_profit = prices[j] - prices[i];
                    if (initial_profit > result_profit)
                        result_profit = initial_profit;
                }
            }
            return result_profit;
        }
        public static void main(String[] args){
                int[] arr = {7,6,4,3,1};
                priceComp obj = new priceComp();
                int a = obj.maxProfit(arr);
                System.out.println(a);
        }
}
