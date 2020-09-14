import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int input = Integer.parseInt(binary); 
        int exponent = 0;
        int decimal = 0;
        while(input != 0) {
            decimal += (input % 10) * Math.pow(2,exponent);
            input /= 10;
            exponent++;
        }
        return decimal;
    }   
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Input Binary: ");
		String binary_value = scan.nextLine();
		System.out.println("Here is the value in decimal: " + binaryToDecimal(binary_value));
    }
}
