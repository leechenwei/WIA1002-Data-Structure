package L2.Q1.Q5;


public class FindMax {
    public static class Circle implements Comparable<Circle>{
        private double radius;
        
        public Circle(double radius){
            this.radius = radius;
        }

        public double getRadius(){
            return radius;
        }

        public int compareTo(Circle other){
            return Double.compare(radius, other.getRadius());
        }
    }

    public static <E extends Comparable<E>> E max(E[] list){
        if (list == null || list.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        E max = list[0];

        for(int i=1; i<list.length ;i++){
            if(max.compareTo(list[i]) > 0 ){
                max = list[i];
            }
        }

        return max;
    }

    public static void main(String[] args){
        Integer[] intArray = {1,2,3};
        String[] strArray = {"red","green","blue"};
        Circle[] circleArray = {new Circle(3), new Circle(2.9), new Circle(5.9)};

        System.out.println("Max value in intArray: " + max(intArray));
        System.out.println("Max value in strArray: " + max(strArray));
        System.out.println("Max value in circleArray: " + max(circleArray).getRadius());
    }
}
