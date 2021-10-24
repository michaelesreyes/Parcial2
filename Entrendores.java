/**
 * Entrendores
 */
public abstract class Entrendores extends Persona
{

  private String licencia;
  private String region;

  public Entrendores()
  {

    this.licencia = "";
    this.region = "";

  }

  public Entrendores(String nombreE, String edadE, String sexoE,String licencia, String region)
  {
    super(nombreE, edadE, sexoE);
    this.licencia = licencia;
    this.region = region;

  }

  public void setLicencia(String licencia)
  {
    this.licencia = licencia;
  }

  public void setRegion(String region)
  {
    this.region = region;
  }

  public String getLicencia()
  {
    return licencia;
  }

  public String getRegion()
  {
    return region;
  }

  public abstract void calcularPoderEntrenador();

  public abstract String To_String();

}