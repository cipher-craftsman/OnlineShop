public class MethodOverloading {

    public static void main(String[] args) {
        int result1 = addNumbers(5, 2);
        double result2 = addNumbers(5.2, 2.1);
        int result3 = addNumbers(5, 2, 3);
        Float result4 = (float) divideNumbers(7, 3);
        Float result5 = (float) multiplyNumbers(5,5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
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

    public static int divideNumbers(int i, int j) {
        return i/j;
    }

    public static float multiplyNumbers(int x, int y) {
        return x*y;
    }
}

