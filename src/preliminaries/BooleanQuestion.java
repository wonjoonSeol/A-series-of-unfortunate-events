package preliminaries;


public class BooleanQuestion extends Question { // this has changed. Now inherits from question.

	private boolean answer;
	
	public BooleanQuestion(boolean answer, int mark) {
		
		super(mark);				// now uses superclass constructor to save mark
		this.answer = answer;
		
	}
	
	public boolean lookAtAnswer() {
		
		return answer;
		
	}
	
}
