package tienda_juguetes.modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String url;
    private String usuario;
    private String clave;
    private Connection conex;
    
    public Conexion () throws SQLException {
        this.url = "jdbc:mysql://localhost:3306/juguetes";
        this.usuario = "root";
        this.clave = "";
    }
    
    public Connection hacerConexion()  throws SQLException{
        this.conex = DriverManager.getConnection(this.url, this.usuario, this.clave);
        System.out.println("Conexion exitosa...");
        return conex;
    }
    
    public void CerrarConexion() throws SQLException{
        this.conex.close();
        System.out.println("Conexion finalizada...");
    }
}    

