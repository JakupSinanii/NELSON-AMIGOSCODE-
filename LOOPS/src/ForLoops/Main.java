public class Main {
    public static void main(String[] args) {
        String[] arrays = {
                "James",    // index 0
                "Nadia",    // index 1
                "Sophia",   // index 2
                "Alex",     // index 3
                "Saleh",     // index 4
                "Aisha"     // index 5
        };
        // length = 6

        // for loop

        System.out.println("For loop");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

        System.out.println();

        System.out.println("Enhanced for loop");

        // enhanced for loop
        for (String name : arrays) {
            System.out.println(name);
        }
    }
}
