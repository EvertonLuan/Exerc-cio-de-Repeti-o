import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
	

		Scanner leitor = new Scanner(System.in);
		
		int num, cont = 1, m = 0;
		
		
		while (cont < 15) {
			System.out.printf("Digite um %d� n�mero: ", cont);
			num = leitor.nextInt();
			cont++;
			
		if (num > m) {
			m = num;
		}
	
			}
		System.out.println("O maior n�mero digitado foi o: "+m);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
