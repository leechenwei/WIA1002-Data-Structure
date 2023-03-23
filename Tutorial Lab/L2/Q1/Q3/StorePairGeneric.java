package L2.Q1.Q3;
import java.util.Objects;

public class StorePairGeneric<T, E> {
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
}
