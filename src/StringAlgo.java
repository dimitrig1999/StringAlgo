import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class StringAlgo {

	public static void main(String[] args) {
		
		// read file...
		File file = new File("string_assignment.dat");
		
		// for taking input.....
		Scanner scnr;
		
		// number of input pairs...
		int numberofInput=0;
		// string list
		ArrayList<String> stringArray = new ArrayList<String>();
		// string length list
		ArrayList<Integer> stringLengthArray = new ArrayList<Integer>();
		// read file and inserting into arraylists...
		String line="";
		try {
			int i=0;
			scnr = new Scanner(file);
			while(scnr.hasNextLine()){
				   if (i==0)
				   {
					   line = scnr.nextLine();
					   numberofInput=Integer.parseInt(line);  
					   i++;
				   }
				   line = scnr.nextLine();
				   int L=Integer.parseInt(line);
				   stringLengthArray.add(L);
				   line = scnr.nextLine();
				   stringArray.add(line);
				   
				   
				}
			
			// calling algorithm method for each pair of string ..........
			for(int j=0; j<stringLengthArray.size(); j++)
			{
				System.out.println("*********************************************************");
				String distinct=getdistinctCharecterString(stringArray.get(j),stringLengthArray.get(j));
				System.out.println("String:  "+stringArray.get(j));
				System.out.println("Lenght:  "+stringLengthArray.get(j));
				System.out.println("Sub String:  "+distinct);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not found");
		}
		
		

	}
	// Algorithm for distinct string
	public static String getdistinctCharecterString(String str,int length)
	{
		String distinct="";
		// set for storing distinct character....
		Set<Character> hash_Set = new HashSet<Character>();
		for(int i=0; i<str.length(); i++)
		{
			
			// add char to set
			hash_Set.add(str.charAt(i));
			
			
		}
		
		// adding character to distinct string....
		int i=0;
		int j=0;
		while(j!=1)
		{
			for(char chr : hash_Set)
			{
				   i=i+1;
				   distinct=distinct+chr;
				   if(i==length)
				   {
					   j++;
					   break;
				   }
				   
			}
		}
		
		
		// return distinct string......
		return distinct;
	}
	

}
