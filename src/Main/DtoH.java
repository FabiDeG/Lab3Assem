package Main;

public class DtoH {
	
	public static void dividir(String dth) {
		
		int num = Integer.parseInt(dth);
	    String hexa = "";
	    char[] caracteres = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	    
	    while (num >= 16) {
	        int cociente = num / 16;
	        int restante = num % 16;
	        hexa = caracteres[restante] + hexa;
	        num = cociente;
	    }
	    
	    hexa = caracteres[num] + hexa;
	    System.out.println("Gracias! El número en hexadecimal es: " + hexa);
	    System.out.println("Volviendo al menu..."
	    		+ " ");
	    System.out.println(" ");
	}

}
