import java.util.Random;

public class Shuffle_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleA(array);
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    public static void shuffleA(int[] array) {
        Random random = new Random();
        int n = array.length;

        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
