import java.util.ArrayList;

public class ReportCard {

    /* initialise varaibles in ReportCard and assign scores*/
    private String studentName = "Mike Jones, Sola Judge, Kevin Smart, Bola Tinubu, Tunde Badmus";
    private int mathGrade = 80;
    private int englishGrade = 90;
    private double historyGrade = 60.5;
    private int biologyGrade = 80;
    private double frenchGrade = 70.5;

     /* Get studentName */
    public String getStudentName()
    {
        return studentName;
    }

    /* Get mathGrade */
    public int getMathGrade()
    {
    return mathGrade;
}

    /* Get englishGrade */
    public int getEnglishGrade() {

    return englishGrade;
}

    /* Get historyGrade */
    public double getHistoryGrade() {
        return historyGrade;
    }

    /* Get biologyGrade */
    public int getBiologyGrade() {
        return biologyGrade;
    }

    /* Get frenchGrade */
    public double getFrenchGrade() {
        return frenchGrade;
    }

  /* return studentNames */

    public void setStudentNames(String studentName) {
        this.studentName = studentName;
    }

    /*Return mathGrade */
    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    /*return englishGrade */
    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    /*Return historyGrade */
    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = historyGrade;
    }

    /*Return biologyGrade */
    public void setBiologyGrade(int biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    /*Return frenchGrade */
    public void setFrenchGrade(int frenchGrade) {
        this.frenchGrade = frenchGrade;
    }

    /* Constructor for creating a ReportCard object
    @param studentName
    @param mathsGrade
    @param englishGrade
    @param historyGrade
    @param biologyGrade
    @param frenchGrade
     */
    public ReportCard(String mstudentName, int mmathGrade, int menglishGrade, int mhistoryGrade, int mbiologyGrade, int mfrenchGrade){

          this.studentName = mstudentName;
           this.mathGrade = mmathGrade;
           this.englishGrade = menglishGrade;
           this.historyGrade = mhistoryGrade;
           this.biologyGrade = mbiologyGrade;
           this.frenchGrade = mfrenchGrade;
    }


    @Override
    public String toString() {

        /* create an ArrayList of ReportCard objects */
        ArrayList <String> reportcard = new ArrayList <String>();

        reportcard.add (0, "Mike Jones, MathsGrade: 60,English grade: 67, History grade: 50.5, Biology grade:80, French grade: 80.5 ");
        reportcard.add (1, "Sola Judge, MathsGrade: 50,English grade: 70, History grade: 60.6, Biology grade: 75, French grade: 70.5 ");
        reportcard.add (2, "Kevin Smart, MathsGrade: 70,English grade: 60, History grade: 70, Biology grade: 65, French grade: 80 ");
        reportcard.add (3, "Bola Tinubu, MathsGrade: 75,English grade: 77, History grade: 76, Biology grade: 55, French grade: 60 ");
        reportcard.add (4, "Tunde Badmus, MathsGrade: 80,English grade: 78, History grade: 89, Biology grade: 65, French grade: 55 ");

        for(int index = 0; index < 5; index ++) {

        }

        return super.toString ();
    }



}