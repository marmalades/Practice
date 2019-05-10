package EmailApp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "devcompany.com";

    //Constructor to receive first and last name
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        //Call method asking for the dept - return the dept
        this.department = setDepartment();

        //Call method that returns a random password
        this.password = randomPassword(defaultPasswordLength);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    //Ask for department
    private String setDepartment()
    {
        System.out.println("New worker: " + firstName + ", \nDepartment Codes:" + "\n1 for sales \n2 for development \n3 for accounting \n0 for none\nEnter department code: ");
        Scanner input = new Scanner(System.in);
        int deptSelection = input.nextInt();

        if (deptSelection == 1) {return "sales";}
        else if (deptSelection == 2) {return "development";}
        else if (deptSelection == 3) {return "accounting";}
        else {return "";}
    }

        //Generate random password
    private String randomPassword (int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length]; //can change length to diff req'mnts

        for (int i = 0; i < length; i++) {
            //take random number and multiply passwordSet length casted as an integer
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set mailboxCapacity
        public void setMailboxCapacity(int capacity)
        {
            this.mailboxCapacity = capacity;
        }

        //Set alternateEmail
        public void setAlternateEmail(String alternateEmail)
        {
            this.alternateEmail = alternateEmail;
        }

        public void changePassword(String password)
        {
            this.password = password;
        }

        //getters
        public int getMailboxCapacity() {
            return mailboxCapacity;
        }
        public String getAlternateEmail() {
            return alternateEmail;
        }
        public String getPassword() {
            return password;
        }

        public String showInfo()
        {
            return "\nDISPLAY NAME: " + firstName + lastName +
                    "\nCOMPANY EMAIL: " + email +
                    "\nMAIlBOX CAPACITY: " + mailboxCapacity + "mb";
        }


    }



