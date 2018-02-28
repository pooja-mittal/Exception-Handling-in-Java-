public class Test1 {

	public static void main(String[] args) {
		try {
			int a=args.length;
			System.out.println("a " + a);
			int b=42/a;
		 
			try {
				if(a==1)
				a=a/(a-a);
				
					else if(a==2) {
						int c[]= {1};
					c[42]=99;
				}
			} catch(ArithmeticException e) {
			System.out.println("ist exception " + e);
			
		}
		}catch(ArrayIndexOutOfBoundsException e ) {
				System.out.println("nested exception " + e);
			}
		
		
		 

	}

}