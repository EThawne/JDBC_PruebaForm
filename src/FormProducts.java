import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import java.sql.SQLException;

public class FormProducts extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton b_buscar;
    private JTable tablaProductos;
    private final ProductD datos;

    public FormProducts() throws SQLException {
        setContentPane(panel1);
        datos = new ProductD();
        b_buscar.addActionListener(e -> {
            try {
                mostrar();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
    }

    public void mostrar () throws SQLException {

        datos.llenarTabla(tablaProductos);
        tablaProductos.setVisible(true);
    }
}
