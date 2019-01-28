import java.io.*;
import java.util.*;

public class PE_23_a {
	public static void main(String[] args){
  ArrayList<Integer> abundantNumbers =new ArrayList<Integer>();
	{
	
	for (int i =1; i<18; i++){
		if (checkAbundance(i)){
			abundantNumbers.add(i);
		System.out.println(abundantNumbers.size());
		}
		System.out.println(abundantNumbers.get(0));
		}

	}

	}


private static boolean checkAbundance(int i){
	int sum=0;
	for(int j=1;j<i;j++){
		if(i%j==0){
			sum+=j;
		}
	}if (sum>i){
		return true;
	}else return false;
}

}




