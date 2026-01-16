import java.util.Scanner;
public class Assignment_1201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Positive or Negetive: ");
        int number = sc.nextInt();
        if (number >= 0) {
            System.out.println(number + " is a Positive number.");
        } 
        else if(number == 0){
            System.out.println(number + " number is Zero");
        }
        else {
            System.out.println(number + " is a Negetive number.");
        }

        System.out.print("Enter a year to check Leap year or not: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap year.");
        } else {
            System.out.println(year + " is not a Leap year.");
        }

        System.out.print("Enter a number to check Prime or not: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num ; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime==true){
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }



        System.out.println("Enter Your Number from 1 to 7 to select Day of the Week: ");
		int Day = sc.nextInt();
		
		switch(Day)
		{
			case 1:System.out.println("Sunday");
			break;
			
			case 2:System.out.println("Monday");
			break;
			
			case 3:System.out.println("Tuesday");
			break;

            case 4:System.out.println("Wednesday");
			break;

            case 5:System.out.println("Thursday");
			break;

            case 6:System.out.println("Friday");
			break;

            case 7:System.out.println("Saturday");
			break;
		}
    }
}