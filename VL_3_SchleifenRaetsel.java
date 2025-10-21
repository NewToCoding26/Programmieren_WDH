static void main () {
    System.out.println("Was machen continue und break?");

    while (true) {
        int wuerfel = (int) (Math.random() * 20 + 1);
        if (wuerfel % 2 != 0) {
            continue;
        }
        System.out.println("Der Wuerfel ist " + wuerfel);
        if(wuerfel == 20) {
            System.out.println("Guess I'll die.");
            break;
        }
    }

    System.out.println("Ende");
}
