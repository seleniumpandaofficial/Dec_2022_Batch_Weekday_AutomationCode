package java_code_march_march_29th_2023;

public class WrapperClass_Part2 {

	public static void main(String[] args) {
		String S1 = "100";
		System.out.println(S1);
		String S2 = "20";
		System.out.println(S1 + S2);
		
		//you need to convert this String value to int value
	int iValue = 	Integer.parseInt(S1);
	System.out.println(iValue + 200);    //300
	
	//converting String to double
	String S3 = " 11.22";
	double dValue = Double.parseDouble(S3);
	System.out.println(dValue + 10.10);
	
	//String to boolean
	String S4 = "false";
	boolean boValue = Boolean.parseBoolean(S4);
	System.out.println(boValue != true);
	
	//String to character - HomeWork
	
	//String to integer if the String is Alphanumeric
	
	String S5 = "250B";
	int anValue = Integer.parseInt(S5);
	System.out.println(anValue);
	

	}

}
