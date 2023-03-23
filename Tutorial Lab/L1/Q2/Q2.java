package L1.Q2;

import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;


public class Q2{
    public static void main(String[] args) throws IOException{
        int wordcount = 0;
        Scanner read = new Scanner(new FileReader("/Users/Luis Lee/Desktop/UM/Semester 2/WIX1002 DS/Tutorial Lab/L1/Q2/text1.txt"));
        System.out.println("text1.txt File: ");

        System.out.println("Number of Characters Retrieved for text1.txt is: " + splitmethod(read,wordcount,",") + "\n\n");

        Scanner read2 = new Scanner(new FileReader("/Users/Luis Lee/Desktop/UM/Semester 2/WIX1002 DS/Tutorial Lab/L1/Q2/text2.txt"));
        System.out.println("text2.txt File: ");
        System.out.println("Number of Characters Retrieved for text2.txt is: " + splitmethod(read2,wordcount,", ") + "\n\n");

        Scanner read3 = new Scanner(new FileReader("/Users/Luis Lee/Desktop/UM/Semester 2/WIX1002 DS/Tutorial Lab/L1/Q2/text3.txt"));
        System.out.println("text3.txt File: ");
        System.out.println("Number of Characters Retrieved for text3.txt is: " + splitmethod(read3,wordcount,"; "));

        Scanner read4 = new Scanner(new FileReader("/Users/Luis Lee/Desktop/UM/Semester 2/WIX1002 DS/Tutorial Lab/L1/Q2/text4.txt"));
        System.out.println("\ntext4.txt File: ");
        System.out.println("Number of Characters Retrieved for text4.txt is: " + split4(read4,wordcount)+"\n");


    }

    public static int splitmethod(Scanner read, int wordcount,String split){
        while(read.hasNextLine()){
            String temp[] = read.nextLine().split(split);
            for(int i=0; i<temp.length; i++){
                System.out.print(temp[i]);
                wordcount += temp[i].length();
            }
            System.out.println();
        }
        return wordcount;
    }

    public static int split4(Scanner read,int wordcount){
        while(read.hasNextLine()){
            String temp = read.nextLine().replaceAll("[0-9]","");
            System.out.println(temp);
            for(int i=0; i<temp.length(); i++){
                wordcount+=1;
            }
        }
        return wordcount;
    }
}

