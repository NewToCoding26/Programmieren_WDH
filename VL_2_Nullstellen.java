// VL_2_Nullstellen x² + px + q
// -p/2 ± √(p²/4 - q)
// Ausgabe: x₀, x₁

static void main() {
    double p = 1.6;
    double q= 0.64;
    double radikand = p * p / 4 -q;

    if (Math.abs(radikand) < 0.000001) {
        System.out.println(-p / 2);
    } else if (radikand < 0) {
            System.out.println("Keine Nullstelle");
            } else {
                double wurzelwert = Math.sqrt  (radikand);
                System.out.println(wurzelwert);
                double x0 = -p/2 + wurzelwert;
                double x1= -p/2 - wurzelwert;
                System.out.println(x0);
                System.out.println(x1);
            }
    System.out.println("Ende");
}
