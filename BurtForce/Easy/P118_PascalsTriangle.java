package BruteForce.BurteForce.Easy;

import java.util.ArrayList;
import java.util.List;

public class P118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                if (j == 0 || j == i){
                    rows.add(1);
                }
                else{
                    int left = result.get(i-1).get(j-1);
                    int right = result.get(i-1).get(j);
                    rows.add(left+right);
                }
            }
            result.add(rows);
        }
        return result;
    }
}
