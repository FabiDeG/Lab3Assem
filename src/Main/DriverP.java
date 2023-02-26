package Main;

import java.util.Scanner;
import java.util.Stack;

public class DriverP {
	
	static String num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int opc = 0;
		
		do {
			System.out.println("Hola, bienvenido a nuestra calculadora, que deseas realizar?");
			System.out.println("1. Pasar de decimal a hexadecimal");
			System.out.println("2. Pasar de hexadecimal a decimal");
			opc = Integer.parseInt(scanner.nextLine());
			
			switch (opc) {
			case  1: {
				System.out.println("Ingresa el numero en decimal: ");
				num = scanner.nextLine();
				DtoH.dividir(num);
			}break;
			
			case 2: {
				System.out.println("Ingresa el numero en hexadecimal: ");
    			String hexNum = scanner.nextLine();
				int decimalNum = HtoD.converter(hexNum);
    			System.out.println("El numero en decimal es: " + decimalNum);
			}break;
			}
			
		}while(opc != 2);
			
	}
	
}
