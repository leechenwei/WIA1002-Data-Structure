package T2.Q1.Q2;
import java.util.Arrays;

public class MyArray {
    public static void main(String[] args){
        Integer[] integer = {1,2,3,4,5};
        String[] string = {"Jane","Tom","Bob"};
        Character[] character = {'a','b','c'};
        listAll(integer,string,character);
    }

    public static <T> void listAll(T[]... arrays){
        for(T[] array: arrays){
            System.out.println(Arrays.toString(array) + " ");
        }
    }
}