public class Producto
{
    public String nombre;
    public double precio;
    public int cantidad;
    
    public Producto(String nombre, double precio, int cantidad)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public double getPrecio()
    {
        return precio;
    }

    public int getCantidad()
    {
        return cantidad;
    }

}