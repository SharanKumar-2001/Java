package com;

public class FlipMessage {

    public static String flipMessage(String input1) {
        StringBuilder decodedMessage = new StringBuilder();

        for (char ch : input1.toCharArray()) {
            // Flip lowercase characters
            if (ch >= 'a' && ch <= 'z') {
                char flippedChar = (char) ('a' + ('z' - ch));
                decodedMessage.append(flippedChar);
            }
            // Flip uppercase characters
            else if (ch >= 'A' && ch <= 'Z') {
                char flippedChar = (char) ('A' + ('Z' - ch));
                decodedMessage.append(flippedChar);
            } 
            // Keep non-alphabetic characters the same
            else {
                decodedMessage.append(ch);
            }
        }

        return decodedMessage.toString();
    }

    public static void main(String[] args) {
        FlipMessage fMessage = new FlipMessage();
        String input1 = "xyz";
        String result = FlipMessage.flipMessage(input1);
        System.out.println(result);  // Output should be "cba"
    }
}



//package com.jdbc;
//public class FlipMessage {
//
//    public static String flipMessage(String input1) {
//        StringBuilder decodedMessage = new StringBuilder();
//
//        for (char ch : input1.toCharArray()) {
//            // Flip the character
//            char flippedChar = (char) ('a' + ('z' - ch));
//            decodedMessage.append(flippedChar);
//        }
//
//        return decodedMessage.toString();
//    }
//
//    public static void main(String[] args) {
//    	FlipMessage fMessage=new FlipMessage();
//        String input1 = "xyz";
//        String result = flipMessage(input1);
//        System.out.println(result);
//        // Output should be "cba"
//    }
//}
