import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[] Output = new int[3];
        int index = 0;
        for (int i = 0, j = 321; i < 321; i++, j--) {
            int someNumber = i % j;
            if (someNumber == 1 || someNumber == 2 || someNumber == 3) {
                Output[index] = someNumber;
                System.out.print(Output[index]);
                index++;
                if (index == 3) {
                    break;
                }
            }
        }
    }
}
