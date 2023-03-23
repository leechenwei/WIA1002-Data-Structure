package L2.Q1.Q3.Q3b;


public class StorePair  {
    private int first, second;

    public StorePair(int first, int second){
        this.first = first;
        this.second = second;
    }

    public int getFirst(){
        return first;
    }

    public int getSecond(){
        return second;
    }

    public void setPair(int first, int second){
        this.first = first;
        this.second = second;
    }

    public String toSTring(){
        return "first = " + first + " second = " + second;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof StorePair)) return false;
        StorePair that = (StorePair) o;
        return first == that.first;
    }
}
