
public class Student {
    //(defining parameter objects using Java records to group related data
    //Speacial type of a class that carries immutable data
    public record PersonalInfo(String studentNumber, String fullName){}
    public record AcademicInfo(String course, int yearOfStudy, double averageMark) {}
    public record FinancialInfo(double totalFees, double feesOwed, boolean registered){}

    private PersonalInfo personalInfo;
    private AcademicInfo academicInfo;
    private FinancialInfo financialInfo;
  

    public Student(PersonalInfo personal, AcademicInfo academic, FinancialInfo financial) {
        this.personalInfo = personal;
        this.academicInfo = academic;
        this.financialInfo = financial;
    }

    //access methods
    public PersonalInfo getPersonalInfo() {
        return this.personalInfo;
    }
    public AcademicInfo getAcademicInfo() {
        return this.academicInfo;
    }
    public FinancialInfo getFinancialInfo() {
        return this.financialInfo;
    }

    
}
