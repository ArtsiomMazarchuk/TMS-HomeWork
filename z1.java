import java.util.Random;

public class z1 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = r.nextInt(10);
                System.out.print(array[i][j] + " ");
                if ((i == j) && (array[i][j] % 2 == 0)) sum += array[i][j];
            }
            System.out.print("\n");
        }
        System.out.println("Sum = " + sum);
    }
}
