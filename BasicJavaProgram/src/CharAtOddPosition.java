
public class CharAtOddPosition {

	public static void main(String[] args) {
		
     
		
		String s1="Python";
		int Len=s1.length();
		
		
		for (int i=0; i<=Len-1;i++)
			
		{
			if(i%2!=0)
			System.out.println("Char at " + i + " position is " + s1.charAt(i));
			
		}
		
		
		
		
		

	}

}
