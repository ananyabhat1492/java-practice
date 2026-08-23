package coreJava;

public class StringExample {
    public static void main(String[] args) {
        /* String Example */
        String str = "Hello";
        System.out.println("Original String: " + str);

        // Concatenating a new string to the original string
        str = str + " World";
        System.out.println("Modified String (using String): " + str);

        // StringBuffer Example
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + stringBuffer);

        // Appending a new string to the original StringBuffer
        stringBuffer.append(" World");
        System.out.println("Modified StringBuffer: " + stringBuffer);

        // StringBuilder Example
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + stringBuilder);

        // Appending a new string to the original StringBuilder
        stringBuilder.append(" World");
        System.out.println("Modified StringBuilder: " + stringBuilder);

        //String Format
        String formattedString = String.format("Hello, %s! Welcome to %s.", "Friend", "HungryCoders.com");
        System.out.println(formattedString); //Hello, Friend! Welcome to HungryCoders.com.
    }
}
