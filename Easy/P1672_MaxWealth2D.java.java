public class MaxWealth2D {


    public int maxwealth(int[][] accounts){
        int maxWealth = 0;

        for (int[] customer : accounts) {
            int CurrentCustomerWEath = 0;
            for (int banks : customer) {
                CurrentCustomerWEath+=banks;
            }
            if (CurrentCustomerWEath>maxWealth){
                maxWealth = CurrentCustomerWEath;
            }
        }
        return maxWealth;


    }
}
