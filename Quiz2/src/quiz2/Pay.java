package quiz2;
import java.math.*;
public class Pay {
	public static double CarCost=0;
	public static double InterestRate=0;
	public static int Time=0;
	public static double DownPay=0;
	
	public Pay(double carCost, double interestRate, int time, double downPay) {
		super();
		CarCost = carCost;
		InterestRate = interestRate;
		Time = time;
		DownPay = downPay;
	}
	
	public static double MonthPay() {
		 double a;
		//a is interest rate divided by months
		 a = (InterestRate/100)/12;
		 System.out.println(a);
		double b= Math.pow(a+1, Time);
		double c=1- 1/b;
		
		double d = a *(CarCost-DownPay);
		double MonthPay=d/c;
		
		return MonthPay;
	}
	
	public static double TotalPay() {
		double a;
		//a is interest rate divided by months
		 a = (InterestRate/100)/12;
		double b= Math.pow(a+1, Time);
		double c=1- 1/b;
		double d = a *(CarCost-DownPay);
		double MonthPay=d/c;
		double TotalPay=  MonthPay*Time;
		return TotalPay;
	
	}
	
		
		
	}
		
		
		
	
		
		
		

	
	


