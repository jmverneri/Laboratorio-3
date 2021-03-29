import java.util.Scanner;

public class Menues
{
	int op;
	char control;
	
	public void User(Scanner scan)
	{
		while(op!=3)
		{
			System.out.println("A que biblioteca deseas accender?");
			System.out.println("1) Cd");
			System.out.println("2) DvD");
			System.out.println("3) Salir");
			
			op= scan.nextInt();
			
			switch(op)
			{
			case 1:
				System.out.println("Ingresando a biblioteca de Cd");
				break;
			case 2:
				System.out.println("Ingresando a biblioteca de DvD");
				break;
			case 3:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			}
		}
	}
	public void BibliotecaCd(Scanner scan)
	{
		CD cd= new CD();
		Biblioteca biblio= new Biblioteca();
		
		while(op!=4)
		{
			System.out.println("Que deseas hacer?");
			System.out.println("1) Ingresar nuevo CD");
			System.out.println("2) Eliminar CD");
			System.out.println("3) Ver CD");
			System.out.println("4) Salir");
			
			op= scan.nextInt();
			
			switch(op)
			{
			case 1:
				;
				break;
			case 2:
				System.out.println("Ingresando a biblioteca de DvD");
				break;
			case 3:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Opcion invalida");
				break;
		}
	}
}


