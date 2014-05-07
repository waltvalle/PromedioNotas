import java.util.Scanner;

public class Miclase {

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.print("Ingrese nota1: ");
		int nota1= s.nextInt();
		
		System.out.print("Ingrese nota2: ");
		int nota2= s.nextInt();
		
		System.out.print("Ingrese nota3: ");
		int nota3= s.nextInt();
		
		int promedio= (nota1+nota2+nota3)/3;
		System.out.print("Promedio: "+promedio);
	}

}
