package L2.Q1.Q4;

public class minmax <minValue, maxValue> {
    public static <T extends Comparable<T>> String minmax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        T min = array[0];
        T max = array[0];
        
        for (int i = 1; i < array.length; i++) {
            T current = array[i];
            
            if (current.compareTo(min) < 0) {
                min = current;
            }
            
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        
        return "Min = " + min.toString() + " Max = " + max.toString();
    }

    public static void main(String[] args){
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red","blue","orange","tan"};

        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}
