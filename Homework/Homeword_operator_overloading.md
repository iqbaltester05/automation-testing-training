All the answers you will find under the topic of Operator Overloading in Java.

Task 1: Read & Memorize
Carefully read and memorize the following topics:
What is Operator Overloading?
Does Java support custom Operator Overloading? (Hint: No, unlike C++, Java does not allow developers to overload operators for custom classes to keep the language simple).
The one exception: The `+` operator.
How the `+` operator acts as an Arithmetic Addition operator.
How the `+` operator acts as a String Concatenation operator.
Order of Execution: Evaluated from left to right.
What happens when you add characters (`char`) using the `+` operator.

=================================================

Task 2: Write in Your Own Words
Write short notes (3–5 lines each):
Why doesn't Java support operator overloading for custom classes?
Explain the dual role of the `+` operator in Java.
What is the difference between `10 + 20 + " Hello"` and `"Hello " + 10 + 20`? Why do they yield different results?
What happens if you try to use the `-` or `*` operator on a `String`?

=================================================

Task 3: WHAT-IF SCENARIOS PRACTICE
For each case:
Write the code
Compile it
Run it (if possible)
Write:
✔ Output OR
❌ Error message (exact)

🔹 Case 1: Arithmetic Addition
public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println(a + b);
}
👉 Write:
Output

-------------------------------------------------
🔹 Case 2: String Concatenation
public static void main(String[] args) {
    String x = "Hello";
    String y = "World";
    System.out.println(x + y);
}
👉 Write:
Output

-------------------------------------------------
🔹 Case 3: Number + String
public static void main(String[] args) {
    int a = 50;
    String b = " Apples";
    System.out.println(a + b);
}
👉 Write:
Output

-------------------------------------------------
🔹 Case 4: String + Number + Number (Left to Right Evaluation)
public static void main(String[] args) {
    System.out.println("Result: " + 10 + 20);
}
👉 Write:
Output

-------------------------------------------------
🔹 Case 5: Number + Number + String (Left to Right Evaluation)
public static void main(String[] args) {
    System.out.println(10 + 20 + " is the Result");
}
👉 Write:
Output

-------------------------------------------------
🔹 Case 6: Parentheses altering evaluation order
public static void main(String[] args) {
    System.out.println("Result: " + (10 + 20));
}
👉 Write:
Output

-------------------------------------------------
🔹 Case 7: Char + Char (Hint: Check ASCII values)
public static void main(String[] args) {
    char a = 'A';
    char b = 'B';
    System.out.println(a + b);
}
👉 Write:
Output

-------------------------------------------------
🔹 Case 8: Char + String
public static void main(String[] args) {
    char a = 'A';
    String b = "pple";
    System.out.println(a + b);
}
👉 Write:
Output

-------------------------------------------------
🔹 Case 9: Using other operators on Strings
public static void main(String[] args) {
    String name = "Java";
    System.out.println(name * 3);
}
👉 Write:
Compile error

-------------------------------------------------
🔹 Case 10: Compound Assignment with Concatenation
public static void main(String[] args) {
    String text = "Java";
    text += " Programming";
    System.out.println(text);
}
👉 Write:
Output