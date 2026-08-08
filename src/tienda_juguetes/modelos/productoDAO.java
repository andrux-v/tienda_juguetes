package tienda_juguetes.modelos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class productoDAO {
    public Conexion objconex;
    
    public productoDAO() throws SQLException{
        this.objconex = new Conexion();
    }
    public void consultarProducto() throws SQLException{
        String textoSql = "SELECT * FROM producto";
        Connection connex = (Connection) this.objconex.hacerConexion();
        PreparedStatement consultaSql = connex.prepareStatement(textoSql);
        ResultSet resultadoSql = consultaSql.executeQuery();
        
        while (resultadoSql.next()){
            String id = resultadoSql.getString("id_producto");
            String nombre = resultadoSql.getString("nombre_producto");
            System.out.println("Codigo: " + id + " - " + "Producto: " + nombre);
        }
        connex.close();
    }
    
    public void guardarProductos(productoModelo objProdModelo) throws SQLException{
        Connection connex = this.objconex.hacerConexion();
        String textoSql = "INSERT INTO producto (id_producto, nombre_producto)"
                + " VALUES (?,?)";
        PreparedStatement consultaSql = connex.prepareStatement(textoSql);
        
        consultaSql.setString(1, objProdModelo.getIdProducto());
        consultaSql.setString(2, objProdModelo.getNombreProducto());
        consultaSql.executeUpdate();
    }
              
}
