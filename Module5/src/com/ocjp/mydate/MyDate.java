package com.ocjp.mydate;


public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		
	}
	
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}

	public boolean setDay(int day) {
		
		if (this.year == 0 || this.month == 0) {
			System.out.println("Please set year and month first");
			return false;
		}

		int maxDays = maxMonthDays(this.month);
		
		if (day > maxDays || day <= 0) {
			System.out.println("Invalid day!");
			return false;
		}
		
		this.day = day;
		return true;
	}

	public boolean setMonth(int month) {
		if (this.year == 0) {
			System.out.println("Please set year first");
			return false;
		}
		
		if (month > 12 || month <= 0) {
			System.out.println("Invalid month");
			return false;
		}
		
		this.month = month;
		return true;
	}
	
	private int maxMonthDays(int month) {
		int maxDays = 0;
		
		if (this.month == 2 ) {
			if ((this.year % 4 == 0)
					&& (this.year % 100 != 0 || this.year % 400 == 0 )){
				maxDays = 28;
			}
		} else if (this.month == 4 || this.month == 6 
				|| this.month == 9 || this.month == 11) {
			maxDays = 30;
		} else {
			maxDays = 31;
		}
		return maxDays;
	}

	
	public boolean setYear(int year) {
		if ( year <= 0 ) {
			System.out.println("Invalid year");
			return false;
		}
		this.year = year;
		return true;
	}

	// Extra method!
	public boolean addDay(int days) {
		int newMonth = this.getMonth();
		int newdays = this.getDay();
		
		if (this.getDay() == 0
			|| this.getMonth() == 0
			|| this.getYear() == 0) {
			System.out.println("Problem, year, month or day invalid");
			return false;
		}
		
		newdays = newdays + days;
		
		if( newdays > maxMonthDays(this.getMonth()) ) {
			newMonth = newMonth + 1;
			if (newMonth > 12) {
				// Months
				newMonth = 1;
				this.setMonth(newMonth);
				
				// Years
				this.setYear(this.getYear() + 1);
				
				// Days
				newdays = newdays - maxMonthDays(this.getMonth());
				this.setDay(newdays);
			} else {
				// Months
				this.setMonth(newMonth);
				
				// Days
				newdays = newdays - maxMonthDays(this.getMonth());
				this.setDay(newdays);
			}
		} else {
			// Days
			this.setDay(newdays);
		}
			
		
		return true;
		
		// algorithm
		
//		newdays = days + this days
//		if newdays > monthdays
//		month + 1 && newdays = newdays - maxdayspermonth
//		if month dec 31
//		year + 1 next month and newdays
	}
}

