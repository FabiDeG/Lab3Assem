package Main;

import java.util.Scanner;
import java.util.Stack;

public class DriverP {
	
	static int num = 0;
	Stack<String> DtoH = new Stack<>();

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
				num = Integer.parseInt(scanner.nextLine());
				divDH(num, null);
			}break;
			
			case 2: {
				
			}break;
			}
			
		}while(opc != 2);
			
	}
	
	public static void divDH(int num, String DtoH) {
		int decimal = num;
		int cociente = 0;
		int restante = 0;
		if (decimal >= 16) {
			cociente = (num / 16);
			restante = ((cociente * 16)- decimal);
			System.out.println(cociente + " " + restante);
			
		}
	}
	
	public static void convertir(String num) {
		String[] decimal = num.split(" ");
        for (String decimales : decimal) {
        	switch (decimales) {
        	case "10":
        		break;
        	}
        }
	}

}
