import java.util.*;
/*Rodrigo Quiroz Reyes
16/10/2018
Exam Excercise P2
*/
public class CircularPrimojava{
public static void main(String[]args){
	Scanner kb = new Scanner(System.in);
	String num="";
	int storage =0;
	int counter =0;
	String storageS="";
	int length=0;
	int constant=0;
	int divider=0;
	int result=0;
	int counter2=0;
	String notPrime="The number is not prime";
	String prime="The number is prime";
	int circularPrime=0;

	System.out.println("Inserte un número");
	num = kb.next();

	length=num.length();

	for (counter=1;counter<=num.length();counter++){
		System.out.println(num);
		storage=Integer.parseInt(num);
		constant=storage;
		counter2=0;
			for(storage = constant; storage>0;storage--){
			if (storage >0)
			divider++;
			result = constant%(divider);
			if(result ==0)
			counter2++;}

			if(counter2>2)
			System.out.println(notPrime);
			else {System.out.println(prime);
				circularPrime++;}



	num= num.substring(1,length)+num.charAt(0);


		}
if(circularPrime==length){
	System.out.println("El número que insertaste es un circular primo");
	}
else{System.out.println("El número que insertaste no es un circular primo");}
}
}
