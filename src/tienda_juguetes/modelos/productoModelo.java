package tienda_juguetes.modelos;
public class productoModelo {
    //crear variables
    private String idProducto;
    private String nombreProducto;
    //crear constructor
    public productoModelo(String infoId, String infoNombre){
        this.idProducto = infoId;
        this.nombreProducto = infoNombre;
    }
    
   //metodos encapsulamiento

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    public String verInfo(){
        String info = "id: " + this.idProducto + "nombre: " + this.nombreProducto;
        return info;
    }
    
}
