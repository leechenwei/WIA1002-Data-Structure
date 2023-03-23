package T2.Q1;

public class Container<T>{
    private T t;

    public Container(){
    };

    public void add(T t){
        this.t=t;
    }

    public T retrieve(){
        return t;
    }

    public static void main(String[] args){
        Container<Integer> container1= new Container<>();
        Container<String> container2 = new Container<>();

        container1.add(50);
        container2.add("Value");

        System.out.println(container1.retrieve());
        System.out.println(container2.retrieve());

    }

}
