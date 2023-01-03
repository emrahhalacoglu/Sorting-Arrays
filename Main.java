
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input Array Lenght : ");
        int arrayLenght = input.nextInt();
        int[] list = new int[arrayLenght];
        for (int i = 0; i < list.length; i++)
        {
            System.out.print("Input Array Element [" + i + "] : ");
            int arrayElement = input.nextInt();
            list[i] = arrayElement;
        }
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++)
        {
            for (int j = i + 1; j < list.length; j++)
            {
                if (list[j] < list[i])
                {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
