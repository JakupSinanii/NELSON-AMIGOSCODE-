public class Main {
    public static void main(String[] args) {

        // Pass by value

        int age =23;
        int agecopy=increment(age);

        System.out.println(age);
        System.out.println(agecopy);



        System.out.println("Hello world!");
    }
    public static int increment(int age){
        return ++age;
    }
}