package data;

import java.util.Random;

public class Constants {
    public static final String URL = "https://magento.softwaretestingboard.com/";
    public static final String FIRS_NAME = "Jack";
    public static final String LAST_NAME = "Moris";
    public static final String EMAIL = generateNewEmail();
    public static final String PASSWORD = "Qmoris321!";
    public static final String CONFIRM_PASSWORD = "Qmoris321!";


    public static String generateNewEmail() {
        Random random = new Random();
        int number = random.nextInt(10000000);
        return "j.Moris" + number + "@gmail.com";
    }


}
