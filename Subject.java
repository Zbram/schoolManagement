public class Subject {
    private String subjectCode, subjectDescription;
    private double grade;

    public double averageGrade() {
        return 1;
    }

    public double averageGradePerSubjectAndDepartment() {
        return 1;
    }

    public Subject() {
    }

    public Subject(String subjectCode, String subjectDescription, double grade) {
        this.subjectCode = subjectCode;
        this.subjectDescription = subjectDescription;
        this.grade = grade;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Subject [subjectCode=" + subjectCode + ", subjectDescription=" + subjectDescription + ", grade=" + grade
                + "]";
    }

}
