/**
 * Entrenador_Pokemon
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Entrenador_Pokemon extends Entrendores
{

  private double poderEntrenador;
  private ArrayList <Tipo_Pokemon> ListaPokemon;
  private Profesor ProfesorAsignado;

  public Entrenador_Pokemon()
  {

    this.poderEntrenador = 0.0;
    this.ProfesorAsignado = new Profesor();
    this.ListaPokemon = new ArrayList <Tipo_Pokemon> ();

  }

  public Entrenador_Pokemon(String nombreEn, String edadEn, String sexoEn, String licenciaEn, String regionEn, int poderEntrenador, Profesor ProfesorAsignado,ArrayList <Tipo_Pokemon> ListaPokemon)
  {

    super(nombreEn, edadEn, sexoEn, licenciaEn, regionEn);
    this.poderEntrenador = poderEntrenador;
    this.ProfesorAsignado = ProfesorAsignado;
    this.ListaPokemon = ListaPokemon;

  }

  int cantidad, DatosN;

  public void CrearListaPokemon()
  {

    Scanner text = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    Tipo_Pokemon lista = new Tipo_Pokemon();


    String Datos;

    System.out.println("¿Cuántos Pokemones desea añadir?");

    cantidad = num.nextInt();

    while(cantidad > 5 || cantidad <= 0)
    {

      System.out.println("Cantidad de pokemones no valida, por favor ingresa un número valido");

      cantidad = num.nextInt();

    }

    for(int i = 0; i < cantidad; i++)
    {

      System.out.println("Por favor ingresar el \u001B[31mnombre del pokemon\u001B[37m " + (i+1));

      Datos = text.nextLine();
      lista.setNombre(Datos);

      ListaPokemon.add(i,lista);

      System.out.println("Por favor ingresar el \u001B[31msexo del pokemon\u001B[37m " + (i+1));

      Datos = text.nextLine();
      lista.setSexo(Datos);

      ListaPokemon.add(i,lista);

      System.out.println("Por favor ingresar el \u001B[31mtipo del pokemon\u001B[37m " + (i+1));

      Datos = text.nextLine();
      lista.setTipoPokemon(Datos);

      ListaPokemon.add(i,lista);

      System.out.println("Por favor ingresar el \u001B[31mnivel del pokemon\u001B[37m " + (i+1));

      DatosN = num.nextInt();
      lista.setNivel(DatosN);
      calcularPoderEntrenador();

      ListaPokemon.add(i,lista);

      ListaPokemon.get(i).llenarListaHabilidades(Datos);

      ListaPokemon.get(i).llenarListaDebilidades(Datos);

    }
  }

  public void calcularPoderEntrenador()
  {

    for(int i = 0; i < cantidad; i++)
    {
      ListaPokemon.get(i).calcularPoderPokemon();
      poderEntrenador = poderEntrenador + ListaPokemon.get(i).getPoderPokemon();
    }

  }
  public double getPoderEntrenador()
  {
    return poderEntrenador;
  }

  public void CrearProfesor()
  {

    Scanner text = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    String Datos = "";
    int DatosN = 0;

    System.out.println("Por favor ingresar el \u001B[31mnombre del profesor asigando\u001B[37m");

    Datos = text.nextLine();
    ProfesorAsignado.setNombre(Datos);

    System.out.println("Por favor ingresar la \u001B[31medad del profesor asigando\u001B[37m");

    Datos = text.nextLine();
    ProfesorAsignado.setEdad(Datos);

    System.out.println("Por favor ingresar el \u001B[31msexo del profesor asigando\u001B[37m");

    Datos = text.nextLine();

    ProfesorAsignado.setSexo(Datos);

    System.out.println("Por favor ingresar la \u001B[31mregion del profesor asigando\u001B[37m");

    Datos = text.nextLine();
    String Region = getRegion();

    while(!Datos.equals(Region))
    {
      System.out.println("La region no es valida");

      Datos = text.nextLine();
    }
    ProfesorAsignado.setRegion(Datos);

    System.out.println("Por favor ingresar la \u001B[31mlicencia del profesor asigando\u001B[37m");

    Datos = text.nextLine();
    ProfesorAsignado.setLicenciaProfesor(Datos);

    ProfesorAsignado.intCrearListaPokemonInicial(Datos, DatosN);

  }

  public String To_String()
  {
    return "\u001B[31mNombre:\u001B[37m " + getNombre() + "\n\u001B[31mEdad:\u001B[37m " + getEdad() + "\n\u001B[31mSexo:\u001B[37m " + getSexo() + "\n\u001B[31mRegion del entrenador:\u001B[37m "+ getRegion() + "\n\u001B[31mLicencia deL entrenador:\u001B[37m "+ getLicencia() + "\n\u001B[31mPoder de entrenado:\u001B[37m " + getPoderEntrenador() + "\n--------Profesor Asignado--------" + ProfesorAsignado.To_String();
  }

  public void ImprimirListaPokemones()
  {

    ProfesorAsignado.ImprimirListaPokemones();

    System.out.println("\n--------Lista Pokemon--------");

    for(int i = 0; i < cantidad; i++)
    {
      System.out.println(ListaPokemon.get(i).To_String());
    }
  }

}