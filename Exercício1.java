import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		
		
	Scanner leitor = new Scanner(System.in);
	
	int num, cont = 1;
	
	
	while (cont != 11) {
		System.out.printf("Digite o %d� n�mero: ", cont);
		num = leitor.nextInt();
		
		cont++;
		
		if (num >= 0) {
			System.out.println("- Positivo");
			
		}else{
			System.out.println("-Negativo");
		
		}
		
		
		
		
		
		
		
	}
		
	
	
	
	
	
	
		
	}

}
