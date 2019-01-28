

public class PE_19_a {



	
	public static void main(String[] args){

		int tempDay=3;
		int totalSundayCounter=0;
		int year =1901;
		while(year<2001){
			totalSundayCounter+=yearlyCount(year, tempDay);
			tempDay= newtempDay(year, tempDay);
			System.out.println(totalSundayCounter);
			year++;
		}
	}
	
	public static boolean isLeapYear(int year){ 
		if ((year%100==0 && year%400==0) || (year%100!=0 && year%4==0)){
			return true;	
		}
		else return false;
	}
	
	public static int yearlyCount(int year, int tempDay){
		int yearlySundayCounter=0;
		String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		String day[] ={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
	
			for (int n=0; n<12; n++){
				if (month[n]==("April")||month[n]=="September"||month[n]=="June"||month[n]=="November"){
					if (day[tempDay]=="Sunday"){
						yearlySundayCounter++;
					} else yearlySundayCounter+=0;
					System.out.println("The temDay number is "+tempDay+" and I am in the September loop!");
					tempDay+=30%7;
					if (tempDay>6){
						tempDay-=7;
					} else tempDay+=0;
					
					System.out.println("The month ending is "+month[n]+" the tempDay is "+tempDay+" and the day is "+day[tempDay]);
				}
				else if (month[n]=="January"||month[n]=="March"||month[n]=="May"||month[n]=="July"||month[n]=="August"||month[n]=="October"){
					if (day[tempDay]=="Sunday"){
						yearlySundayCounter++;
					} else yearlySundayCounter+=0;
					System.out.println("The tempDay number is "+tempDay+" and I am in the January loop!");
					tempDay+=31%7;
					if (tempDay>6){
						tempDay-=7;
					} else tempDay+=0;
					
					System.out.println("The month ending is "+month[n]+" the tempDay is "+tempDay+" and the day is "+day[tempDay]);
				}
				else if (month[n]=="February"&&isLeapYear(year)){
					if (day[tempDay]=="Sunday"){
						yearlySundayCounter++;
					} else yearlySundayCounter+=0;
					System.out.println("The temDay number is "+tempDay+" I am in the LeapYear Loop!");
					tempDay+=29%7;
					if (tempDay>6){
						tempDay-=7;
					} else tempDay+=0;
						
					System.out.println("The month ending is "+month[n]+" the tempDay is "+tempDay+" and the day is "+day[tempDay]);
				}
				else{
					if (day[tempDay]=="Sunday"){
						yearlySundayCounter++;
					} else yearlySundayCounter+=0;
					System.out.println("The temDay number is "+tempDay+" I am in the Regular February loop!");
					tempDay+=28%7;
					if (tempDay>6){
						tempDay-=7;
					} else tempDay+=0;
						
					System.out.println("The month ending is "+month[n]+" the tempDay is "+tempDay+" and the day is "+day[tempDay]);
				}
		}
		 return yearlySundayCounter;
	}
	
	public static int newtempDay(int year, int tempDay){
		int yearlySundayCounter=0;
		String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		String day[] ={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
	
			for (int n=0; n<12; n++){
				if (month[n]==("April")||month[n]=="September"||month[n]=="June"||month[n]=="November"){
					if (day[tempDay]=="Sunday"){
						yearlySundayCounter++;
					} else yearlySundayCounter+=0;
					System.out.println("The temDay number is "+tempDay+" and I am in the September loop!");
					tempDay+=30%7;
					if (tempDay>6){
						tempDay-=7;
					} else tempDay+=0;
					
					System.out.println("The month ending is "+month[n]+" the tempDay is "+tempDay+" and the day is "+day[tempDay]);
				}
				else if (month[n]=="January"||month[n]=="March"||month[n]=="May"||month[n]=="July"||month[n]=="August"||month[n]=="October"||month[n]=="December"){
					if (day[tempDay]=="Sunday"){
						yearlySundayCounter++;
					} else yearlySundayCounter+=0;
					System.out.println("The tempDay number is "+tempDay+" and I am in the January loop!");
					tempDay+=31%7;
					if (tempDay>6){
						tempDay-=7;
					} else tempDay+=0;
					
					System.out.println("The month ending is "+month[n]+" the tempDay is "+tempDay+" and the day is "+day[tempDay]);
				}
				else if (month[n]=="February"&&isLeapYear(year)){
					if (day[tempDay]=="Sunday"){
						yearlySundayCounter++;
					} else yearlySundayCounter+=0;
					System.out.println("The temDay number is "+tempDay+" I am in the LeapYear Loop!");
					tempDay+=29%7;
					if (tempDay>6){
						tempDay-=7;
					} else tempDay+=0;
						
					System.out.println("The month ending is "+month[n]+" the tempDay is "+tempDay+" and the day is "+day[tempDay]);
				}
				else{
					if (day[tempDay]=="Sunday"){
						yearlySundayCounter++;
					} else yearlySundayCounter+=0;
					System.out.println("The temDay number is "+tempDay+" I am in the Regular February loop!");
					tempDay+=28%7;
					if (tempDay>6){
						tempDay-=7;
					} else tempDay+=0;
						
					System.out.println("The month ending is "+month[n]+" the tempDay is "+tempDay+" and the day is "+day[tempDay]);
				}
		}
		 return tempDay;
		
	}
	
	
}
