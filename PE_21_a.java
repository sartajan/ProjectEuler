
public class PE_21_a {

	public static void main(String[] args){
		int[] amicablearray= new int[1000];
		int arraycounter=0;
		int counterstore=0;
		int isInArray=0;
		int tempPair=0;
		int tempPair2=0;
		int amicablesum=0;
		
		for(int x=7;x<10001;x++){
			
			tempPair=findDivisorsAddDivisors(x);
			//System.out.println("The original \"x\" number is "+x);
			tempPair2=findDivisorsAddDivisors(tempPair);
		//	System.out.println("The tempPair number is "+tempPair);
			if(x==tempPair2&&x!=tempPair){
				System.out.println(x+" has an amicable pair!! and it is "+tempPair+"!!");
				counterstore=arraycounter;
				isInArray=0;
				while(counterstore>(-1)&&isInArray==0){
					if(amicablearray[counterstore]==x){
						isInArray++;
					}
					counterstore--;
				}
				if(isInArray==0){
					amicablearray[arraycounter]=x;
					System.out.println("First number has been added to amicableArray and it is "+amicablearray[arraycounter]);
					arraycounter++;
					amicablearray[arraycounter]=tempPair;
					System.out.println("First number has been added to amicableArray and it is "+amicablearray[arraycounter]);
					arraycounter++;
				}
			}
		}
		while(arraycounter>(-1)){
			amicablesum+=amicablearray[arraycounter];
			System.out.println("The final amicableSum is "+amicablesum);
			arraycounter--;
		}
		
	}
	
	public static int findDivisorsAddDivisors(int x){
		int[] divisors=new int[1000];
		int tempcounter=0;
		int amicablesum=0;
		int n=1;
		while(n<x){
			if(x%(x-n)==0){
				divisors[tempcounter]=(x-n);
		//		System.out.println(divisors[tempcounter]);
				tempcounter++;
			}
			n++;
		}
		//System.out.println(amicablesum);
		
		while(tempcounter>(-1)){
			amicablesum+=divisors[tempcounter];
			tempcounter--;
		//	System.out.println(amicablesum);
		}
	//	System.out.println("End of findDivisorsAddDivisors loop and the divisor sum is "+amicablesum);
		return amicablesum;
	}
	
	
}
