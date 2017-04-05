package preliminaries;


public class Exam {
	
	private NumericalQuestion question1;
	private BooleanQuestion question2;
	private MultipleChoiceQuestion question3;
	private int totalMark;
	
	public Exam(NumericalQuestion question1, BooleanQuestion question2, MultipleChoiceQuestion question3, int totalMark) {
		
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.totalMark = totalMark;
		
	}
	
	public int lookAtQuestion1Answer() {
		
		return question1.lookAtAnswer();
		
	}
	
	public int getMarkQuestion1(){
		return question1.readMark();
	}

	public void giveMarkQuestion1(int mark){
		question1.giveMark(mark);
	}
	
	public boolean lookAtQuestion2Answer() {
		
		return question2.lookAtAnswer();
		
	}

	public int getMarkQuestion2() {
		
		return question2.readMark();
		
	}
	
	public void giveMarkQuestion2(int mark){
		question2.giveMark(mark);
	}
	
	public MultipleChoiceQuestion lookAtQuestion3() {
		
		return question3;		// errors are reduced to a single error.
		
	}
	
	public void writeTotalMark(int totalMark) {
		
		this.totalMark = totalMark;
				
	}
	
	public int readTotalMark() {
		
		return totalMark;
		
	}

}
