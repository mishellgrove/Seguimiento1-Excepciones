package ui;
import java.util.Scanner;
import exceptions.IdNoMatchException;
import model.Minimarket;
public class Main {



	private static Scanner sc;

	/**
	 * @param args
	 * @throws IdNoMatchException 
	 */
	public static void main(String[] args) throws IdNoMatchException {
		sc = new Scanner(System.in);
		boolean salir = false;
		int tipoOperacion;
		int contador = 0;

		Minimarket mm = new Minimarket();

		while(!salir){
			System.out.println("Bienvenido! Qué desea realizar?");
			System.out.println("1. Ingresar usuario");
			System.out.println("2. consultar numero de personas que han intentado ingresar");
			System.out.println("3. Salir");

			System.out.println("Escribe una de las opciones");
			tipoOperacion = sc.nextInt();

			
			switch (tipoOperacion) {
			case 1:
				if (tipoOperacion == 1){
					int menu = 0;
					contador++;
					
					String ty;
					int id;
					System.out.println("Digite el tipo de documento en mayuscula");
					ty = sc.next();
					System.out.println("Digite el numero de documento");
					id = sc.nextInt();
					mm.addPerson(ty,id);
					break;
				}

			case 2:
				System.out.println(contador);
				break;
			case 3:
				System.exit(3);
				break;
			default:
				System.out.println("Solo numeros entre el 1 y 3");
				break;
			}



		}
	}
}





