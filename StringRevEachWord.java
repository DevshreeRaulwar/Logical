package LogicalPrograms;

public class StringRevEachWord {

	public static void main(String[] args) {
		
		String Str = "Hello Good Evening";
		// expected result -- gninevE dooG olleH
		// expected -- olleH dooG gninevE
		
		String [] Word = Str.split(" ");  // splited string into words
		
		String RevS = " ";
		
		for (String W : Word) {    // Outerloop
			String StringWord = "";
			
			for (int i=W.length()-1; i>=0; i--) {  // innerloop
				
				StringWord = StringWord+W.charAt(i);
				
			}
			RevS = RevS+StringWord+ " ";	
		}
		System.out.println(RevS);
	}

}
