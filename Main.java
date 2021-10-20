import java.util.*;
import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    
    Scanner text = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    String Dato;
    double entrenadorcito = 0,lidercito = 0;
    int opcion = 2, DatoN = 2,CantidadE = 0,CantidadL = 0,j = 100;
    char opcionL;


    ArrayList <Entrenador_Pokemon> entrenador = new ArrayList <Entrenador_Pokemon> (CantidadE);
    Entrenador_Pokemon entre = new Entrenador_Pokemon();
    ArrayList <Lider_de_Gimnasio> lider = new ArrayList <Lider_de_Gimnasio> (CantidadL);
    Lider_de_Gimnasio Gym = new Lider_de_Gimnasio();
    Profesor profe = new Profesor();

    for(int h = 0; h < j; j++ )
    {

      System.out.println("-------------------Menú Sistema	Pokemon------------------\n1. Crear	\u001B[31mentrenador	pokemon	o	líder	de	gimnasio\u001B[37m.\n2. Imprimir	la	lista	de	\u001B[31mentrenadores pokemon\u001B[37m.\n3. Imprimir	la	lista	de	\u001B[31mlideres	de	gimnasio\u001B[37m.\n4. \u001B[32mComparar	poder\u001B[37m.\n5. Salir.\n----------------------------------------------------------");

      opcion = num.nextInt();

      switch(opcion)
      {

        case 1:

          while(DatoN > 1)
          {
            System.out.println("-------------------Menú Sistema	Pokemon------------------\na. Crear \u001B[31mentrenador\u001B[37m pokemon.\nb. Crear \u001B[31mlíder	de	gimnasio\u001B[37m.\nc. Salir.\n----------------------------------------------------------");

            opcionL = text.next().charAt(0);

          
          
            switch(opcionL)
            {

              case 'a':

                System.out.println("¿Cuántos entrenadores quieres crear?");

                CantidadE = num.nextInt();

                for(int i = 0; i < CantidadE; i++)
                {

                  System.out.println("Por favor ingresar el \u001B[31mnombre del entrenador\u001B[37m.");

                  Dato = text.nextLine();
                  Dato = text.nextLine();
                  entre.setNombre(Dato);

                  entrenador.add(i,entre);

                  System.out.println("Por favor ingresar la \u001B[31medad del entrenador\u001B[37m.");

                  Dato = text.nextLine();
                  entre.setEdad(Dato);

                  entrenador.add(i,entre);

                  System.out.println("Por favor ingresar el \u001B[31msexo del entrenador\u001B[37m.");

                  Dato = text.nextLine();
                  entre.setSexo(Dato);

                  entrenador.add(i,entre);

                  System.out.println("Por favor ingresar la \u001B[31mlicencia del entrenador\u001B[37m.");

                  Dato = text.nextLine();
                  int lince = 0;

                  for(int p = 0; p < CantidadE; p++)
                  {
                    entrenador.get(i).getLicencia();
                    if(Dato.equals(entrenador.get(i).getLicencia()))
                    {
                      lince = 1;
                    }
                  }
                  while(lince == 1)
                  {
                    System.out.println("Esta licencia ya se encuantra registrada, por favor ingresar una licencia valida");

                    Dato = text.nextLine();
                  }
                  entre.setLicencia(Dato);

                  entrenador.add(i,entre);

                  System.out.println("Por favor ingresar la \u001B[31mregion del entrenador\u001B[37m.");

                  Dato = text.nextLine();
                  entre.setRegion(Dato);

                  entrenador.add(i,entre);

                  entrenador.get(i).CrearProfesor();
                  entrenador.get(i).CrearListaPokemon();
                    
                }
                  
              break;

              case 'b':

                System.out.println("¿Cuántos lideres de gimnasio quieres crear?");

                CantidadL = num.nextInt();

                for(int i = 0; i < CantidadL; i++)
                {

                  System.out.println("Por favor ingresar el\u001B[31m nombre del lider de gimnasio\u001B[37m.");

                  Dato = text.nextLine();
                  Dato = text.nextLine();
                  Gym.setNombre(Dato);

                  lider.add(i,Gym);

                  System.out.println("Por favor ingresar la \u001B[31medad del lider de gimnasio\u001B[37m.");

                  Dato = text.nextLine();
                  Gym.setEdad(Dato);

                  lider.add(i,Gym);

                  System.out.println("Por favor ingresar el \u001B[31msexo del lider de gimnasio\u001B[37m.");

                  Dato = text.nextLine();
                  Gym.setSexo(Dato);

                  lider.add(i,Gym);

                  System.out.println("Por favor ingresar la \u001B[31mlicencia del lider de gimnasio\u001B[37m.");

                  Dato = text.nextLine();

                  int lince = 0;
                  for(int p = 0; p < CantidadL; p++)
                  {
                    lider.get(i).getLicencia();
                    if(Dato.equals(lider.get(i).getLicencia()))
                    {
                      lince = 1;
                    }
                  }
                  while(lince == 1)
                  {
                    System.out.println("Esta licencia ya se encuantra registrada, por favor ingresar una licencia valida");

                    Dato = text.nextLine();
                  }

                  Gym.setLicencia(Dato);

                  lider.add(i,Gym);

                  System.out.println("Por favor ingresar la \u001B[31mregion del lider de gimnasio\u001B[37m.");

                  Dato = text.nextLine();
                  Gym.setRegion(Dato);

                  lider.add(i,Gym);

                  System.out.println("Por favor ingresar el \u001B[31mtipo del gimnasio\u001B[37m.");

                  Dato = text.nextLine();
                  Gym.setTipoPokemonGimnasio(Dato);

                  lider.add(i,Gym);

                  System.out.println("Por favor ingresar el \u001B[31mnombre del gimnasio\u001B[37m.");

                  Dato = text.nextLine();
                  Gym.setNombreGimnasio(Dato);

                  lider.add(i,Gym);

                  lider.get(i).CrearListaPokemon();
                    
                }

              break;
              case 'c':

                System.out.println("Adios.");
                DatoN = 0;
          
              break;
            }
          }
          

        break;
        case 2:

          for(int i = 0; i < CantidadE; i++)
          {
            
            System.out.println(entrenador.get(i).To_String());
            entrenador.get(i).ImprimirListaPokemones();
          }

        break;
        case 3:

          for(int i = 0; i < CantidadL; i++)
          {
            
            System.out.println(lider.get(i).To_String());
            lider.get(i).ImprimirListaPokemones();
          }

        break;
        case 4:

          System.out.println("Por favor digite la licencia del entrenador");

          Dato = text.nextLine();
          Dato = text.nextLine();

          int estaE = 0;
          int estaL = 0;
          
          for(int i = 0; i < CantidadE; i++)
          {
            if(Dato == entrenador.get(i).getLicencia())
            {
              entrenadorcito = entrenador.get(i).getPoderEntrenador();

              estaE = 1;
            }
          }

          while(estaE == 0)
          {
            System.out.println("Esta licencia no se encuantra registrada, por favor ingresar una licencia valida");

            Dato = text.nextLine();

          }

          System.out.println("Por favor digite la licencia del lider de gimnasio");
          
          Dato = text.nextLine();
          
          for(int i = 0; i < CantidadL; i++)
          {
            if(Dato == lider.get(i).getLicencia())
            {
              lidercito = lider.get(i).getPoderEntrenador();

              estaL = 1;
            }
          }

          while(estaL == 0)
          {
            System.out.println("Esta licencia no se encuantra registrada, por favor ingresar una licencia valida");

            Dato = text.nextLine();

          }

          if(entrenadorcito >= lidercito)
          {
            System.out.println("Puedes enfrentarte al lider del gimnasio, \u001B[31m¡¡¡¡¡¡buena suerte!!!!!\u001B[37m");
          }
          else
          {
            System.out.println("debes entrenar más para enfrentarte al lider del gimnasio, \u001B[31m¡¡¡¡¡¡Que la fuerza te acompañe!!!!!\u001B[37m");
          }

        break;
        case 5:

          System.out.println("Adios.");
          h = 10 + j;

        break;

      }
    } 
  }
}