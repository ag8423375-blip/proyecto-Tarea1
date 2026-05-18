public class Carro extends Vehiculo
{
    public int puertas;
    public String combustible;

  

    public Carro(int puertas, String combustible,String marca, String modelo, int velocidad )
    {
        super(marca,modelo,velocidad);
        this.puertas = puertas; 
        this.combustible = combustible;
        
    }

    public void setPuertas(int puertas)
    {
        this.puertas = puertas;
    }

    public void setCombustible(String combustible)
    {
        this.combustible = combustible;
    }

    public int getPuertas()
    {
        return puertas;
    }

    public String getCombustible()
    {
        return combustible;
    }
}