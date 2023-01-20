import java.lang.Math;

public class MathJava {
    public static void main(String[] args) {
        double x = -5.5;
        double y = 6.6;
        int z = 5;
        int w = 6;

        System.out.println(Math.max(x, y)); // find the higher value
        System.out.println(Math.min(x, y)); // find the lower value
        System.out.println(Math.abs(-x)); // find the absolute value
        System.out.println(Math.sqrt(z)); // find the square root
        System.out.println(Math.pow(z, w)); // find the power of a number
        System.out.println(Math.round(x)); // round a number
        System.out.println(Math.ceil(x)); // round up a number
        System.out.println(Math.floor(x)); // round down a number
        System.out.println(Math.PI); // find the value of PI
        System.out.println(Math.E); // find the value of E

        // find the random number between 0 and 10
        System.out.println(Math.random() * 10);
    }
}

