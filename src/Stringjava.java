
public class Stringjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* String is object which is used to create sequence of character in java */

		String s= "koshu rahul Chanchal";
		//String[]k  = s.split(" ");
		
		String[]k  = s.split("rahul");
		System.out.println(k[0]);
		System.out.println(k[1]);
		System.out.println(k[1].trim());
	
		/*
		 * for(int i=0;i<s.length();i++) { System.out.println(s.charAt(i)); }
		 */
		//for reverse character
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
