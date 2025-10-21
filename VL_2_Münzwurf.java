static void main() {
 //   double zufallsZahl = Math.random(); // [0,1)
 //   System.out.println("Werrt der Zufallszahl: " + zufallsZahl);

 //   double richtigeBreite = zufallsZahl * 6; // [0,6)

 //   int ohneNachkomma = (int) richtigeBreite;

 //   int wuerfelAugenZahl = ohneNachkomma + 1;



    int wuerfel;
    do{
        wuerfel = (int) (Math.random() * 6 + 1);
        System.out.println(wuerfel);
    } while (wuerfel != 6);

    System.out.println(".");
}