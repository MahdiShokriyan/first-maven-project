package tek.intro.lab_session;

import java.util.ArrayList;
import java.util.Random;

public class num {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate 10 random digits and concatenate them to form a 10-digit number
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int digit = random.nextInt(10); // Generate a random digit between 0 and 9
            sb.append(digit);
        }

        // Convert StringBuilder to String
        String randomNumber = sb.toString();

        System.out.println(randomNumber);








    }
}
