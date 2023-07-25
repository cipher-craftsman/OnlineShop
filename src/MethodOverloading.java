public class MethodOverloading {

    public static void main(String[] args) {
        int result1 = addNumbers(5, 2);
        double result2 = addNumbers(5.2, 2.1);
        int result3 = addNumbers(5, 2, 3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static double addNumbers(double a, double b) {
        return a + b;

    }

    public static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }
}