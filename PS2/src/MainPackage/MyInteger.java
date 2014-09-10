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
	
	public boolean IsOdd(int value){
		return (value % 2 != 0);
	}
	
	public boolean IsEven(int value){
		return (value % 2 == 0);
	}
	
	public boolean IsPrime(int value){
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

	public boolean equal(int value){
		return this.value == value;
	}
	
	public static boolean equal(MyInteger MyInt){
		return MyInt.value == MyInt.value;
	}
	
//_________________________________________
	
	public static int parselInt(char[] a){
		for(int i = 0; i < (a.length -1) ; i++){
			
		}
	return a.length;
	}
	
	public static int ParselInt(String a){
		int b = Integer.parseInt(a);
		return b;
		
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
	System.out.println(IsEven(odd));
	System.out.println(IsPrime(even));*/
}
}