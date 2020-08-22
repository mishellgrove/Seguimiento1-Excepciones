package exceptions;

public class IdNoMatchException extends Exception {
	private double day;
	private double digit;

	public IdNoMatchException(double day, double digit){
		super ("your ID ends in a number that is not allowed today");

	}

	public double getDay() {
		return day;
	}

	public void setDay(double day) {
		this.day = day;
	}

	public double getDigit() {
		return digit;
	}

	public void setDigit(double digit) {
		this.digit = digit;
	}
	

}
