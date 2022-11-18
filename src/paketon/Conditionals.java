package paketon;

import java.util.Scanner;

public class Conditionals {

public static void main(String[] args) {
	
	
		final String DIA = "Buenos días";
		final String TARDE = "Buenas tardes";
		final String NOCHE = "Buenos noches";
		final String ERROR = "La hora introducida no es válida";
		
		Scanner teclado = new Scanner(System.in); 
		int hora;
		String mensaje;
		
		
		System.out.print("Introduzca una hora: ");
		hora = Integer.parseInt(teclado.nextLine());
		
		if (hora>6 && hora<=12) {
			mensaje = TARDE;
			}else{
				if (hora>13 && hora<=20) {
					mensaje = TARDE;
				}else {
					if (hora>21 && hora <=5) {
						mensaje = NOCHE;
					}else {
						mensaje = ERROR;
					}
				}
		}
		
		
}
}