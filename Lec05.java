//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lec05 {
            public static void main(String[] args) {
                // Step 2: Test User Class
                User user = new User("Sylvester",1946, 12, 25 );

                user.displayInfo();
                user.displayHappyBirthday();
                User john = new User("John", 1954, 2 ,18);

                john.displayInfo();
                john.displayHappyBirthday();

                Admin nicolas = new Admin("Nicholas", 1964, 12,25);
                nicolas.displayInfo();
                nicolas.displayInfo(true);
                nicolas.displayInfo(false);
                nicolas.displayHappyBirthday();

        }

    }
