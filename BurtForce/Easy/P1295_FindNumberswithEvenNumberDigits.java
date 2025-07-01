package BruteForce.BurteForce.Easy;

public class P1295_FindNumberswithEvenNumberDigits {
    public int findNumbers(int[] nums){
        int totalEvenNumbs  = 0;
        for (int num : nums) {
            int totalNumbers= 0;
            if (num == 0){
                totalNumbers = 1;
            }else{
                if (num>0){
                    num = num/10;
                    totalNumbers++;
                }
            }
            if (totalNumbers%2==0){
                totalEvenNumbs++;
            }
        }
        return totalEvenNumbs;
    }
}
