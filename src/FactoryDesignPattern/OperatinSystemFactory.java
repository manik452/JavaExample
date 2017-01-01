package FactoryDesignPattern;

public class OperatinSystemFactory {

	public Os getInstance(String name) {
		if("window".equals(name)){
			return new Window();
		}else if("ios".equals(name)){
			return new Ios();
		}else{
			return new Android();
		}
	}
}
