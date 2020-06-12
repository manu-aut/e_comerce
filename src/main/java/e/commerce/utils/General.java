package e.commerce.utils;

public class General {

	public static String ucFirst(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		} else {
			return str.substring(0, 1).toUpperCase() + str.substring(1);
		}
	}

}
