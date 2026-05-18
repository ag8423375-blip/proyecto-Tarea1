public class Motor extends Vehiculo
{
    public boolean casco;
    public int cilindrada;

    public Motor(boolean casco, int cilindrada,String marca, String modelo, int velocidad)
    {
        super(marca,modelo,velocidad);
        this.casco = casco;
        this.cilindrada = cilindrada; 
    }

     public void setCilindrada(int cilindrada)
    {
        this.cilindrada = cilindrada;
    }

    public void setCasco(boolean casco)
    {
        this.casco = casco;
    }

    public int getCilindrada()
    {
        return cilindrada;
    }

    public boolean getCasco()
    {
        return casco;
    }
}