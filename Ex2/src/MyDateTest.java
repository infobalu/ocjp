
public class MyDateTest {
	public static void main(String[] args){
		MyDate date = new MyDate();
		//date.day = 32; // Invalid day
		//date.month = 2; // Might be wrong because Feb can be 28
		//date.day = date.day + 1; // Wrong if month change
		
		date.setYear(2000);
		date.setMonth(12);
		date.setDay(31);
		
		date.addDay(2);
		
		System.out.println("year = " + date.getYear() + " month = " + 
				date.getMonth() + " day = " + date.getDay());
		
		date.setYear(2000);
		date.setMonth(2);
		date.setDay(26);
		date.addDay(7);
		
		System.out.println("year = " + date.getYear() + " month = " + 
				date.getMonth() + " day = " + date.getDay());
		
		date.setYear(2012);
		date.setMonth(3);
		date.setDay(16);
		date.addDay(7);
		
		System.out.println("year = " + date.getYear() + " month = " + 
				date.getMonth() + " day = " + date.getDay());
		
		date.setYear(2000);
		date.setMonth(3);
		date.setDay(16);
		date.addDay(7);
		
		System.out.println("year = " + date.getYear() + " month = " + 
				date.getMonth() + " day = " + date.getDay());
	}
}
