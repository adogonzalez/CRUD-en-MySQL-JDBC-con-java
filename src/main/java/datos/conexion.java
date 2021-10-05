
package datos;

import java.sql.*;

//Esta es la clase exclusiva de conexion a la base de datos "class conexion" se crea la conexion y tambien se cierran
public class conexion {
    private static final String JDBC_URL= "jdbc:mysql://localhost:3307/tareas_muestra?use SSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER ="root";
    private static final String JDBC_PASSWORD = "admin";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER, JDBC_PASSWORD);
    }
    
    public static void  close(ResultSet rs) throws SQLException{
        rs.close();
    }
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
