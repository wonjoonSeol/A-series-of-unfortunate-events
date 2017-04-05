package preliminaries;


public class Marker {

	public int markAttempt(Exam examAttempt, Exam markScheme) {
		
		if ( examAttempt.lookAtQuestion1Answer() == markScheme.lookAtQuestion1Answer() ) {
			
			examAttempt.giveMarkQuestion1(markScheme.getMarkQuestion1());
			
		} else if ( examAttempt.lookAtQuestion1Answer() == markScheme.lookAtQuestion1Answer() - 1 
				 || examAttempt.lookAtQuestion1Answer() == markScheme.lookAtQuestion1Answer() + 1  ) {
			
			examAttempt.giveMarkQuestion1((markScheme.getMarkQuestion1() - 1));
			
		} else if ( examAttempt.lookAtQuestion1Answer() >= markScheme.lookAtQuestion1Answer() - 5 
				 && examAttempt.lookAtQuestion1Answer() <= markScheme.lookAtQuestion1Answer() + 5  ) {
		
			examAttempt.giveMarkQuestion1(1);
		
		} else {
			
			examAttempt.giveMarkQuestion1(0);
			
		}
		
		if ( examAttempt.lookAtQuestion2Answer() == markScheme.lookAtQuestion2Answer() ) {
			
			examAttempt.giveMarkQuestion2(markScheme.getMarkQuestion2());
			
		} else {
			
			examAttempt.giveMarkQuestion2(0);
			
		}
		
		if ( examAttempt.lookAtQuestion3().lookAtOption1Answer() == markScheme.lookAtQuestion3().lookAtOption1Answer() ) {
			
			examAttempt.lookAtQuestion3().giveMark(examAttempt.lookAtQuestion3().readMark() + 1);
	
		}
		
	    if ( examAttempt.lookAtQuestion3().lookAtOption2Answer() == markScheme.lookAtQuestion3().lookAtOption2Answer() ) {
			
			examAttempt.lookAtQuestion3().giveMark(examAttempt.lookAtQuestion3().readMark() + 1);
			
		}
		
	    if ( examAttempt.lookAtQuestion3().lookAtOption3Answer() == markScheme.lookAtQuestion3().lookAtOption3Answer() ) {
			
			examAttempt.lookAtQuestion3().giveMark(examAttempt.lookAtQuestion3().readMark() + 1);
			
		}
	    
	    int totalMark = examAttempt.getMarkQuestion1()+ examAttempt.getMarkQuestion2() + examAttempt.lookAtQuestion3().readMark();
	    		
	    examAttempt.writeTotalMark(totalMark);
	    
	    return totalMark;
	    
	}
	
	public double convertMarksToClassification(int mark, int firstBoundary, int upperSecondBoundary, int lowerSecondBoundary) {
		
		if ( mark >= firstBoundary ) {
			
			return 1.1;
			
		} else if ( mark >= upperSecondBoundary ) {
			
			return 2.1;
			
		} else if ( mark >= lowerSecondBoundary ) {
			
			return 2.2;
			
		} else {
			
			return 0.0;
			
		}
	
	}
	
}
