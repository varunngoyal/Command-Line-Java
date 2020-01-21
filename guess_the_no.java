import java.util.Random;

class guess_the_no {

	public static void main(String args[]) {
		//Choose a no. in the range of 1 to 10 
		Random r = new Random();
		int luckyno = r.nextInt(10) + 1;	

		System.out.println("Hello, "+ args[0]+"!");	//first argument is your name
		System.out.println("Your lucky no. is "+luckyno);
		System.out.println();

		if(Integer.parseInt(args[1]) == luckyno) {
			System.out.println("Congratulations! You are very lucky,");
			System.out.println("you are going to be a millionare some day!");
			
		} else {
			System.out.println("Sorry man, no match!");
			System.out.println("Better luck next time.");
		}

	}

}
