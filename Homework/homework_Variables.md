All the answers you will find under the document Variables.java

Task 1: Read & Memorize
Carefully read and memorize the following topics:
What is a Variable in Java
Difference between Declaration and Initialization
The 8 Primitive Data Types and their sizes (byte, short, int, long, float, double, char, boolean)
Reference / Object Data Types (e.g., String)
Default values of variables (instance vs local)
Types of Variables:
Local Variables
Instance Variables
Static (Class) Variables
Rules & Conventions for:
Variable naming (camelCase)
Constants (using the `final` keyword and UPPER_SNAKE_CASE)
Difference between:
Primitive types vs Reference types

=================================================

Task 2: Write in Your Own Words
Write short notes (3–5 lines each):
What is the difference between declaring a variable and initializing a variable?
Why do local variables need to be initialized before use, but instance variables do not?
What is the difference between primitive data types and reference data types?

=================================================

Task 3: WHAT-IF SCENARIOS PRACTICE
For each case:
Write the code
Compile it
Run it (if possible)
Write:
✔ Output OR
❌ Error message (exact)

🔹 Case 1: Using an uninitialized local variable
public static void main(String[] args) {
    int age;
    System.out.println(age);
}
👉 Write:
Does it compile?
Error message

-------------------------------------------------
🔹 Case 2: Re-declaring a local variable in the same scope
public static void main(String[] args) {
    int score = 10;
    int score = 20;
}
👉 Write:
Error message

-------------------------------------------------
🔹 Case 3: Using access modifiers (public/private/protected) for a local variable
public static void main(String[] args) {
    public int myNumber = 50;
}
👉 Write:
Error message

-------------------------------------------------
🔹 Case 4: Using 'static' keyword for a local variable
public static void main(String[] args) {
    static int myCount = 100;
}
👉 Write:
Error message

-------------------------------------------------
🔹 Case 5: Accessing non-static (instance) variable directly from static context
class Test {
    int count = 5;
    public static void main(String[] args) {
        System.out.println(count);
    }
}
👉 Write:
Error message

-------------------------------------------------
🔹 Case 6: Accessing non-static variable using an object
class Test {
    int count = 5;
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.count);
    }
}
👉 Write:
Output

-------------------------------------------------
🔹 Case 7: Accessing static variable directly vs via object
class Test {
    static int total = 100;
    public static void main(String[] args) {
        System.out.println(Test.total);
        Test obj = new Test();
        System.out.println(obj.total);
    }
}
👉 Write:
Output (Does it compile and run?)

-------------------------------------------------
🔹 Case 8: Shadowing static variable with a local variable
class Test {
    static int x = 10;
    public static void main(String[] args) {
        int x = 20;
        System.out.println(x);
        System.out.println(Test.x);
    }
}
👉 Write:
Output

-------------------------------------------------
🔹 Case 9: Printing uninitialized instance variable and static variable
class Test {
    int number;
    static boolean flag;
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.number);
        System.out.println(flag);
    }
}
👉 Write:
Output

-------------------------------------------------
🔹 Case 10: Assigning a decimal value to an int
public static void main(String[] args) {
    int price = 19.99;
}
👉 Write:
Compile error

-------------------------------------------------
🔹 Case 11: Missing 'f' or 'F' for a float literal
public static void main(String[] args) {
    float temperature = 98.6;
}
👉 Write:
Error message

-------------------------------------------------
🔹 Case 12: Assigning a number to a boolean
public static void main(String[] args) {
    boolean isTrue = 1;
}
👉 Write:
Error message

-------------------------------------------------
🔹 Case 13: Assigning char with double quotes
public static void main(String[] args) {
    char letter = "A";
}
👉 Write:
Error message
