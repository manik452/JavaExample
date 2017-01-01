package FactoryDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		OperatinSystemFactory operatinSystemFactory = new OperatinSystemFactory();
		Os operatingSystem=operatinSystemFactory.getInstance("window");
		operatingSystem.spec();
		Os iosOperating = operatinSystemFactory.getInstance("ios");
		iosOperating.spec();
		Os androidOperating = operatinSystemFactory.getInstance("fsdf");
		androidOperating.spec();

	}

}
