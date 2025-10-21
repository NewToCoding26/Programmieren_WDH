static void main() {
    int n = 15;

    for (int row = 0; row < n; row++) {
        for (int col = 0; col < n; col++) {
            if((row + col) % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

