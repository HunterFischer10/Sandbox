import java.util.Scanner;
public class Runner {
	
	public static void main(String[] args) {
		
	/*

	int numberBits = 10;
	int bite = 8; //spelled wrong to avoid a keyword conflict
	int nibble = 4;
	int byteAnswer = 0, byteRemainder = 0;
	
	
	byteRemainder = numberBits % 8;
	byteAnswer = numberBits/bite;
	System.out.println("bits = " + numberBits + " bytes = " + byteAnswer + " remainder = " + byteRemainder);
	
	*/
	
	/*** How to handle mixed case y, Y, yes, Yes, YES ... ***/
	
	
	Scanner kbd = new Scanner(System.in);
	System.out.println("\n\n\nHello, enter your answer (Y/N)");
	String answer = kbd.nextLine().toUpperCase();
	System.out.println("You have entered: " + answer);
	
	//decision time!
	if(answer.equals("Y") || answer.equals("YES")) {
		
		System.out.println("You have selected YES!");
	}else if(answer.equals("N") || answer.equals("NO")) {
		
		System.out.println("You have selected NO!");
		
	}else {
		System.out.println("I am sooooo confused! What do you want??? Please, pretty please try again!");
	}
	
	
	
	
	
	
	
}
}
