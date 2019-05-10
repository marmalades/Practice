package StudentDatabase;

import java.util.Scanner;

public class Student
{
    private String firstName;
    private String lastName;
    private int classification;
    private int studentID;
    private String courses;
    private int tuitionBalance; //each course is 600. maybe add credit hours in DB
    private int costOfCourse = 600;


    //Constructor: prompt user to enter student name and year
    public Student ()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman \n2 - Sophomore \n3 - Junior \n4 - Senior \nEnter student classification: ");
        this.classification = in.nextInt();

        System.out.println();

    }

    //Generate an ID

    //Enroll in courses

    //View balance

    //Pay tuition

    //Show status
}
