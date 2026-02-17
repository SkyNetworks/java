public class Operators {

    public static void main(String[] args) {

        // ---------------- ARITHMETIC OPERATORS ----------------
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b)); 
        

        System.out.println("Subtraction: " + (a - b)); 
       

        System.out.println("Multiplication: " + (a * b)); 
     

        System.out.println("Division: " + (a / b)); 
        // / divides → 10 / 3 = 3
        // int/int removes decimal (called integer division)

        System.out.println("Modulus: " + (a % b)); 
        // % gives remainder → 10 % 3 = 1
        



        // ---------------- RELATIONAL OPERATORS ----------------
        int x = 20;
        int y = 15;

        System.out.println("x > y : " + (x > y));
        // > greater than → true if left bigger

        System.out.println("x < y : " + (x < y));
        // < less than → true if left smaller

        System.out.println("x >= y : " + (x >= y));
        // >= greater or equal

        System.out.println("x <= y : " + (x <= y));
        // <= less or equal

        System.out.println("x == y : " + (x == y));
        // == checks values equal or not (comparison)
        // NOT assignment

        System.out.println("x != y : " + (x != y));
        // != not equal



        // ---------------- LOGICAL OPERATORS ----------------
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("AND (&&): " + (condition1 && condition2));
        // && true only if BOTH true

        System.out.println("OR (||): " + (condition1 || condition2));
        // || true if ANY one true

        System.out.println("NOT (!): " + (!condition1));
        // ! reverses value → true becomes false



        // ---------------- ASSIGNMENT OPERATORS ----------------
        int num = 5;

        num += 3;
        System.out.println("num += 3 : " + num);
        //  num = num + 3

        num -= 2;
        System.out.println("num -= 2 : " + num);
        // num = num - 2

        num *= 4;
        System.out.println("num *= 4 : " + num);
        //  num = num * 4

        num /= 2;
        System.out.println("num /= 2 : " + num);
        //  num = num / 2



        // ---------------- UNARY OPERATORS ----------------
        int i = 5;

        System.out.println("Post Increment i++ : " + (i++));
        //  prints 5, then increases to 6

        System.out.println("After Post Increment : " + i);
        

        System.out.println("Pre Increment ++i : " + (++i));
        

        System.out.println("Pre Decrement --i : " + (--i));
       


    
        // ---------------- BITWISE OPERATORS ----------------
         a = 5;   // binary: 00000101
         b = 3;   // binary: 00000011

        System.out.println("a & b = " + (a & b));
        // & (bitwise AND)
        // 00000101
        // 00000011
        // --------
        // 00000001  -> 1
        // both bits must be 1

        System.out.println("a | b = " + (a | b));
        // | (bitwise OR)
        // if any bit is 1 -> result 1
        // result: 7

        System.out.println("a ^ b = " + (a ^ b));
        // ^ (XOR)
        // different bits -> 1
        // same bits -> 0
        // result: 6

        System.out.println("~a = " + (~a));
        // ~ (bitwise NOT)
        // flips all bits
        // converts 5 into negative number (-6)
        // used in low level programming

        System.out.println("a << 1 = " + (a << 1));
        // left shift
        // shifts bits left (multiply by 2)
        // 5 << 1 = 10

        System.out.println("a >> 1 = " + (a >> 1));
        // right shift
        // shifts bits right (divide by 2)
        // 5 >> 1 = 2



        // ---------------- TERNARY OPERATOR ----------------
        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";
        // syntax:
        // condition ? value_if_true : value_if_false
        // shortcut of if-else

        System.out.println("Person is: " + result);



        // another example
        int number = 7;

        String evenOdd = (number % 2 == 0) ? "Even Number" : "Odd Number";
        // if number divisible by 2 -> even
        // else odd

        System.out.println(number + " is " + evenOdd);

    

    }
}
