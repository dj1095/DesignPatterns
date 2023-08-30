package object.oriented.design.examples.parkinglot.utils;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Random;

public class Utils {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int MAX_TICKET_LENGTH = 5;
    private static SecureRandom random = new SecureRandom();


    public static String generateNewTicketNumber() {
        StringBuilder stringBuilder = new StringBuilder(MAX_TICKET_LENGTH);
        for (int i = 0; i < MAX_TICKET_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }
        return stringBuilder.toString();
    }

}
