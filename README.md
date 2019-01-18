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


Why It's Correct:


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


Why It;s Correct:


Q7: What are the values of sub1 and sub2 after running this code?

String s = "abcdefg";
String sub1 = s.substring(s.indexOf("c"));
String sub2 = s.substring(s.indexOf("e"), s.indexOf("g"));


My Answer: c and efg


Correct Answer: cdefg and ef


Why It's Correct: 

