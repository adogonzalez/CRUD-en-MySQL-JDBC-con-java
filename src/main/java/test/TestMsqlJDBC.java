
package test;

import java.sql.*;




public class TestMsqlJDBC {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3307/tareas_muestra?use SSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
   //       Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url,"root","admin");
          Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona,nombre,apellido,gmail,telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id Persona:" + resultado.getInt("id_persona"));
                System.out.print("Nombre:" + resultado.getNString("nombre"));
                System.out.print("Gmail:" + resultado.getNString("gmail"));
                System.out.print("Telefono:" + resultado.getNString("telefono"));
                System.out.println("");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
