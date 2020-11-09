import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        float a = scan.nextInt();
        float b = scan.nextInt();
        float c = a/100*b+a;
        System.out.println(c);
        float d = c/100*b+c;
        System.out.println(d);
        float e = d/100*b+d;
        System.out.println(e);
        float f = e/100*b+e;
        System.out.println(f);
        float g = f/100*b+f;
        System.out.println(g);



    }
}
