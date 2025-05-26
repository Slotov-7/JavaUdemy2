package generics.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> {

    private List<Type> list = new ArrayList<>();

    public void addValue(Type value){
        list.add(value);
    }

    public Type first(){
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }
    public void print(){
        System.out.print("[");
        if (!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for(Type value : list){
            System.out.print(", " + value);
        }
        System.out.println("]");
    }
}
