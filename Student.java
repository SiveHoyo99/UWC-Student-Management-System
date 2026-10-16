
public class Student {
    
    private final String studentNumber;
    private String fullName;
    private String course;
    private int yearOfStudy;
    private double averageMark;
    private double totalFees;
    private double outstandingFees;
    private boolean registered;
  

    public Student(
    String studentNumber,
    String fullName,
    String course,
    int yearOfStudy,
    double averageMark,
    double totalFees,
    double outstandingFees
    boolean registered
    ) {
        this.studentNumber = studentNumber;
        this.fullName = fullName;
        this.course = course;
        this.yearOfStudy = yearOfStudy;
        this.averageMark =averageMark;
        this.totalFees = totalFees;
        this.outstandingFees = outstandingFees;
        this.registered = registered;
    }

    //access methods
    public String getStudentNumber() {return this.studentNumber;}
    public String getFullName() {return this.fullName;}
    public String getCourse() {return this.course;}
    public int getYearOfStudy() {return this.yearOfStudy;}
    public double getAverageMark() {return this.averageMark;}
    public double getTotalFees() {return this.totalFees;}
    public double getOutstandingFees() {return this.outstandingFees;}
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
    //Fix this logic
    public void setOutstandingFees(double outstandingFees) {
        if (feesPaid < 0) {
            System.out.println("Error: Fees paid cannot be less than zero.");
            return;
        }
        this.outstandingFees = outstandingFees;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    //Instance methods

    public String calculateAcademicStatus(double averageMark) {
        String status;

        if(averageMark >= 75) {
            status = "Dean's Merit List";
        }
        else if (averageMark >= 70) {
            status = "Excellent";
        }
        else if (averageMark >= 60) {
            status = "Adequate";
        }
        else if (averageMark >= 50) {
            status = "Pass";
        }
        else {
            status = "At Risk";
        }
        return status;
    }
   
    public boolean recordPayment(double totalFees, double amount) {
        if (amount < 0) {
            System.out.println("Invalid payment! You cannot pay a negative amount.")
            return false;
        }
        outstandingFees - amount;
        return true;
    }

    public void displayStudentDetails() {
        System.out.println("\n========================================");
        System.out.println("               STUDENT PROFILE            ");
        System.out.println("\n========================================");
        System.out.println("Student Number      : " + this.studentNumber);
        System.out.println("Full Name       : " + this.fullName);
        System.out.println("Course      : " + this.course);
        System.out.println("Year of Study       : " + this.yearOfStudy);
        System.out.println("Average Mark        : " + this.averageMark);
        System.out.println();
        System.out.printf("Total Fees      : R%.2f", this.totalFees);
        System.out.printf("Outstanding fees     : ", outstandingFees);
        System.out.println("Registered      : " this.registered);
    }


}
