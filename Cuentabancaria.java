public class Cuentabancaria
{
    public String nombre2;
    public int cuenta;
    public String tipocuenta;

    public Cuentabancaria(String nombre2, int cuenta, String matricula)
    {
        this.nombre2 = nombre2;
        this.cuenta = cuenta;
        this.tipocuenta = tipocuenta;
    }

    public void setNombre(String nombre2)
    {
        this.nombre2 = nombre2;
    } 

    public void setCuenta(int cuenta)
    {
        this.cuenta = cuenta;
    }

    public void setTipocuenta(String tipocuenta)
    {
        this.tipocuenta = tipocuenta;
    }

    public String getNombre()
    {
        return nombre2;
    }

    public int getCuenta()
    {
        return cuenta;
    }

    public String getTipocuenta()
    {
        return tipocuenta;
    }
}