package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );
		}
	}
	
	public static int countClap(int number) {
		int result = 0;
		String numLength = number+"";
		int length = numLength.length();
		
		for(int i = 0; i < length; i++) {
			if(numLength.substring(i, i+1).equals("3") || 
			   numLength.substring(i, i+1).equals("6") || 
			   numLength.substring(i, i+1).equals("9")) {
				result++;
			}
		}
		
		return result;
	}
}