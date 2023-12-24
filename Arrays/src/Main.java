import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 6;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] numbers2 = {0, 5, 6, 8, 9};
        System.out.println(Arrays.toString(numbers2));
        numbers2[1] = 55;
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);


        // Arrays null values
        int[]numbers3 = new int[3];
        numbers3[0]=2;
        System.out.println(Arrays.toString(numbers3));

        // so if you want the value of array to be other than zero
        // you can do like this;
        Arrays.fill(numbers3, -2);
        numbers3[2]=47;
        System.out.println(Arrays.toString(numbers3)); // so here is the result

        String[] names = new String[3];
        names[1]="Jamila";
        System.out.println(Arrays.toString(names));
    }
}