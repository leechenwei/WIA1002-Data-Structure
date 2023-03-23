package L2.Q1.Q2;


public class CompareMax {
    public static <E extends Comparable<E>> E maximum(E a, E b, E c){
        E max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }

    public static void main(String[] args){
        Integer a = 10;
        Integer b = 20;
        Integer c = 30;
        System.out.println("The Maximum value is " + maximum(a,b,c));
    }
}
