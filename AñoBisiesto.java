import java.util.*;
/*Rodrigo Quiroz Reyes
16/10/2018
Exam Excercise P2
*/
public class A�oBisiesto{
public static void main(String[]args){
	Scanner kb = new Scanner(System.in);
	int a�o = 0;

	System.out.println("Inserte un a�o");
	a�o=kb.nextInt();

	if (((a�o%4==0)&&(a�o%100!=0))||((a�o%400==0))){
		System.out.println("El a�o es bisiesto");
		}
	else {System.out.println("El a�o no es bisiesto");}



}
}


