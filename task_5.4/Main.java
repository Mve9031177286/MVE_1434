import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a [];
        a = scan.nextInt();
        try {
            FileWriter writer = new FileWriter("C://java/test.txt",true);
            writer.write(a);
            writer.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        try {
            FileReader reader = new FileReader("C://java/test.txt");
            int c[] = new int[];
            while ((c=reader.read()) != -1)
            {
                Arrays.sort(с);
                System.out.print((char) c%2 == 0);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
