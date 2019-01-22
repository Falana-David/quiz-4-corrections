# quiz-4-corrections
Q1: I keep getting an error message telling me that my method must return a value of type double. What's wrong with my code? 


public double randomNumber(int seed) {
    if (seed > 1000) {
        return Math.random() * seed;
    } else if (seed > 500) { 
        return Math.random() * seed * -1;
    }
}

My Answer: Math.random returns a value of type int. You need to cast it to a double. 


Correct Answer: For seed values less than or equal to 500, the method does not return a value. 


Why It's Correct: The statement does not have anything for if seed is less than 500. This would have the compiler bring up an issue because there is nothing for the program to print if seed was a value that is less than 500. This is why the compiler says that it must return a value.


Q2: I want to print each character of a String one-by-one on a separate line. The number of characters in the String is unknown. You may assume the String is stored in a variable called str. How can I do this? Select all that apply.


My Answer: 

for (int i = 1; i <= str.length(); i++) {
    System.out.println(str.charAt(i));
}


Correct Answer: 

int i = 0;
int length = str.length();

while (i < length) {
    System.out.println(str.charAt(i));
}


Why It's Correct: It is correct because int i says that it will start at index 0. While length stores the value of the length of the string. The while loop test to see if there are any characters in the string. Since this is true it prints out every character starting at index 0 for the string.


Q7: What are the values of sub1 and sub2 after running this code?

String s = "abcdefg";
String sub1 = s.substring(s.indexOf("c"));
String sub2 = s.substring(s.indexOf("e"), s.indexOf("g"));


My Answer: c and efg


Correct Answer: cdefg and ef


Why It's Correct: This is correct because the first substring chooses a starting value at c, but not specifies an ending value so it would take c and everything after it. While for the second substring it takes characters between e and g. This is why the correct answer is cdefg and ef.Since it chooses g it takes the value before it.

Q9: From the perspective of what is output to the console, what is the difference between the three ways in which the method is called?


Consider the following method definition.

public static void saySomething(String something) {
    System.out.println(something);
}
Now, consider the following usages of this method.

saySomething("hello, there.");        // first usage

String message = "hello, there.";     // second usage
saySomething(message);

String something = "hello, there.";   // third usage
saySomething(something);


My Answer: The second and third usages will fail because the method has already been called with the argument "hello, world."


Correct Answer: There is no difference. 


Why It's Correct: There is no diffrence between the three ways the method is called. This is because they are all print statements. They all do the same thing.


Q11: Which single line of code will adequately complete this method?

Consider the following requirements for a method I need to write.

Accepts a single parameter
If that parameter is a whole number, return the parameter unchanged.
If that parameter contains a fractional component, return the next largest whole number.
Here's my method definition.

public double mystery(double x) {

}


My Answer: return Math.round(x); and return Math.floor(x);


Correct Answer: return Math.ceil(x);


Why It's Correct: The Math.ceil() function returns the smallest integer greater than or equal to a given number. Because ceil() is a static method of Math, you always use it as Math.ceil(), rather than as a method of a Math object you created (Math is not a constructor).


Q12: When writing a method, you must always include a(n) SELECT , a(n) SELECT  , and the method name (in that order). Together, this is known as the method's method identifier .


My Answer: static identifier and return type and method identifier 


Correct Answer: access modifier and return type and method signature 


Why It's Correct: It is correct because when writing a method you must always include a acess modifer and a return type. When these things are together it is known as a method signature.


Q13: Which of the following are valid access modifiers for methods in Java? Select all that apply.


My Answer: static and public and private


Correct Answer: default and public and protected and private


Why It's Correct: There are four access modifiers within the context of methods, and they serve to dictate from where in the application the method is visible.

public
private
protected
default
