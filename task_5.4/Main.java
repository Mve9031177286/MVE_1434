import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;


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
                for(int x : с);
                if x%2 == 0;
                System.out.print((char) x);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
