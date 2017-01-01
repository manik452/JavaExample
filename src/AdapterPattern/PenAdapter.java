package AdapterPattern;

public class PenAdapter implements Pen {
	
	PilotPen pilotPen = new PilotPen();

	public void write(String str) {
		// TODO Auto-generated method stub
		pilotPen.mark(str);
	}
	
	

}
