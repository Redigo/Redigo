package mytest;

public class javatest {
	public static final String value = "Michiel";

	public static Long StringToLong(String s) {
		Long l = 0L;
		try {
         l = Long.parseLong(s,10);
      } catch (NumberFormatException nfe) {
         System.out.println("NumberFormatException: " + nfe.getMessage());
      }
      return l;
	}
}
