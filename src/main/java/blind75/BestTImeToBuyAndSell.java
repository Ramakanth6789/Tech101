package blind75;

public class BestTImeToBuyAndSell {
    public static void main(String[] args) {
        int[] array = new int[]{7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(array));
    }

    private static int maxProfit(int[] array) {
        int minPrice =  array[0];
        int maxReturn = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i]<minPrice){
                minPrice = array[i];
            }else{
                maxReturn = Math.max(maxReturn, array[i] - minPrice);
            }
        }

        return maxReturn;

    }

}
