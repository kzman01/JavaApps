package studentdbapp;

import java.util.Scanner;

/**
 *
 * @author kzimmerman
 */
public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costofCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Student first name:");
        this.firstName = in.nextLine();

        System.out.print("Enter Student last name:");
        this.lastName = in.nextLine();

        System.out.print("1-Freshman\n2-Sophomore\n3-Junior\n4-Senior\nEnter student class level:");
        this.gradeYear = in.nextInt();
        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    // Generate and ID
    private void setStudentID() {
        //Grade level + id
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        //Get inside a loop, user hits Q to exit enrollment
        do{
            System.out.println("Enter course to enroll-History101,English101,Math101 (Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costofCourse;
            }
            else {break;}
            
            }while (1 !=0);
        
            System.out.println("ENROLLED IN: " + courses );
            System.out.println("TUITION BALANCE: " + tuitionBalance);
        }
    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    // Pay tuition
    public void payTuition(){
        System.out.println("Enter your payment: $");
       Scanner in = new Scanner (System.in);
       int payment = in.nextInt();
       tuitionBalance = tuitionBalance - payment; 
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
        
    }
    // Show status
    public String toString(){
    return "Name:" + firstName + " " + lastName + 
            "\nCourse Enrolled In:" + courses + 
            "\nBalance: $" + tuitionBalance;
    }
}
