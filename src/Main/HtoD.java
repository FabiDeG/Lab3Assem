package Main;

public class HtoD {
    
    public static int converter(String hexNum) {
        int decNum = 0;
        String hexDigits = "0123456789ABCDEF";
        hexNum = hexNum.toUpperCase();
        
        for (int i = 0; i < hexNum.length(); i++) {
            char hexChar = hexNum.charAt(i);
            int digitValue = hexDigits.indexOf(hexChar);
            decNum = 16 * decNum + digitValue;
        }
        
        return decNum;
    }
}