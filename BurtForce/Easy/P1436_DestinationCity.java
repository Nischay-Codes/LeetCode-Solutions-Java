package BruteForce.BurteForce.Easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P1436_DestinationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> path : paths) {
            set.add(path.get(0));
        }
        for (List<String> path : paths) {
            String Destnation = path.get(1);
            if (!set.contains(Destnation)){
                return Destnation;
            }
        }
        return"";
    }
}
