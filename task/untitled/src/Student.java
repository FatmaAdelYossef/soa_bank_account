import java.time.LocalDate;

public class Student {
    //class properties
    private String name;
    private int studentId;
    private int level;
    private double gpa;
    private String major;
    private String email;
    private double attendancePercentage;

    //constructor
    public Student(String name, int studentId, int level,
                   String major, String email,
                   double gpa, double attendancePercentage) {

        setName(name);
        setStudentId(studentId);
        setLevel(level);
        setMajor(major);
        setEmail(email);
        setGpa(gpa);
        setAttendancePercentage(attendancePercentage);
    }
    public Student()
    {

    }
    // setter and getter
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level<=5 && level>0)
            this.level = level;
        else
            System.out.println("level must be from 1 to 5");
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa <=4&& gpa>0)
          this.gpa = gpa;
        else
            System.out.println("GPA must be less than 4.0 ");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@") && email.contains(".com"))
            this.email = email;
        else
            System.out.println("this mail is invaild");
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(double attendancePercentage) {
      if(attendancePercentage <= 100 && attendancePercentage > 0)
          this.attendancePercentage = attendancePercentage;
      else
          System.out.println("percentage must be less than 100 and more than 0");
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //methods
  public boolean  isEligibleForScholarship()
  {
      if(gpa>=3)
          return true;
      else
          return false;
  }
  public boolean isPassed()
  {
      if (gpa>=2 && attendancePercentage>=50)
          return true;
      else
          return false;
  }
  public void printReport() {
      System.out.println("report date: "+LocalDate.now());
      System.out.println("Student name : " + getName());
      System.out.println("major : " + getMajor());
      System.out.println("GPA : " + getGpa());
      System.out.println("Level : " + getLevel());
      System.out.println("Email : "+getEmail());
      System.out.println("Attendance Percentage : "+getAttendancePercentage()+"%");
      if(isPassed())
          System.out.println("This student  passed");
      else
          System.out.println("This student failed ");
      if(isEligibleForScholarship())
          System.out.println("This student is Eligible For Scholarship.");
      else
          System.out.println("This student is  not Eligible For Scholarship.");

  }

}
