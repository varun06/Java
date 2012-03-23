import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class Horner { 

    // use Horner's method to compute and return the polynomial evaluated at x
    // p[0] + p[1] x^1 + p[2] x^2 + ... + p[N-1] x^N-1 
    public static double eval(double x, double[] p) {
        double result = 0;
        for (int i = p.length - 1; i >= 0; i--)
            result = p[i] + (x * result);
        return result;
    }

    public static void main(String[] args) { 
        int N  = Integer.parseInt(args[0]);

        // compute coeffients for Taylor series e^x = 1 + x + x^2/2! + x^3/3! + ...
        double[] p = new double[N];
        p[0] = 1;
        for (int i = 1; i < N; i++) {
            p[i] = p[i-1] / i;
        }

        // evaluate the polynomial at values x read from standard input
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            StdOut.println(eval(x, p));
            StdOut.println(Math.exp(x));
            StdOut.println();
        }
    }
}