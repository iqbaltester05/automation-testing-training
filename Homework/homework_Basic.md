All the answers you will find under the document Basic.java

Task 1: Read & Memorize
Carefully read and memorize the following topics:
What is Java
What is a Class
What are Keywords
What are Identifiers
Rules for:
Class names
Identifiers
Variables
Methods
Difference between:
print() vs println() vs printf()
Main method and its purpose
Java execution flow

=================================================

Task 2: Write in Your Own Words
Write short notes (3–5 lines each):
What is a class?
Why Java uses main() method?
What happens if main() is missing?
What is an identifier?
Why keywords cannot be used as variable names?

=================================================

Task 3: WHAT-IF SCENARIOS PRACTICE
For each case:
Write the code
Compile it
Run it (if possible)
Write:
✔ Output OR
❌ Error message (exact)

Case 1: Class without main method
class Test {
}
👉 Write:
Does it compile?
What happens on run?
-------------------------------------------------
🔹 Case 2: Multiple classes in one file
class A {
    public static void main(String[] args) {
        System.out.println("A");
    }
}

class B {
    public static void main(String[] args) {
        System.out.println("B");
    }
}
👉 Run both:
Output of java A
Output of java B
-------------------------------------------------
🔹 Case 3: Two public classes
public class A {}
public class B {}

👉 Write:
Compile error
-------------------------------------------------
🔹 Case 4: Same class name
class Test {}
class Test {}
👉 Write:
Error message
-------------------------------------------------
🔹 Case 5: Identifier starting with number
int 1age = 10;
👉 Write:
Error
-------------------------------------------------
🔹 Case 6: Using keyword as variable
int class = 10;
👉 Write:
Error
-------------------------------------------------
🔹 Case 7: print() without argument
System.out.print();
👉 Write:
Error
-------------------------------------------------
🔹 Case 8: println() without argument
System.out.println();
👉 Write:
Output
-------------------------------------------------
🔹 Case 9: Wrong main method
public static void main()
👉 Write:
Error
-------------------------------------------------
🔹 Case 10: File name mismatch
public class A {}
(File name: Test.java)
👉 Write:
Error