/**
 * Tipo-Pokemon
 */
import java.util.*;
import java.util.Scanner;

public class Tipo_Pokemon extends Pokemon
{
  private String tipoPokemon;
  private int nivel;
  private double PoderPokemon;
  private ArrayList <String> listaHabilidades;
  private ArrayList <String> listaDebilidades;

  public Tipo_Pokemon()
  {

    this.tipoPokemon = "";
    this.nivel = 0;
    this.PoderPokemon = 0.0;
    this.listaHabilidades = new ArrayList <String> ();
    this.listaDebilidades = new ArrayList <String> ();

    }

  public Tipo_Pokemon(String nombreP, String sexoP,String tipoPokemon, int nivel,double PoderPokemon,ArrayList <String> listaHabilidades, ArrayList <String> listaDebilidades)
  {
    super(nombreP, sexoP);
    this.tipoPokemon = tipoPokemon;
    this.nivel = nivel;
    this.PoderPokemon = PoderPokemon;
    this.listaHabilidades = listaHabilidades;
    this.listaDebilidades = listaDebilidades;

  }

  public void setTipoPokemon(String tipoPokemon)
  {
    this.tipoPokemon = tipoPokemon;
  }

  public void setNivel (int nivel)
  {
    this.nivel = nivel;
  }

  public void llenarListaHabilidades (String Habilidades)
  {
    Scanner text = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    int cantidad;

    System.out.println("Por favor ingresar la cantidad de habilidades del pokemon");

    cantidad = num.nextInt();

    while(cantidad >= 5 || cantidad <= 0)
    {
      System.out.println("Cantidad de habilidades no valida, por favor ingresa un número valido");

      cantidad = num.nextInt();
    }

    for(int i = 0; i < cantidad; i++)
    {
      System.out.println("Por favor ingresa el nombre de la habilidad " + (i + 1));

      Habilidades = text.nextLine();

      this.listaHabilidades.add(i,Habilidades);

    }
  }

  public void llenarListaDebilidades (String Debilidades)
  {

    Scanner text = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    int cantidad;

    System.out.println("Por favor ingresar la cantidad de debilidades del pokemon");

    cantidad = num.nextInt();

    while(cantidad >= 6 || cantidad <= 0)
    {
      System.out.println("Cantidad de debilidades no valida, por favor ingresa un número valido");

      cantidad = num.nextInt();
    }

    for(int i = 0; i < cantidad; i++)
    {

      System.out.println("Por favor ingresar la debilidad " + (i + 1));

      Debilidades = text.nextLine();

      this.listaDebilidades.add(i,Debilidades);

    }

  }


  // Metodo para imprimir las Habilidades del pokemon en pantalla

  public String getListaHabilidades()
  {

    return listaHabilidades.toString();
  }

  // Metodo para imprimir las Debilidades del pokemon en pantalla

  public String getListaDebilidades()
  {

    return listaDebilidades.toString();

  }

  public void calcularPoderPokemon()
  {

    this.PoderPokemon = nivel * 2000;

  }

  public double getPoderPokemon()
  {
    return PoderPokemon;
  }

  public String To_String()
  {
    return "\u001B[31mNombre Pokemon:\u001B[37m " + super.getNombre() + "\n\u001B[31mSexo Pokemon:\u001B[37m " + super.getSexo() + "\n\u001B[31mTipo pokemon:\u001B[37m "+ tipoPokemon +"\n\u001B[31mNivel Pokemon:\u001B[37m " + nivel + "\n\u001B[31mPoder Pokemon:\u001B[37m " + getPoderPokemon() + "\n\u001B[31mHabilidades:\u001B[37m " + getListaHabilidades() + "\u001B[31m\nDebilidades:\u001B[37m " + getListaDebilidades();
  }
}
