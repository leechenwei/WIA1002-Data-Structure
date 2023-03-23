package T2.Q1.Q5Q6;

public class Duo<A, B>{
    private A first;
    private B second;

    public Duo(A first, B second){
        this.first = first;
        this.second = second;
    }
    
    Duo<String,Integer> sideShape = new Duo<>("Square",4);
    Duo<Double, Double> points = new Duo<>(3.5,4.8);
}
