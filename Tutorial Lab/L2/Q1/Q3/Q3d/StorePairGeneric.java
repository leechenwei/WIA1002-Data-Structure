package L2.Q1.Q3.Q3d;
import java.util.Objects;

public class StorePairGeneric<T extends Comparable<T>, E> implements Comparable<StorePairGeneric<T, E>> {
    private T first;
    private E second;

    public StorePairGeneric(T first, E second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void setPair(T first, E second){
        this.first = first;
        this.second = second;
    }

    public String toString(){
        return "first = " + first + " second = " + second;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof StorePairGeneric)) return false;
        StorePairGeneric<?,?> that = (StorePairGeneric<?,?>) o;
        return first == that.first;
    }

    @Override
    public int compareTo(StorePairGeneric<T, E> o){
        return first.compareTo(o.getFirst());
    }

    public static void main(String[] args){
        StorePairGeneric<Integer,Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer,Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer,Integer> c = new StorePairGeneric<>(6, 3);

        System.out.println(a.compareTo(b)); // prints 1
        System.out.println(a.compareTo(c)); // prints 0
        System.out.println(b.compareTo(c));

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
    }

}
