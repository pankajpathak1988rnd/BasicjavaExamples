//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class VowelCountsInGivenString {
//	
//	
//	ArrayList<Character> al=new ArrayList<Character>();
//	
//	
//	VowelCountsInGivenString() {
//		
//		al.add('A');al.add('a');
//		al.add('E');al.add('e');
//		al.add('I');al.add('i');
//		al.add('O');al.add('o');
//		al.add('U');al.add('u');
//	}
//	
//	
//	
//	
//	private boolean isVowel(char c) {
//		
//		for (int j=0;j<=al.size()-1;j++) {
//			
//			if(c==al.get(j)) {
//				return true;
//			}
//			
//			
//		}
//		
//		return false;
//	}
//	
//
//
//
//	private int vowelcount(String str) {
//		
//		int count=0;
//		
//		for(int i=0;i<=str.length()-1;i++) {
//			char ch=str.charAt(i);
//			 if(ch.isVowel(c)) {
//				 count++;
//			 }
//						
//		
//		}
//		return count;
//	}
//
//	
//	
//	
//
//	public static void main(String[] args) {
//
//		
//		
//		Scanner MyString= new Scanner(System.in);
//		
//		System.out.println("Enter the String for which vowel count is neeed");
//		
//		String Str=MyString.nextLine();
//		
//		
//		
//		VowelCountsInGivenString obj=new VowelCountsInGivenString();
//		
//		
//		int VowelCount=0;
//		
//		VowelCount=obj.vowelcount(Str);
//		
//		System.out.println("Number if vowel in the given string is: " + VowelCount);
//		
//		
//		
//		
//		
//		
//		
//
//	}
//
//
//
//}
