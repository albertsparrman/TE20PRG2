import javax.swing.*;
import java.awt.peer.SystemTrayPeer;

public class jurgerburger {
    public static void main(String[] args) {
        String hey = JOptionPane.showInputDialog("Säg heeey");
        StringBuffer str = new StringBuffer(hey);
        char e = 'e';

        for (int i = 0; i < hey.length(); i++) {
            if (hey.charAt(i) == e) {
                str.insert(2,'e');
            }
        }
        System.out.println(str);


    }
}
