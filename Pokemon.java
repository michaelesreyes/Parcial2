/**
 * Pokemon
 */
public abstract class Pokemon
{

  private String nombre;
  private String sexo;

  public Pokemon()
  {

    this.nombre = "";
    this.sexo = "";

  }

  public Pokemon (String nombre, String sexo)
  {

    this.nombre = nombre;
    this.sexo = sexo;

  }

  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }

  public void setSexo(String sexo)
  {
    this.sexo = sexo;
  }

  public String getNombre()
  {
    return nombre;
  }

  public String getSexo()
  {
    return sexo;
  }

  public abstract void calcularPoderPokemon();

  public abstract String To_String();

}