static void main() {
    double t = 1.5;
    double x0 = 2;
    double v0 = 10;

    double g = 9.81;
    double formel = x0 + v0 * t - g * t * t / 2;

    System.out.println(formel);

}