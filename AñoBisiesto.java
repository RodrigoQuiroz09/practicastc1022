import java.util.*;
/*Rodrigo Quiroz Reyes
16/10/2018
Exam Excercise P2
*/
public class AñoBisiesto{
public static void main(String[]args){
	Scanner kb = new Scanner(System.in);
	int año = 0;

	System.out.println("Inserte un año");
	año=kb.nextInt();

	if (((año%4==0)&&(año%100!=0))||((año%400==0))){
		System.out.println("El año es bisiesto");
		}
	else {System.out.println("El año no es bisiesto");}



}
}


