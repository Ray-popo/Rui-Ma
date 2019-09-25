import java.util.Scanner;

public class gradingProgram{

	private int quiz1;
    private int quiz2;
    private int quiz3; 
    private int midterm;
    private int exam;

    public void studentScore(){   
        quiz1 = 0;
        quiz2 = 0;
        quiz3 = 0;
        midterm = 0;
        exam = 0;        
    }        
    
    public void studentScore(int q1, int q2, int q3, int mt, int ex){   
        midterm = mt;
        exam = ex;
        /*There are three quizzes, 
        each graded on the basis of 10 points.
        There is one midterm exam, graded on the basis of 100 points.
		There is one final exam, graded on the basis of 100 points.
		*/

        if(q1 > 10 || q1 < 0){    
            System.out.println("Invalid quiz1 score");
            System.exit(0);
        }
        else
        {
            quiz1 = q1;
        }
        if(q2 > 10 || q2 < 0){    
            System.out.println("Invalid quiz2 score");
            System.exit(0);
        }
        else
        {
            quiz2 = q2;
        }   
        if(q3 > 10 || q3 < 0){    
            System.out.println("Invalid quiz3 score");
            System.exit(0);
        }
        else
        {
            quiz3 = q3;
        }
        if(mt > 100|| mt<0){
            System.out.println("Invalid midterm score");
            System.exit(0); 
        }
        else
        {
            midterm = mt;
        }
        if(ex > 100||ex<0){
            System.out.println("Invalid final Exam score");
            System.exit(0); 
        }
        else
        {
            exam = ex;
        }     
    }
    
    public double getQuizGrade(){
        return(((quiz1 + quiz2 + quiz3) / 3) * 0.25);
    }
    
    public double getMidterm(){
        return (midterm * 0.35);
    }
    
    public double getExam(){
        return (exam * 0.4);
    }
    
    public double finalGrade(){   
        
        return (getQuizGrade() + getMidterm() + getExam()); 
    }
    
    public String finalletterGrade(double numericScore)
    {
        if (numericScore >= 90)
        {
            return "A";
        }
        else if (numericScore < 90 && numericScore >= 80)
        {
            return "B";
        }
        else if (numericScore < 80 && numericScore >= 70)
        {
            return "C";
        }
        else if (numericScore < 70 && numericScore >= 60)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }

    public String toString(){
        double numericScore = finalGrade();
        return("Student's Score: "
        	+"\nQuiz 1: " + quiz1 
        	+"\nQuiz 2: " + quiz2 
        	+"\nQuiz 3: " + quiz3 
        	+"\nMidterm: " + midterm 
        	+"\nFinal Exam:  " + exam
            +"\nNumeric Score: " + numericScore
            +"\nLetter Grade: " + finalletterGrade(numericScore));
    } 
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("first quiz: ");
        int quiz1 = input.nextInt();
       
       System.out.println("second quiz: ");
       int  quiz2 = input.nextInt();
       
       System.out.println("third quiz: ");
        int quiz3 = input.nextInt();
       
       System.out.println("Midterm: ");
        int midterm = input.nextInt();
       
       System.out.println("Final Exam: ");
        int exam = input.nextInt();

       studentScore newGrade = new studentScore(quiz1, quiz2, quiz3, midterm, exam);
       System.out.println(); 
       System.out.println(newGrade);
        
       
    }  
}



