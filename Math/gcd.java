package Math;

public class gcd {
    public static void main(String[] args) {
        System.out.println(GCD(24, 60));
    }

    static int GCD(int a, int b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }
}
