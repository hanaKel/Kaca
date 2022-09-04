import java.awt.EventQueue;
import javax.swing.JFrame;

public class Igra extends JFrame {

//kle ustvarimo okno, velikost kaj se zgodi ko ga zapremo
Igra() {
    add(new Okno());
    setResizable(false);
    pack();

    setTitle("KAČA");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}


// Funkcija, ki nic ne vraca za argument pa prejme tabelo nizov
public static void main(String[] args) {

    EventQueue.invokeLater(new Runnable() {
        @Override
	//Igrica se zazene
        public void run() {
            JFrame frame = new Igra();
            frame.setVisible(true);
        }
    });
}
}
