import java.io.*;
import java.util.Scanner;

public class PE_18_a {

public static void main(String[] args){

	String filename= "Problem18_input.txt";
	int array[][]=new int[15][15];

	int m =0;
	int n =0;
	try{
		
		Scanner input =new Scanner(new File(filename));
		for ( n=0; n<15; n++){
			for ( m=0; m<=n; m++){
				array[m][n]=input.nextInt();
				System.out.println(array[m][n]);	
			}
			m=0;
		}
		
		System.out.println(array[0][14]);
		input.close();

		for (m=14; m>0;m--){
			for (n=0;n<14;n++){
				System.out.println("row number " +m +" and column number: "+ n);
				System.out.println("The cell value is: "+array[n][m]);
			array[n][m-1]+=Math.max(array[n][m], array[n+1][m]);
			} 
		}
		System.out.println(array[0][0]);
	}

	catch(FileNotFoundException ex){
		System.out.println("Unable to open file '"+filename+"'");
	}
	
}
}
