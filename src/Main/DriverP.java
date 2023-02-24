package Main;

import java.util.Scanner;

public class DriverP {
	
	static String num = "";

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
				divDH(num);
			}break;
			
			case 2: {
				
			}break;
			}
			
		}while(opc != 2);
			
	}
	
	public static void divDH(String num) {
		String[] decimal = num.split("");
        for (String decimales : decimal) {
        	switch (decimales) {
        	
        	}
        }
	}

}
