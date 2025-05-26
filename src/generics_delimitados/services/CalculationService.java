package generics_delimitados.services;

import java.util.List;

public class CalculationService{

    public static <Type extends Comparable<? super Type>> Type max(List<Type> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        Type max = list.get(0);
        for(Type item : list) {
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}
