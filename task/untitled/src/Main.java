import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("choose task from list : ");
            System.out.println("1.student class. ");
            System.out.println("2.shape class. ");
            System.out.println("3.Playable class. ");
            System.out.println("4.exit");

            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("invalid choice please enter a number: ");
                input.nextLine();
                continue;
            }

            if (choice == 1) {
                Student student = new Student();

                System.out.println("please enter full name: ");
                String name = input.nextLine();
                student.setName(name);

                System.out.println("please enter id: ");
                int id = input.nextInt();
                student.setStudentId(id);

                System.out.println("please enter level: ");
                int level = input.nextInt();
                student.setLevel(level);
                input.nextLine();

                System.out.println("please enter email: ");
                String email = input.nextLine();
                student.setEmail(email);

                System.out.println("please enter gpa: ");
                double gpa = input.nextDouble();
                student.setGpa(gpa);
                input.nextLine();

                System.out.println("please enter department: ");
                String department = input.nextLine();
                student.setMajor(department);

                System.out.println("please enter Attendance Percentage: ");
                double attendancePercentage = input.nextDouble();
                student.setAttendancePercentage(attendancePercentage);
                System.out.println("***********************************************");
                student.printReport();
            }
            else if(choice == 2)
            {
                System.out.println("choose shape :-");
                System.out.println("1.Circle\n2.Rectanle\n3.Triangle");
                int shape=input.nextInt();
                input.nextLine();
                if(shape==1){
                    System.out.println("enter redus: ");
                    double redus = input.nextDouble();

                    input.nextLine();

                    System.out.println("enter color: ");
                    String color = input.nextLine();

                    Circle circle = new Circle(color, redus);
                    System.out.println("The area of " + color + " circle is : " + circle.area());

                }else if(shape==2)
                {
                    System.out.println("enter length: ");
                    double length=input.nextDouble();
                    input.nextLine();
                    System.out.println("enter width: ");
                    double width =input.nextDouble();
                    input.nextLine();

                    System.out.println("enter color: ");
                    String color=input.nextLine();

                    Rectangle rectangle=new Rectangle(color,length,width);
                    System.out.println("The area of "+color+" rectangle is : "+rectangle.area());
                }
                else if(shape==3)
                {
                    System.out.println("enter base: ");
                    double base=input.nextDouble();
                    input.nextLine();

                    System.out.println("enter height: ");
                    double height =input.nextDouble();
                    input.nextLine();

                    System.out.println("enter color: ");
                    String color=input.nextLine();

                    Triangle triangle=new Triangle(color,height,base);
                    System.out.println("The area of "+color+" Triangle is : "+triangle.area());
                }

            }
            else if (choice == 3) {
                System.out.println("Choose Instrument: 1.Guitar  2.Piano");
                int instChoice = input.nextInt();

                Playable myInstrument; // بنعرف متغير من نوع الـ Interface

                if (instChoice == 1) {
                    myInstrument = new Guitar();
                } else {
                    myInstrument = new Piano();
                }

                myInstrument.play(); // هينادي الـ play الخاصة بالنوع اللي اخترته
            }

        } while (choice != 4);

        input.close();
    }
}