
public class comnov2 {
	
	//1. keywords/reserved words
	//2. datatypes = defines the type and size of the data
	//2.5 types of datatypes(8 in total) = byte(8 bits = 1 byte) ex. "byte number1=127;" range is -128 to 127
	//2.5 byte,short,char,int,long,double,float,boolean
	//2.5 short(2 bytes) ex = "short num2=250;" range is -250 to 250
	//2.5 char(2 bytes) ex = "char num3=99;" holds a single character (default value is space)
	//2.5 int(4 bytes) ex = "int num4=10;"
	//2.5 long(8 bytes) ex = "long num5=100;"
	//2.5 double(8 bytes) ex = "double salary=1000.20;"
	//2.5 float(4 bytes) ex = "float empSalary=2000.34f;" without the "f" at the end, it would function as a double
	//2.5 boolean(8 bytes) ex = "boolean check=true/false;" a logical representation, if there is no value assigned, it is false
	//3. variables and structure/syntax
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java") ;
		
		byte num1=127;
		
		short num2=100; 
		
		char num3=99;
		System.out.println(num3) ;
		
		int num4=10;
		
		long num5=100;
		
		double salary=1000.10;
		
		float empSalary=2000.34f;
		
		boolean check=true; 
		
		num2=num1;
		num1=(byte)num2;  //type casting
		System.out.println("num2 value:"+num2);
		
		}
}


