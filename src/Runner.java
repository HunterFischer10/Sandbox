
public class Runner {
	
	public static void main(String[] args) {
		
	

	int numberBits = 10;
	int bite = 8; //spelled wrong to avoid a keyword conflict
	int nibble = 4;
	int byteAnswer = 0, byteRemainder = 0;
	
	
	byteRemainder = numberBits % 8;
	byteAnswer = numberBits/bite;
	System.out.println("bits = " + numberBits + " bytes = " + byteAnswer + " remainder = " + byteRemainder);
	
}
}
