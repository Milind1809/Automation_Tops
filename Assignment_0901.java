public class Assignment_0901 {
    public static void main(String[] args) {

        /* 1. Display This Information using println
        a. Your Name
        b. Your Birth date
        c. Your Age
        d. Your Address
         */

        System.out.println("Milind Somaiya");
        System.out.println("18th Sept 1998");
        System.out.println("28");
        System.out.println("C-904, Dwarkadhish heights, Shital Park, Rajkot, 360007");

        //Write a program to make addition, Subtraction, Multiplication and Division of Two Numbers.
        System.out.println("---------------");
        int a = 8;
        int b = 4;
        int sum = a + b;
        int div = a / b;
        int mul = a * b;
        int sub = a - b;
        System.out.println("Sum: " + sum);
        System.out.println("Division: " + div);
        System.out.println("Multiplication: " + mul);
        System.out.println("Subtraction: " + sub);

        //3. Write a program to make a square and cube of number.

        System.out.println("---------------");
        System.out.println("Square of " + a + " is: " + (a * a));
        System.out.println("Cube of " + a + " is: " + (a * a * a));

        //4. Write a program to find the Area of Circle

        float pi = 3.14F;
        int r = 5;
        float area = pi * r * r;
        System.out.println("---------------");
        System.out.println("Area of Circle with radius " + r + " is: " + area);

        //5. Write a program to find the Area of Triangle -> 0.5*a*b
        System.out.println("---------------");
        System.out.println("Area of Triangle with base " + a + " and height " + b + " is: " + (0.5 * a * b));

        //6. Write a program to find the simple Interest.
        System.out.println("---------------");
        int principal = 10000;
        int rate = 5;
        int time = 3;
        float simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);

        //7. Write a program to calculate sum of 5 subjects & find the percentage.
        System.out.println("---------------");
        int Maths = 85;
        int Science = 90;
        int English = 78;
        int History = 88;
        int Geography = 80;
        int totalMarks = Maths + Science + English + History + Geography;
        float percentage = (totalMarks / 500.0f) * 100;
        System.out.println("Percentage is: " + percentage);
    }   
}
