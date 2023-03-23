package L1.Q1;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class ReadMyLetter_S2043273{
    public static void main(String[] args) throws IOException {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("\nWrite Second Part of the Letter: ");
            System.out.print("\nDate:");
            String part2 = input.nextLine();
            PrintWriter output = new PrintWriter(new FileWriter("/Users/Luis Lee/Desktop/UM/Semester 2/WIX1002 DS/Tutorial Lab/L1/Q1/Q1.txt",true));
            output.append("\n\n");
            output.append(part2);
            output.append("\n\n");
            System.out.print("Letter Content:");
            String temp = input.nextLine();
            output.append(temp);
            output.append("\n\n");
            output.flush();
            output.close();
            input.close();
            
            Scanner read = new Scanner(new FileReader("/Users/Luis Lee/Desktop/UM/Semester 2/WIX1002 DS/Tutorial Lab/L1/Q1/Q1.txt"));
            while(read.hasNextLine()){
                System.out.println(read.nextLine());
            }

            read.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
