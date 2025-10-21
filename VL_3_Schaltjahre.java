static void main() {
    int j = 2024;
    boolean regel1 = j % 4 == 0;
    boolean regel2 = j % 100 == 0;
    boolean regel3 = j % 400 == 0;

    // Regel 1: Jahr durch 4 teilbar
    // Regel 2: Ausnahme JAhr durch 100 teilbar
    // Regel 3: Ausnaheme der Ausnahme: Jahr durch 400 teilbar

    boolean istSchaltjahr = regel1 &&  (!regel2 || regel3);

    System.out.println(istSchaltjahr);

    if(regel1) {
        if(regel2) {
            if (regel3) {
                System.out.println("ja");
            } else {
                System.out.println("nein");
            }   
        } else {
            System.out.println("ja");
        }
    } else {
        System.out.println("nein");
    }
}
