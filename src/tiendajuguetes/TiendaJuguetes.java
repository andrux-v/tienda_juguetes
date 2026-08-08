package tiendajuguetes;

import tienda_juguetes.modelos.productoDAO;
import java.sql.SQLException;



public class TiendaJuguetes {
    public static void main(String[] args) throws SQLException {
        
        productoDAO objProducto = new productoDAO();
        objProducto.consultarProducto();
        
    }
    
}
