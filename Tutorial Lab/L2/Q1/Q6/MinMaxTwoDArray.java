package L2.Q1.Q6;

public class MinMaxTwoDArray {
    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0];

        for(int i=0; i<list.length; i++){
            for(int y=0; y<list[0].length; y++){
                if(list[i][y].compareTo(min) < 0){
                    min = list[i][y];
                }
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];

        for(int i=0; i<list.length; i++){
            for(int y=0; y<list[0].length; y++){
                if (list[i][y].compareTo(max) > 0){
                    max = list[i][y];
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
        Integer[][] numbers = {{4,5,6},{1,2,3}};

        System.out.println(min(numbers));
        System.out.println(max(numbers));
    }
}
