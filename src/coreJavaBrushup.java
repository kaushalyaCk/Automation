
public class coreJavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Num=7;
		String website="Java T Points";
		char Letter='k';
		double dec=6.99;
		boolean myCard=true;
		
		System.out.println(Num + "is the value stored in Num vaariable");
		
		//Array
		int arr[]=new int[6];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;
		System.out.println(arr[3]);
		
		int [] arr2= {2,3,5,6,7};
		//System.out.println(arr2[3]);
		//for loop array length=5
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}
		
		String name[]= {"koshu","bubu","golu"};
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
	}

} 