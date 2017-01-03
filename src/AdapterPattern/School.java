package AdapterPattern;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen pp = new PenAdapter();
		AssignmentWork assignmentWork = new AssignmentWork();
		assignmentWork.setPen(pp);
		assignmentWork.writeAssignment("I'm bit tired to write an assignment");

	}

}
