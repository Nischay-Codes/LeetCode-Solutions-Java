package BruteForce.BurteForce.Easy;

public class P1450_NumberofStudentsDoingHomework {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i]<=queryTime && endTime[i]>=queryTime){
                count++;
            }
        }
        return count;
    }
}
