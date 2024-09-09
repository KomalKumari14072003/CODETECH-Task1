package codeTech;

import java.util.*;
public class SimpleCalculator {
		
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	char operator;
	int num1,num2;
	System.out.println("Choose an operator :\n1. Sum(+)\n2. Subtraction(-)\n3. Multiplication(*)\n4. Division(/)");
	operator=sc.next().charAt(0);
	System.out.println("Enter First Number: ");
	num1=sc.nextInt();
	System.out.println("Enter Second Number: ");
	num2=sc.nextInt();
	switch(operator) {
	
	//performs addition between numbers
	case '+':
		System.out.println("Sum of two numbers:"+(num1+num2));
		break;
		
	//performs Subtraction between numbers
	case '-':
        System.out.println("Subtraction of two numbers:"+(num1-num2));
        break;
        
    //performs Multiplication between numbers
    case '*':
        System.out.println("Multiplication of two numbers:"+(num1*num2));	
        break;
        
    //performs Division between numbers
    case '/':
        System.out.println("Division of two numbers:"+(num1/num2));   
        break;
        
    default:
    	System.out.println("Invalid operator");
    	break;
	}
	
}

}
