public class Vehiculo
{
    public String marca;
    public String modelo;
    public int velocidad;

    public Vehiculo(String marca, String modelo, int velocidad)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public void setmarca(String marca)
    {
        this.marca = marca;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public void setFecha(int velocidad)
    {
        this.velocidad = velocidad;
    }

    public String getMarca()
    {
        return marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public int getVelocidad()
    {
        return velocidad;
    }
}