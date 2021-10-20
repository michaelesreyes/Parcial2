/**
 * Lider_de_Gimnasio
 */
import java.util.*;
import java.util.Scanner;


public class Lider_de_Gimnasio extends Entrendores {

  private String NombreGimnasio;
  private double poderEntrenador;
  private ArrayList <Tipo_Pokemon> ListaPokemon;
  private String tipoPokemonGimnasio;

  public Lider_de_Gimnasio() 
  {

    this.NombreGimnasio = "";
    this.poderEntrenador = 0;
    this.tipoPokemonGimnasio = "";
    this.ListaPokemon = new ArrayList<Tipo_Pokemon>();

  }
  public Lider_de_Gimnasio (String nombreL, String edadL, String sexoL, String licenciaL, String regionL, String NombreGimnasio, double poderEntrenador, String tipoPokemonGimnasio, ArrayList <Tipo_Pokemon> ListaPokemon) 
  {

    super(nombreL, edadL, sexoL, licenciaL, regionL);
    this.NombreGimnasio = NombreGimnasio;
    this.poderEntrenador = poderEntrenador;
    this.tipoPokemonGimnasio =tipoPokemonGimnasio;
    this.ListaPokemon = ListaPokemon;
    
  }

  public void setNombreGimnasio(String NombreGimnasio)
  {

    this.NombreGimnasio = NombreGimnasio;

  }

  public void setTipoPokemonGimnasio(String tipoPokemonGimnasio)
  {

    this.tipoPokemonGimnasio = tipoPokemonGimnasio;

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

      while(!Datos.equals(getTipoPokemonGimnasio()))
      {
        System.out.println("El tipo ingresado no es valido");

        Datos = text.nextLine();
      }
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

  public String getNombreGimnasio()
  {

    return NombreGimnasio;

  }

  public String getTipoPokemonGimnasio()
  {

    return tipoPokemonGimnasio;

  }

  public String To_String()
  {
    return "\u001B[31mNombre:\u001B[37m " + getNombre() + "\n\u001B[31mEdad:\u001B[37m " + getEdad() + "\n\u001B[31mSexo:\u001B[37m " + getSexo() + "\n\u001B[31mPoder de entrenador:\u001B[37m " + getPoderEntrenador() + "\n\u001B[31mNombreGimnasio:\u001B[37m " + getNombreGimnasio() + "\n\u001B[31mTipo gimnasio:\u001B[37m " + getTipoPokemonGimnasio() +"\n--------Lista Pokemon--------" ;
  }

  public void ImprimirListaPokemones()
  {

    for(int i = 0; i < cantidad ; i++)
    {

      System.out.println(ListaPokemon.get(i).To_String());

    }

  }
}