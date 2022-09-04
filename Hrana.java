public class Hrana {


private Kaca kaca = new Kaca();
//naredim nov objekt Kaca, ki je dostopen samo v tem razredu
private int hranaX; // shrani x koor hrane
private int hranaY; // shrani y koor hrane

// določi pozicijo hrane
private final int nakljpozicija = 20;

public void ustvariHrana() {
	//ta razred nic ne vraca(void) ampak v glavno okno rise hrano
    // nastavi x in y hrane na naklj pozicijo
    int lokacija = (int) (Math.random() * nakljpozicija);
    hranaX = ((lokacija * Okno.pridVelikostClena()));

    lokacija = (int) (Math.random() * nakljpozicija);
    hranaY = ((lokacija * Okno.pridVelikostClena()));
   
    if ((hranaX == kaca.KacaX(0)) && (hranaY == kaca.KacaY(0))) {
        ustvariHrana();
       
    }
}
//dobivaš koordinate hrane
public int dobihranaX() {

    return hranaX;
}

public int dobihranaY() {
    return hranaY;
}


}
