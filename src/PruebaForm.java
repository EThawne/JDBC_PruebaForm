import javax.swing.*;
import java.sql.SQLException;

public class PruebaForm {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            try {
                JFrame frame = new FormProducts();
                frame.setVisible(true);
                frame.setSize(700,600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
    }

}
