package BuilderDesignPatternCreational;

public class MainClass {

	public static void main(String[] args) {
	
		PhoneBuilder builder = new PhoneBuilder();
		Phone p = builder.setOs("Android").setBattery(2000).getPhone();
		System.out.println(p);
	}

}
