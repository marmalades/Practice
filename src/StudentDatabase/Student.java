package StudentDatabase;

import java.util.Scanner;

public class Student
{
    private String firstName;
    private String lastName;
    private int classification;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0; //each course is 600. maybe add credit hours in DB
    private static int costOfCourse = 600;
    private static int ID = 100;

    //Constructor: prompt user to enter student name and year
    public Student()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman \n2 - Sophomore \n3 - Junior \n4 - Senior \nEnter student classification: ");
        this.classification = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + ": " + classification + " " + studentID);

    }

    //Generate an ID
    private void setStudentID()
    {//grade level + ID
        ID++; //increments ID after each user created
        this.studentID = classification + "" + ID; //wont add numbers but will combine Strings thanks to the "" in the concat process
    }

    //Enroll in courses
    public void enroll()
    {
        //get inside a loop, user hits 0 when done enrolling

        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals("Q") && !course.equals("q")) //upper or lower
            {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {break;}
        }while (1 != 0);

        System.out.println("ENROLLED IN: " + courses);
    }

    //View balance
    public void viewBalance()
    {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    //Pay tuition
    public void payTuition ()
    {
        System.out.print("Enter your payment amount: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Your payment of $" + payment + " has been received.");
        viewBalance();
    }
    //Show status
}
