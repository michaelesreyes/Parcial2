/**
 * Persona
 */
public abstract class Persona
{

  private String nombre;
  private String edad;
  private String sexo;

  public Persona()
  {

    this.nombre = "";
    this.edad = "";
    this.sexo = "";

  }

  public Persona(String nombre, String edad, String sexo)
  {

    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;

  }

  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }

  public void setEdad(String edad)
  {
    this.edad = edad;
  }

  public void setSexo(String sexo)
  {
    this.sexo = sexo;
  }

  public String getNombre()
  {
    return nombre;
  }

  public String getEdad()
  {
    return edad;
  }

  public String getSexo()
  {
    return sexo;
  }


  public abstract String To_String();

}