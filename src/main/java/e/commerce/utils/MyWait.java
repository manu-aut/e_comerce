package e.commerce.utils;

import static java.util.Calendar.MILLISECOND;
import static java.util.Calendar.SECOND;
import static java.util.Calendar.getInstance;

import java.util.Calendar;
import java.util.Date;

public class MyWait {

	public static void inMilliseconds(int milliseconds) {
		Calendar calendar = getInstance();
		Date hora = new Date();
		calendar.setTime(hora);
		if (milliseconds >= 1000) {
			calendar.add(SECOND, (milliseconds / 1000));
		} else if (milliseconds < 1000) {
			calendar.add(MILLISECOND, (milliseconds));
		}
		while (hora.compareTo(calendar.getTime()) < 0) {
			hora = new Date();

		}
	}
}
