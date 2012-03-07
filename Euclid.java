public class Euclid {

    // recursive implementation
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    public static void main(String[] args) {
       System.out.println(gcd(36,20));
    }
}