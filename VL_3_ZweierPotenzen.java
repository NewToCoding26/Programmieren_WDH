// Eingabe: int n
// Ausgabe: 1, 2, 4, 8, 16
// zur Erinnerung: Math.pow(1, m) // 2^m

static void main () {
    int n = 4;

    //int aktuellerExponent = 0;
    //while (aktuellerExponent <= n) {
    //    System.out.println(Math.pow(2, aktuellerExponent++));
   // }

    for (int aktuellerExponent = 0; aktuellerExponent <= n; aktuellerExponent++) {
        System.out.println(Math.pow(2, aktuellerExponent));
    }
}