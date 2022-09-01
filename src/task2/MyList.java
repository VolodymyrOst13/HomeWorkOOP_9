package task2;

import java.util.ArrayList;

public class MyList<T> {

    int index;
    ArrayList list = new ArrayList<>();

    public T method(T field) {
        if (field.getClass().equals(Integer.class)) {
            return (T) (Object) list.add((Integer) field);
        }
        if (field.getClass().equals(Double.class)) {
            return (T) (Object) list.add((Double) field);
        }
        if (field.getClass().equals(String.class)) {
            return (T) (Object) list.add((String) field);
        }
        return (T) (Object) (Integer) 0;

    }

    @Override
    public String toString() {
        System.out.println();
        return "Element with index " + index + " = "+ list.get(index) + "\nList size = " + list.size();
    }



}
