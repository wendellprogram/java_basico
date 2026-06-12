import java.util.Scanner;

public class iteracao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] v = { 3, 7, 1, 9, 4, 6, 2, 8, 5 };

        for (int i = 1; i < v.length; i += 2) {
            System.out.println("v[" + i + "] = " + v[i]);
        }


    }
}
