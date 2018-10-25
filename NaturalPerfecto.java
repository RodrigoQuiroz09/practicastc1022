import java.util.*;
/*Rodrigo Quiroz Reyes
16/10/2018
Exam Excercise P2
*/
public class NaturalPerfecto{
public static void main(String[]args){
	Scanner kb = new Scanner(System.in);
	int num = 0;
	int counter =0;
	int division =0;
	int storage=0;

	System.out.println("Inserte un número");
	num=kb.nextInt();

	for(counter=1;counter<num;counter++)
	{if (num%counter==0){
	storage = storage+counter;}
	//System.out.println(storage);}
	else{}
 }
if(storage==num){
	System.out.println("El número es un natural perfecto");
	}
else System.out.println("El número no es un natural perfecto");
}
}
