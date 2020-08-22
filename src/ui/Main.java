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
		int tipoOperacion;
		
		Minimarket mm = new Minimarket();
		
		System.out.println("Bienvenido! ¡Qué desea realizar?");
		System.out.print("1.Ingresar usuario\n2.consultar numero de personas que han intentado ingresar\n3.Salir\n");
		tipoOperacion = sc.nextInt();
		int contador = 0;
		
				switch (tipoOperacion) {
				case 1:
					
					String ty;
					int id;
					System.out.println("Digite el tipo de documento en mayuscula");
					ty = sc.next();
					System.out.println("Digite el numero de documento");
					id = sc.nextInt();
					mm.addPerson(ty,id);
					contador++;
					System.out.println("¿desea agregar mas?, 1= si, 2= no");
					tipoOperacion = sc.nextInt();
					break;
				case 2:
					System.out.println(contador);
					break;
				case 3:
					System.exit(3);
					break;
				default:
					System.out.println("El operador es incorrecto");
					break;
				}

			}

		}

