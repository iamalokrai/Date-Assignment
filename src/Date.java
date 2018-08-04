
//Date class to implement instance variable and members such as finding smaller date etc.
import java.time.*;

public class Date {
	private int d;
	private int m;
	private int y;

	// constructor with parameters
	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}

	// find which date is smaller, passing object
	public boolean isSmaller(Date date) {
		return ((this.y > date.y) ? true
				: (this.y == date.y && this.m > date.m) ? true
						: (this.y == date.y && this.m == date.m && this.d > date.d) ? true : false);

	}

	// method to find difference between dates in terms of days,months and years
	public int[] difference(Date date) {
		int diff[] = new int[3];
		LocalDate date1 = LocalDate.of(date.y, date.m, date.d);
		LocalDate date2 = LocalDate.of(y, m, d);
		// predefined function
		Period period = Period.between(date1, date2);
		diff[0] = period.getDays();
		diff[1] = period.getMonths();
		diff[2] = period.getYears();
		return diff;

	}

	// getter methods to fetch date,month and years
	public int getD() {
		return d;
	}

	public int getM() {
		return d;
	}

	public int getY() {
		return d;
	}

	@Override
	public String toString() {
		return "Date [d=" + d + ", m=" + m + ", y=" + y + "]";
	}

}