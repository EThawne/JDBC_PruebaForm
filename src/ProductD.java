import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductD {

    private ResultSet productos;
    private ResultSetMetaData metaData;
    private final Statement consulta;
    DefaultTableModel model;

    public ProductD () throws SQLException {
        consulta = Conexion.conex().createStatement();
        model = new DefaultTableModel();
    }

    private void recuperarProductos () throws SQLException {
        productos = consulta.executeQuery("Select * from Products");
        metaData = productos.getMetaData();
    }

    public void llenarTabla (JTable tabla) throws SQLException {
        recuperarProductos();
        int columnas = metaData.getColumnCount();
        Object [] fila = new Object[columnas];
        while (productos.next()){
            for (int i = 0; i < columnas; i++) {
                fila[i] = productos.getObject(i + 1);
            }
            model.addRow(fila);
        }
        tabla.setModel(model);
    }


}
