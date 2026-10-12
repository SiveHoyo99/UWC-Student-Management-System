
public class Student {
    
    private final String studentNumber;
    private String fullName;
    private String course;
    private int yearOfStudy;
    private double averageMark;
    private double totalFees;
    private double feesPaid;
    private boolean registered;
  

    public Student(
    String studentNumber,
    String fullName,
    String course,
    int yearOfStudy,
    double averageMark,
    double totalFees,
    double feesPaid,
    boolean registered
    ) {
        this.studentNumber = studentNumber;
        this.fullName = fullName;
        this.course = course;
        this.yearOfStudy = yearOfStudy;
        this.averageMark =averageMark;
        this.totalFees = totalFees;
        this.feesPaid = feesPaid;
        this.registered = registered;
    }

    //access methods
    public String getStudentNumber() {return this.studentNumber;}
    public String getFullName() {return this.fullName;}
    public String getCourse() {return this.course;}
    public int getYearOfStudy() {return this.yearOfStudy;}
    public double getAverageMark() {return this.averageMark;}
    public double getTotalFees() {return this.totalFees;}
    public double getFeesPaid() {return this.feesPaid;}
    public boolean getRegistered() {return this.registered;}

    //Mutator methods

    
}
