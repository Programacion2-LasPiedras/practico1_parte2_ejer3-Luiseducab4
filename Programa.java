import java.util.Scanner;

public class Programa {
	
	void iniciar(){
		String or1, or2;
		
		or1=cargarString();
		or2=cargarString();
		menu(or1,or2);
	}
	
	//carga de teclado dos String
	String cargarString(){
		Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese una cadena de texto");
    String cadena=sc.nextLine();
    return cadena;
	}
	
	//despliega menu
  void menu(String cad1, String cad2){
    int menu;
    do{ 
      Scanner sc=new Scanner(System.in);
      System.out.println("");  
      System.out.println("1. Imprimir ambas cadenas y su largo."); 
      System.out.println("2. Comparar igualdad y quien es menor (en caso de ser cadenas distintas).");
      System.out.println("3. Cambiar una cadena a todo mayúsculas y otra a todo minúsculas.");
      System.out.println("4. Cargar nuevamente ambos String");
      System.out.println("0. Salir");
      System.out.println("");
      System.out.println("Ingrese una opcion");
      menu = sc.nextInt(); 
      switch(menu) 
      {
        case 1: 
        case1menu(cad1,cad2);
        break;

        case 2:
        case2menu(cad1,cad2);
        break;

        case 3:
        case3menu(cad1,cad2);
        break;

        case 4:
        iniciar();
        break;

        case 0:
        System.out.println("¡Adiós! :)");
        System.exit(0);
      }
   
      }while (menu !=5);
  }
  void case1menu(String cad1, String cad2){
    System.out.println("");
    System.out.println("El largo de la cadena '" + cad1 + "' es de " + cad1.length() + " caracteres");
    System.out.println("El largo de la cadena '" + cad2 + "' es de " + cad2.length() + " caracteres");
  }
  void case2menu(String cad1, String cad2){
    if (cad1.equals(cad2))
    {
      System.out.println("Las cadenas son iguales");

    }else
    {
      System.out.println("");
      System.out.println("Las cadenas no son iguales");
      if (cad1.length() > cad2.length())
      {
        System.out.println("La cadena menor es '" + cad2 + "'");
      }else
      {
        System.out.println("La cadena menor es '" + cad1 + "'");
      }
    }
  }
  void case3menu(String cad1, String cad2){
    System.out.println("");
    System.out.println("1. Cambiar primera cadena a mayúsculas o minusculas."); 
    System.out.println("1. Cambiar segunda cadena a mayúsculas o minusculas."); 
    System.out.println("");
    
    System.out.println("Ingrese una opcion");
    
    submenu(cad1,cad2);
    
  }
  void submenu(String cad1, String cad2){
    Scanner sc=new Scanner(System.in);
    int submenu = sc.nextInt();
    switch(submenu)
        {
          case 1:
          System.out.println("1. Minusculas");
          System.out.println("2. Mayusculas");
          System.out.println("");
          System.out.println("Ingrese una opcion");
          int submenu1 = sc.nextInt();
          switch(submenu1)
          {
            case 1:
            System.out.println(cad1.toLowerCase());
            break;
            case 2:
            System.out.println(cad1.toUpperCase());
            break;
          }
          break;
          case 2:
          System.out.println("1. Minusculas");
          System.out.println("2. Mayusculas");
          System.out.println("");
          System.out.println("Ingrese una opcion");
          int submenu2 = sc.nextInt();
          switch(submenu2)
          {
            case 1:
            System.out.println(cad2.toLowerCase());
            break;
            case 2:
            System.out.println(cad2.toUpperCase());
            break;
          }
          break;
        }
        
  }
}