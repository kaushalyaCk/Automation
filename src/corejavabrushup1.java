import java.util.ArrayList;

public class corejavabrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr = {2,3,5,6,7};
		
	//for(int i=0;i<arr.length;i++)
	/*
	 * { System.out.println(arr[i]); }
	 */
	
	int [] arr1 = {2,3,5,6,7,8,10};
	//divisible by 2
	for(int i=0;i<arr1.length;i++)
	{
		if(arr1[i]%2==0)
		{
			System.out.println(arr1[i]);
			//break;
		}
		else
		{
			System.out.println(arr1[i]+ "not multiple of 2");
		}
		
	}
	
	
	
	/*
	 * String[] r= {"koshu","bubu","puchu"}; for(int i=0;i<r.length;i++) {
	 * System.out.println(r[i]);
	 * 
	 * }
	 */
	
	/*
	 * for(String each:r) { System.out.println(each); }
	 */
	
	
	//Array list concept
	ArrayList <String>a= new ArrayList<String>();
	a.add("koshu");
	a.add("baby");
	a.add("nanku");
	//a.remove(2);
	System.out.println(a.get(2));
	}

}
