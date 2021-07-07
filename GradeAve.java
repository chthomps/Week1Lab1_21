
public class GradeAve {

	public static void main(String[] args) {
		
		double quizScore1 = 75, quizScore2 = 80, quizScore3 = 85, quizScoreAvg;
		double testScore1 = 75, testScore2 = 80 , testScoreAvg;
		
		quizScoreAvg = (quizScore1 + quizScore2 + quizScore3)/3;
		testScoreAvg = (testScore1 + testScore2)/2;
		
		System.out.println("Test score average is:" +testScoreAvg);
		System.out.println("Quiz score average is:" +quizScoreAvg);
		
		
	}

}
