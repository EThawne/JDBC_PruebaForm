import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String DATABASE_URL = "jdbc:sqlserver://GUIDEON;dataBase=Northwind;integratedSecurity=true;";

    public static Connection conex() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL);
    }

}
