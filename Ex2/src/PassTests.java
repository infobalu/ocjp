// This is pass by value

public class PassTests {
	// Methods to change the current values
	public static void changeInt(int value) {
		value = 55;
	}
	
	public static void changeObjectRef(MyDate ref) {
		ref = new MyDate(1,1,2000);
	}
	
	public static void changeObjectAttr(MyDate ref) {
		ref.setDay(4);
	}
	
	public static void main(String[] args) {
		MyDate date;
		int val;
		
		// Assign the int
		val = 11;
		
		// try to change it
		changeInt(val);
		System.out.println("Int value is: " +  val);
		
		// Assign the date
		date = new MyDate(22,7,1988);
		
		// try to change it
		changeObjectRef(date);
		
		// What is the current value?
		System.out.println("My date:" + "day = " + date.getDay() + 
						" month = " + date.getMonth() + 
						" year = " + date.getYear());
		
		// Now change the day attribute
		changeObjectAttr(date);
		
		// What is the current value?
		System.out.println("My date:" + "day = " + date.getDay() + 
				" month = " + date.getMonth() + 
				" year = " + date.getYear());
				
	}
}
