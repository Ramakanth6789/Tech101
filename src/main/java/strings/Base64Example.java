package strings;

import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello, Java 8!";

        // Encoding the string
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Encoded: " + encodedString);

        // Decoding the encoded string
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded: " + decodedString);
    }
}
