import java.time.LocalDate;

class Admin extends User {
    // Default constructor
    public Admin() {
        super();
    }

    // Parameterized constructor
    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    // Override displayInfo to include user type
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin.");
    }

    // Overloaded displayInfo method
    public void displayInfo(boolean full) {
        if (full) {
            super.displayInfo();
            System.out.println("User type: admin.");
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println(" ");
            System.out.println("Name: " + name);
        }
    }

    public void displayHappyBirthday() {
        int currentyear = LocalDate.now().getYear() ;
        int age = currentyear - dob.getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }
}