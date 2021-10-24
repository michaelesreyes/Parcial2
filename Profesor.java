/**
 * Profesor
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Profesor extends Persona{

  private String region;
  private String LicenciaProfesor;
  private ArrayList <Tipo_Pokemon> listaPokemonIniciales;

  public Profesor()
  {
    this.region = "";
    this.LicenciaProfesor = "";
    this.listaPokemonIniciales = new ArrayList <Tipo_Pokemon>(3);

  }

  public Profesor (String nombrePro, String edadPro, String sexoPro,String region, String LicenciaProfesor,ArrayList <Tipo_Pokemon> listaPokemonIniciales)
  {

    super(nombrePro, edadPro, sexoPro);
    this.region = region;
    this.LicenciaProfesor = LicenciaProfesor;
    this.listaPokemonIniciales = listaPokemonIniciales;

  }

  public void setRegion(String region)
  {
    this.region = region;
  }

  public void setLicenciaProfesor(String licenciaProfesor)
  {
    this.LicenciaProfesor = licenciaProfesor;
  }

  public String getRegion()
  {
    return region;
  }

  public String getLicenciaProfesor()
  {
    return LicenciaProfesor;
  }

  public void intCrearListaPokemonInicial(String Datos, int DatosN)
  {
    Scanner text = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    Tipo_Pokemon lista = new Tipo_Pokemon();

    for(int i = 0; i < 3; i++)
    {

      System.out.println("Por favor ingresar el nombre del pokemon" + (i+1));

      Datos = text.nextLine();
      lista.setNombre(Datos);

      listaPokemonIniciales.add(i,lista);

      System.out.println("Por favor ingresar el sexo del pokemon " + (i+1));

      Datos = text.nextLine();
      lista.setSexo(Datos);

      listaPokemonIniciales.add(i,lista);

      System.out.println("Por favor ingresar el tipo del pokemon" + (i+1));

      Datos = text.nextLine();
      lista.setTipoPokemon(Datos);

      listaPokemonIniciales.add(i,lista);

      System.out.println("Por favor ingresar el nivel del pokemon" + (i+1));

      DatosN = num.nextInt();
      lista.setNivel(DatosN);

      listaPokemonIniciales.add(i,lista);

      listaPokemonIniciales.get(i).llenarListaHabilidades(Datos);

      listaPokemonIniciales.get(i).llenarListaDebilidades(Datos);

    }

  }


  public String To_String()
  {
    return "\u001B[31mNombre:\u001B[37m " + getNombre() + "\n\u001B[31mEdad:\u001B[37m " + getEdad() + "\n\u001B[31mSexo:\u001B[37m " + getSexo() + "\n\u001B[31mRegión:\u001B[37m " + getRegion() + "\n\u001B[31mLicencia:\u001B[37m " + getLicenciaProfesor() + "\n--------Pokemones iniciales--------" ;
  }

  public void ImprimirListaPokemones()
  {
    for(int i = 0; i < 3; i++)
    {
      System.out.println(listaPokemonIniciales.get(i).To_String());
    }
  }

}