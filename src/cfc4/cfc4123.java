package cfc4;
import java.util.Scanner;
public class cfc4123
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner miScanner = new Scanner (System.in);
		double num1,num2;
		System.out.print("Introduzca Primer Numero: ");
		num1=miScanner.nextDouble();
		System.out.print("Introduzca Segundo Numero: ");
		num2=miScanner.nextDouble();
		System.out.print("Ingrese 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir: ");
		{
		int x= miScanner.nextInt();
		if (x==1)
		{
		System.out.print("La Suma Es: ");
		System.out.println(num1+num2);
		}
		{
		if (x==2)
		System.out.print("La Resta Es: ");
		System.out.println(num1-num2);
		{
		if (x==3);
		}
		System.out.print("La Multiplicacion Es: ");
		System.out.println(num1*num2);
		}
		if (x==4);
		{
		System.out.print("La Division Es: ");
		System.out.println(num1/num2);
		}
		}
	}
}