import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();  
      
       System.out.println(sb.capacity());
       
       sb.append("java is my favourite language");
       System.out.println(sb.capacity());
       
   
       
       System.out.println(sb.capacity());
       
       sb.ensureCapacity(20);
       
       System.out.println(sb.capacity());
       
       sb.ensureCapacity(50);
       
       System.out.println(sb.capacity());
      
		
	}
	
	
	

}
