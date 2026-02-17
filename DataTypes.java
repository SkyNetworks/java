public class DataTypes {   // Class name. Every Java program must be inside a class.

    public static void main(String[] args) {  // 
        // Integer types

        byte classroomStudents = 40; 
        // byte = very small whole number
        // memory: 1 byte (8 bits)
        // range: -128 to 127
        // use when values are small (like number of students, age of kids, small counters)
        // saves memory in large applications

        short roomNumber = 120; 
        // short = small integer but bigger than byte
        // memory: 2 bytes
        // range: -32,768 to 32,767
        // used when numbers are bigger than byte but still not very large
        // example: room number, small IDs

        int age = 21; 
        // int = normal integer 
        // memory: 4 bytes
        // range: about -2 billion to +2 billion
        // used for marks, age, loops, counting, indexing arrays
        // whenever you write a number in Java, compiler assumes int by default

        long population = 14000000000L; 
        // long = very large integer
        // memory: 8 bytes
        // used when int is not big enough
        // example: population, distance in meters, large database IDs
        

        // Decimal types

        float height = 5.7f; 
        // float = decimal number
        // memory: 4 bytes
        // used in graphics, games, measurements where exact precision not critical
        // IMPORTANT: 'f' required or Java thinks it is double

        double piValue = 3.1415926535; 
        // double = decimal number 
        // memory: 8 bytes
        // used in scientific calculation, banking, physics, precise measurements
        // Java uses double as default decimal type

        // Character

        char grade = 'A'; 
        // char = stores only ONE character
        // memory: 2 bytes
        // must use single quotes
        // examples: 'A', 'B', '1', '@'
        // used for grades, gender (M/F), menu choices

        // Boolean

        boolean isPassed = true; 
        // boolean = only true or false
        // memory: 1 bit (logical value)
        // used in decision making
        // examples: login success, light on/off, payment done, user verified

        // Non-Primitive (Reference type)

        String name = "Rahul"; 
        // String = collection of characters (text/word/sentence)
        // not primitive → it is an object
        // stored in heap memory
        // used for names, passwords, messages, user input

        // Printing all values

        System.out.println("Name: " + name); 
        // + is called concatenation → joins text and variable

        System.out.println("Students in class: " + classroomStudents);

        System.out.println("Room Number: " + roomNumber);

        System.out.println("Age: " + age);

        System.out.println("Population: " + population);

        System.out.println("Height: " + height);

        System.out.println("PI value: " + piValue);

        System.out.println("Grade: " + grade);

        System.out.println("Passed: " + isPassed);
    }
}
