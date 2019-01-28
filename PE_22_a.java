import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Collections.*;

public class PE_22_a {
	
public static void main(String args[]){
		
	String filename = "p022_names.txt";
	List<String> names= new ArrayList<String>();
	String[] alphabets= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	int n=0;
	try{
		Scanner input = new Scanner(new File(filename));
		input.useDelimiter("\"");
		System.out.println("the delimiter is "+input.delimiter());
		names.add(input.next());
		System.out.println(names.get(n));
		n++;
		input.useDelimiter("\",\"");
		System.out.println("the delimiter is "+input.delimiter());
		while(input.hasNext()){
			names.add(input.next());
			System.out.println(names.get(n));
			n++;
		}
	
	int alphabetscore=0;
	int namescore=0;
	int totalnamescore=0;
	System.out.println("the arraylist size is "+n);
	
	Collections.sort(names);
	
	
	for (int p=n-1; p>(-1);p--){
		System.out.println("In the first for Loop! and the name being examined is "+names.get(p));
		namescore=p+1;
		System.out.println("The namescore is "+namescore);
		alphabetscore=0;
		for (int o=(names.get(p).length()-1); o>(-1);o--){
			//System.out.println("In the Second for Loop! and character length is "+names.get(p).length());
			//System.out.println(" \"O\" int is "+o);
			for(int k=(alphabets.length-1); k>0;k--){
				//System.out.println("K character length is "+alphabets.length);
				//System.out.println("In the Third for Loop!");
				String a_letter = Character.toString((names.get(p).charAt(o)));
				//System.out.println("The Character being examined is "+names.get(m).charAt(o));
				if(a_letter.equals(alphabets[k])){
					alphabetscore+=k;
					//System.out.println("Its a match! The character currently is "+alphabets[k]+" and its value is "+k);
					//System.out.println("the alphabet score for "+names.get(p)+" is "+alphabetscore);
				}
			//System.out.println("The 3rd loop namescore is "+namescore);
			}
		}
		namescore*=alphabetscore;
		System.out.println("The final namescore for "+names.get(p)+" is "+namescore);
		totalnamescore+=namescore;
	}
	System.out.println("Total score "+totalnamescore);
	}
		
	catch(FileNotFoundException ex){
		System.out.println("Unable to open file '"+filename+"'");
	}

	
}
}
