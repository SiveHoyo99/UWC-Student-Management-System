
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
    public void setFullName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Name cannot be empty");
            return;
        }
        this.fullName = name;
    }
    public void setCourse(String course) {
          if (course == null || course.trim().isEmpty()) {
            System.out.println("Error: Course cannot be empty");
            return;
        }
        this.course = course;
    }
    public void setYearOfStudy(int yearOfStudy) {
        if (yearOfStudy < 4) {
            System.out.println("Error: Year of study should be at least 4 digit");
            return;
        }
        this.yearOfStudy = yearOfStudy;
    }
    public void setAverageMark(double averageMark) {
        if (averageMark < 0) {
            System.out.println("Error: Average mark cannot be negative.");
            return;
        }
        this.averageMark = averageMark;
    }
    public void setTotalFees(double totalFees) {
        if (totalFees < 0) {
            System.out.println("Error: Total fees cannot be less than zero");
            return;
        }
        this.totalFees = totalFees;
    }
    public void setFeesPaid(double feesPaid) {
        if (feesPaid < 0) {
            System.out.println("Error: Fees paid cannot be less than zero.");
            return;
        }
        this.feesPaid = feesPaid;
    }
    public void setRegistered(boolean registered) {
        this.registered =registered;
    }
}
