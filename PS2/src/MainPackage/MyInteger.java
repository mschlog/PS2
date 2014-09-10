package MainPackage;

//Matthew Schlogel
//PS2

public class MyInteger {

	private int value;
	
	//Constructor 
	
	public MyInteger(int value){
		this.value = value;
	}
	
	// Get Method
	
	public int GetValue(){
		return this.value;
	}

	//Boolean methods for odd, even, and prime___________________
	
	public boolean IsOdd(){
		return (value % 2 != 0);
	}
	
	public boolean IsEven(){
		return (value % 2 == 0);
	}
	
	public boolean IsPrime(){
		for(int i=2; i <= value/2; i++){
			if(value % i == 0){
				return false;
			}
		}
	return true;
	}
	
	//_________________________
	
	public static boolean IsOdd(MyInteger MyInt){
		return (MyInt.value % 2 != 0);
	}
	
	public static boolean IsEven(MyInteger MyInt){
		return (MyInt.value % 2 == 0);
	}
	
	public static boolean IsPrime(MyInteger MyInt){
		for(int i=2; i <= MyInt.value/2; i++){
			if(MyInt.value % i == 0){
				return false;	
			}
		}
		return true;
	}
//_________________________________________

	public boolean equals(int value){
		return this.value == value;
	}
	
	public boolean equals(MyInteger MyInt){
		return this.value == MyInt.value;
	}
	
//_________________________________________
	
	public static int ParselInt(char[] a){
		int sumvalue=0;
		for(int i = 0;i < a.length;i++){
			sumvalue+=a[i];
		}
	return sumvalue;
	}
	
	//The TA could not figure this out, we tried to work on it but 
	//he asked for the code, and is currently still working on it
	//I sent him my code to play with
	
	public static int ParselInt(String a){
		char[] charArray = a.toCharArray();
		int sumvalue=0;
		int tempvalue=0;
		for(int i = 0;i < charArray.length;i++){
			//tempvalue=(int)charArray[i].intValue();
			//tempvalue=charArray[i];
			sumvalue+=charArray[i];
			System.out.print(tempvalue);
			System.out.println("   ");
		}
		return sumvalue;
	}
	
	//static method parse int --> forloop 0 to array length then sum up number and 
	// return sum
	
	/*
	 * string -- cast a string into an int -- will get a value of each individual
	 * character
	 * 
	 * Encapsulation private attributes public methods
	 */
	
public static void main(String[] args){ 
	MyInteger odd = new MyInteger(5); 
	MyInteger even = new MyInteger(4);
	MyInteger prime = new MyInteger(71);
	/*System.out.println(IsOdd(odd));
	System.out.println(IsEven(even));
	System.out.println(IsPrime(prime));
	System.out.println(IsOdd(even));
	System.out.println(IsEven(odd));*/
	char [] array = {1,2,3};
	String b = "123";
	System.out.println(ParselInt(b));
}
}