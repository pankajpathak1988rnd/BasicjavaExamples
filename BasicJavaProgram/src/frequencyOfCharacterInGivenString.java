
public class frequencyOfCharacterInGivenString {

	public static void main(String[] args) {
		
		
		String s1="Welcome to the java world";
		char ch='o';
		
		int count=0;
		
		for (int i=0;i<=s1.length()-1;i++)			
		{
			if(s1.charAt(i)==ch)
			{
				//System.out.println(ch);
				count++; 
			}
		}
		
		System.out.println("Frequency for characher " + ch + " is " + count );
		//System.out.println("Frequency for characher " + ch + " is " + count );
						

	}

}
