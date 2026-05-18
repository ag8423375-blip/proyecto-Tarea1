public class Estudiante
{
    public String nombre1;
    public int matricula;
    public String carrera;  

   public Estudiante(String nombre1, int matricula, String carrera)
    {
       this.nombre1 = nombre1;
       this.matricula = matricula;
       this.carrera = carrera;
    }

    public void setNombre(String nombre1)
    {
        this.nombre1 = nombre1;
    }

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public void setCarrera(String carrera)
    {
        this.carrera = carrera;
    }

    public String getNombre()
    {
        return nombre1;
    }

    public int getMatricula()
    {
        return matricula;
    }

    public String getCarrera()
    {
        return carrera;
    }
  
}