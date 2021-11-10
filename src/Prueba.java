import java.sql.*;

public class Prueba {

    public static void main(String[] args) {

        final String DATABASE_URL = "jdbc:sqlserver://GUIDEON;dataBase=Northwind;integratedSecurity=true;";
        final String SELECT_QUERY = "SELECT * FROM Products";

        try (
            Connection connection = DriverManager.getConnection(DATABASE_URL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_QUERY))
        {

            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            while (resultSet.next()){

                for (int i = 1; i <= numberOfColumns; i++){
                    System.out.print(resultSet.getObject(i));

                }

                System.out.println();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
