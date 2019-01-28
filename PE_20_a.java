import java.math.BigInteger;


public class PE_20_a {

	public static void main(String[] args){
	BigInteger sum =BigInteger.valueOf(1);
	BigInteger remainder= BigInteger.valueOf(0);
	BigInteger numbersum=BigInteger.valueOf(0);
	
		for (int n =100; n>0;n--){
			sum=sum.multiply(BigInteger.valueOf(n));
		}
		System.out.println(sum);
		while (!sum.equals(BigInteger.ZERO)){
			remainder=remainder.add(sum.remainder(BigInteger.TEN));
			numbersum=numbersum.add(remainder);
			sum=sum.divide(BigInteger.TEN);
			System.out.println(remainder);
		//	System.out.println(numbersum);
		}
	}
}
