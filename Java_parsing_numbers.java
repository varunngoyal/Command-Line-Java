class cmd_java {

	public static void main(String args[]) {
		int i=0;

		try {
			//check for non-numeric arguments
			int sum = 0;
			for(i=0;i<args.length;i++) {
				//System.out.println(i+": "+args[i]);
				//sum of arguments
				sum += Integer.parseInt(args[i]);
			}
			System.out.println("sum of the "+args.length+" arguments: "+sum);
		} catch(NumberFormatException e) {
			System.err.println("The argument "+args[i]+" is not an Integer!");		
		}
	}
}
